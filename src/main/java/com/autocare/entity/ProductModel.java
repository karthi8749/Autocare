package com.autocare.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;
import java.util.List;

import com.autocare.util.StringListConverter;

@Entity
@Table(name = "product", schema = "public")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY

    private String category;

    @Column(name = "service_heading")  // Fixing space issue in column name
    private String serviceHeading;

    @Column(name = "service_name")  // Fixing space issue in column name
    private String serviceName;

    private String tag;

    @Column(name = "time_tag")
    private String timeTag;

    private String img;

    @Convert(converter = StringListConverter.class)  // JSON conversion
    @Column(name = "service_info", columnDefinition = "TEXT")
    private List<String> serviceInfo;

    @Convert(converter = StringListConverter.class)
    @Column(name = "service_list", columnDefinition = "TEXT")
    private List<String> serviceList;

    private BigInteger price;  // Using BigInteger for BIGINT in Java

    @Column(name = "original_price")
    private BigInteger originalPrice;
}
