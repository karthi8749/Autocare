package com.autocare.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.autocare.dto.CartItem;
import com.autocare.entity.Purchase;
import com.autocare.repository.PurchaseRepository;
import com.autocare.request.PurchaseRequest;
import com.autocare.response.PurchaseResponse;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.properties.HorizontalAlignment;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;

import java.io.ByteArrayOutputStream;

// import com.itextpdf.kernel.font.PdfFont;
// import com.itextpdf.kernel.font.PdfFontFactory;
// import com.itextpdf.io.font.constants.StandardFonts;
// import com.itextpdf.io.image.ImageData;
// import com.itextpdf.io.image.ImageDataFactory;
// import com.itextpdf.io.font.FontConstants;
// import com.itextpdf.io.font.PdfEncodings;
// import com.itextpdf.io.source.ResourceUtil;

import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.font.*;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import java.io.FileInputStream;

// - Code uses the optional 'PurchaseResponse' class
@Service
public class PurchaseService {
        @Autowired
        private PurchaseRepository purchaseRepository;

        public PurchaseResponse savePurchase(PurchaseRequest request) {
                Purchase purchase = new Purchase();
                purchase.setUserId(request.getUserId());
                purchase.setItems(request.getItems());
                purchase.setTotalAmount(request.getTotal());
                purchase.setPurchaseDate(LocalDateTime.now());

                Purchase savedPurchase = purchaseRepository.save(purchase);
                return new PurchaseResponse(savedPurchase);
        }

        public List<PurchaseResponse> getUserPurchases(Long userId) {
                return purchaseRepository.findByUserId(userId)
                                .stream()
                                .map(PurchaseResponse::new)
                                .collect(Collectors.toList());
        }

        public List<Purchase> findByUserId(Long userId) {
                System.out.println(purchaseRepository.findByUserId(userId));
                return purchaseRepository.findByUserId(userId);
                // throw new UnsupportedOperationException("Unimplemented method 'findByUserId'");
        }

        public ByteArrayResource generateReceipt(Long purchaseId) throws Exception {
                Purchase purchase = purchaseRepository.findById(purchaseId)
                                .orElseThrow(() -> new ResourceNotFoundException("Purchase not found"));

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PdfWriter writer = new PdfWriter(baos);
                PdfDocument pdf = new PdfDocument(writer);
                Document document = new Document(pdf, PageSize.A4);

                // Load custom font
                String fontPath = "src/main/resources/fonts/NotoSans-Regular.ttf";
                PdfFont customFont = PdfFontFactory.createFont(fontPath, PdfEncodings.IDENTITY_H);

                // Load company logo
                String logoPath = "src/main/resources/images/auto.png"; // Ensure file exists
                ImageData logoData = ImageDataFactory.create(logoPath);
                Image logo = new Image(logoData).scaleToFit(150, 80);
                logo.setHorizontalAlignment(HorizontalAlignment.CENTER);

                // Add logo to document
                document.add(logo);

                // Add header
                document.add(new Paragraph("Purchase Receipt")
                                .setFont(customFont)
                                .setFontSize(20)
                                .setBold()
                                .setTextAlignment(TextAlignment.CENTER));

                // Add purchase details
                document.add(new Paragraph("Purchase ID: " + purchase.getId()).setFont(customFont));
                document.add(new Paragraph("Date: " +
                                purchase.getPurchaseDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
                                .setFont(customFont));
                document.add(new Paragraph("User ID: " + purchase.getUserId()).setFont(customFont));

                // Create items table
                Table table = new Table(2);
                table.setWidth(500);

                // Add table headers
                table.addHeaderCell(new Cell().add(new Paragraph("Service").setFont(customFont)));
                table.addHeaderCell(new Cell().add(new Paragraph("Price").setFont(customFont)));

                // Add items
                for (CartItem item : purchase.getItems()) {
                        table.addCell(new Cell().add(new Paragraph(item.getServiceName()).setFont(customFont)));
                        table.addCell(new Cell().add(new Paragraph("₹" + String.format("%.2f", item.getPrice()))
                                        .setFont(customFont)));
                }

                document.add(table);

                // Add total amount
                document.add(new Paragraph("\nTotal Amount: ₹" +
                                String.format("%.2f", purchase.getTotalAmount()))
                                .setFont(customFont)
                                .setBold());

                // Load signature image
                String signaturePath = "src/main/resources/images/signature.png"; // Ensure file exists
                ImageData signatureData = ImageDataFactory.create(signaturePath);
                Image signature = new Image(signatureData).scaleToFit(100, 50);
                signature.setHorizontalAlignment(HorizontalAlignment.RIGHT);

                // Add signature with title
                document.add(new Paragraph("\n\nCEO of AutoCare")
                                .setFont(customFont)
                                .setFontSize(12)
                                .setItalic()
                                .setTextAlignment(TextAlignment.RIGHT));

                document.add(signature);

                document.close();

                return new ByteArrayResource(baos.toByteArray());
        }

}