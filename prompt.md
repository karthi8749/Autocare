# Periodic Services

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Scheduled Packages',        
  'Standard Service',          
  'Recommended',               
  '6 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/service-new-images/Standard%20Service%20Package%20sq.jpg', 
  '["1000 Kms or 1 Month Warranty", "Every 10,000 Kms or 6 Months (Recommended)"]', -- JSON array for service info
  '[
    "Car Scanning", 
    "Wiper Fluid Replacement", 
    "Battery Water Top up", 
    "Car Wash", 
    "Interior Vacuuming (Carpet & Seats)", 
    "Rear Brake Shoes Serviced", 
    "Front Brake Pads Serviced", 
    "Engine Oil Replacement", 
    "Oil Filter Replacement", 
    "Air Filter Replacement", 
    "Fuel Filter Checking", 
    "Coolant Top Up (200 ml)", 
    "Heater/Spark Plugs Checking", 
    "Brake Fluid Top Up", 
    "AC Filter Cleaning"
  ]', -- JSON array for service list
  5527, -- Original price
  3869  -- Discounted price
);


INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Scheduled Packages',        
  'Basic Service',          
  NULL, -- No tag
  '4 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/service-new-images/Basic%20Service%20Package%20sq.jpg', 
  '["1000 Kms or 1 Month Warranty", "Every 5000 Kms or 3 Months (Recommended)"]', -- JSON array for service info
  '[ 
    "Wiper Fluid Replacement", 
    "Battery Water Top Up", 
    "Car Wash", 
    "Interior Vacuuming (Carpet & Seats)", 
    "Engine Oil Replacement", 
    "Oil Filter Replacement", 
    "Air Filter Cleaning", 
    "Coolant Top Up (200 ml)", 
    "Heater/Spark Plugs Checking"
  ]', -- JSON array for service list
  4359, -- Original price
  3269  -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Enhanced Engine Performance',        
  'Comprehensive Service',          
  NULL, -- No tag
  '8 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/service-new-images/Comprehensive%20Service%20Package%202%20sq.jpg', 
  '["1000 Kms or 1 Month Warranty", "Every 20,000 Kms or 12 Months (Recommended)"]', -- JSON array for service info
  '[ 
    "AC Filter Replacement", 
    "Fuel Filter Checking", 
    "Car Scanning", 
    "Wiper Fluid Replacement", 
    "Battery Water Top Up", 
    "Car Wash", 
    "Interior Vacuuming (Carpet & Seats)", 
    "Rear Brake Shoes Serviced", 
    "Front Brake Pads Serviced", 
    "Wheel Balancing (30 gms Weight Included)", 
    "Wheel Alignment", 
    "Tyre Rotation", 
    "Engine Oil Replacement", 
    "Oil Filter Replacement", 
    "Air Filter Replacement", 
    "Throttle Body Cleaning", 
    "Gear Oil Top Up", 
    "Coolant Top Up (200 ml)", 
    "Heater/Spark Plugs Checking", 
    "Brake Fluid Top Up", 
    "Engine Flushing"
  ]', -- JSON array for service list
  8456, -- Original price
  5919  -- Discounted price
);


INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Front Brake Pads',          
  NULL, -- No tag
  '3 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/BrakePads/Front%20Brake%20Pads%20Sq%20(1).jpg', 
  '["1 Month Warranty", "Every 20000 Kms or 12 Months (Recommended)"]', -- JSON array for service info
  '[ 
    "Opening & Fitting of Front Brake Pads", 
    "Front Brake Pads Replacement (OES)", 
    "Applicable for Set of 2 Front Brake Pads", 
    "Inspection of Front Brake Calipers", 
    "Front Brake Disc Cleaning"
  ]', -- JSON array for service list
  2711, -- Original price
  2169  -- Discounted price
);


INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Rear Brake Shoes',          
  'Labour Included', -- Tag extracted as "Labour Included"
  '3 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/BrakePads/Brake%20Shoe%20Thumbnail.jpg', 
  '["1 Month Warranty", "Every 20000 Kms or 12 Months (Recommended)"]', -- JSON array for service info
  '[ 
    "Opening & Fitting of Rear Brake Pads", 
    "Rear Brake Shoes Replacement (OES)", 
    "Applicable for Set of 2 Rear Brake Pads", 
    "Inspection of Rear Brake Calipers", 
    "Rear Brake Disc Cleaning"
  ]', -- JSON array for service list
  3311, -- Original price
  2649  -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Front Brake Discs',          
  NULL, -- No tag present
  '5 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Front%20Disc%20Brake/Thumbnail.jpg', 
  '["1 Month Warranty", "Corrosion Resistance"]', -- JSON array for service info
  '[ 
    "Front Brake Disc Replacement (Single OES Unit)", 
    "Inspection of Brake System Included", 
    "Reduces Vibrations and Brake Noises", 
    "Increases Brake Life & Safety", 
    "Free Pickup & Drop"
  ]', -- JSON array for service list
  2188, -- Original price
  1750  -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Caliper Pin Replacement',         
  'New',  -- Tag present as 'New'
  '6 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomech-assets/Caliper%20Pin%20Replacement/Thumbnail.jpg', 
  '["Recommended: In case of Noise coming from Brakes"]', -- Service info
  '[ 
    "Caliper Pin Replacement (OES)", 
    "Spare Part Price Only", 
    "Caliper Assembly Cost Additional", 
    "Inspection of Brake System Included"
  ]', -- Service list
  1038, -- Original price
  830  -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Disc Turning',         
  NULL,  -- No specific tag provided
  '4 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Overhaul%20Services/Disc%20Turning/disc%20turning.jpg', 
  '["1 Month Warranty on Labour"]', -- Service info
  '[ 
    "Opening & Fitting of Brake Discs", 
    "Inspection of Brake Discs", 
    "Applicable For Set of 2 Discs (2 Wheels)", 
    "Resurfacing of Brake Discs/Rotors"
  ]', -- Service list
  1186, -- Original price
  949  -- Discounted price
);


INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Handbrake Wire Replacement',         
  'New',  -- No specific tag provided
  '4 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Hand%20Brake%20/Thumbnail.jpg', 
  '["Recommended : In Case Handbrake Stops Working"]', -- Service info
  '[ 
    "Handbrake Wire Replacement (Single OES Unit)", 
    "Brake Drum Inspection", 
    "Electronic Parking Brake Cost Additional", 
    "Wheel Cylinder, Ratchet, Clamps Cost Additional", 
    "Free Pickup & Drop"
  ]', -- Service list
  1560, -- Original price
  1170  -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Brake Drums Turning',         
  NULL,  -- No specific tag provided
  '4 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Brake%20Drums/Thumbnail2.jpg', 
  '["1 Month Warranty", "Recommended : In Case of Screeching Noise from Brakes"]', -- Service info
  '[ 
    "Brake Drums Turning", 
    "Opening & Fitting of Brake Drums", 
    "Refacing of Brake Drums", 
    "Applicable for Set of 2 Brake Drums", 
    "Free Pickup & Drop"
  ]', -- Service list
  1311, -- Original price
  1049  -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Wheel Cylinder Replacement',         
  NULL,  -- No specific tag provided
  '6 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/retailservices/wheel%20cylinder%20replacement/thumbnail.jpg', 
  '["Recommended : In case of Poor Braking"]', -- Service info
  '[ 
    "Wheel Cylinder Replacement (OES)", 
    "Spare Part Price Only", 
    "Brake Shoe & Brake Fluid Cost Additional", 
    "Free Pickup & Drop"
  ]', -- Service list
  1226, -- Original price
  981  -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Maintenance',        
  'Brake Drums Turning',         
  NULL,  -- No specific tag provided
  '4 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Brake%20Drums/Thumbnail2.jpg', 
  '["1 Month Warranty", "Recommended : In Case of Screeching Noise from Brakes"]', -- Service info
  '[ 
    "Brake Drums Turning", 
    "Opening & Fitting of Brake Drums", 
    "Refacing of Brake Drums", 
    "Applicable for Set of 2 Brake Drums", 
    "Free Pickup & Drop"
  ]', -- Service list
  1311, -- Original price
  1049  -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Wheel Cylinder Replacement',        
  'Wheel Cylinder Replacement',         
  NULL,  -- No specific tag provided
  '6 Hrs Taken',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/retailservices/wheel%20cylinder%20replacement/thumbnail.jpg', 
  '["Recommended : In case of Poor Braking"]', -- Service info
  '[ 
    "Wheel Cylinder Replacement (OES)", 
    "Spare Part Price Only", 
    "Brake Shoe & Brake Fluid Cost Additional", 
    "Free Pickup & Drop"
  ]', -- Service list
  1226, -- Original price
  981  -- Discounted price
);

# AC Service & Repair

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'Service Packages',        
  'Regular AC Service',          
  'FREE AC UNIT INSPECTION',               
  'Takes 4 hours',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/service-new-images/newB.jpg', 
  '["500 Kms or 1 Month Warranty", "Every 5,000 Kms or 3 Months (Recommended)"]', -- JSON array for service info
  '["AC Vent Cleaning", "AC Inspection", "AC Gas (upto 400 gms)", "Condenser Cleaning", "AC Filter Cleaning"]', -- JSON array for service list
  2999,                     
  2249                       
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'Service Packages',        
  'High Performance AC Service',          
  'Free AC Gas',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/New%20Thumbnail/ac%20High.jpg', 
  '["1,000 kms or 1 Month Warranty", "Every 10,000 Kms or 1 Year (Recommended)"]', -- JSON array for service info
  '["AC Vent Cleaning", "AC Leak Test", "Dashboard Removing Refitting", "Dashboard Cleaning", "AC Gas (Upto 600gms)"]', -- JSON array for service list
  5356,                     
  3749                       
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'AC Fitments',        
  'Cooling Coil Replacement',          
  'BESTSELLER',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/cooling%20coil/Thumbnail.jpg', 
  '["3 Months Warranty"]', -- JSON array for service info
  '["Cooling Coil Replacement (OES)", "Spare Part Cost Only", "AC Pipe, Valve, Sensors Cost Additional", "AC Gas, Compressor Oil Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  4786,                     
  3350                       
);

Sure, here are the PostgreSQL insert queries for each element:

1. **Condenser Replacement**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'AC Fitments',        
  'Condenser Replacement',          
  'Free AC Gas Top Up',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/New%20Thumbnail/Condensor%20Replacement.jpg', 
  '["3 Months Warranty"]', -- JSON array for service info
  '["Condenser Replacement (OES)", "Spare Part Cost Only", "AC Pipe, Valve, Sensors Cost Additional", "AC Gas, Compressor Oil Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  6786,                     
  4750                       
);
```

2. **Compressor Replacement**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'AC Fitments',        
  'Compressor Replacement',          
  'Free Inspection',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Compressor%20Replacement%20Photos/Thumbnail.jpg', 
  '["3 Months Warranty"]', -- JSON array for service info
  '["Compressor Replacement (OES)", "Spare Part Cost Only", "AC Pipe, Valve, Sensors Cost Additional", "AC Gas, Compressor Oil Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  20037,                     
  14026                       
);
```

3. **Heating Coil Replacement**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'AC Fitments',        
  'Heating Coil Replacement',          
  'Spare Part Price Only',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Heating%20Coil%20Replacement/Thumbanil.jpg', 
  '["3 Months Warranty"]', -- JSON array for service info
  '["Heating Coil Replacement (OES)", "Hoses Additional (If Required)", "Spare Part Cost Only", "Coolant and Radiator Flush Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  3979,                     
  2785                       
);
```

4. **V-Belt Replacement**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'AC Fitments',        
  'V-Belt Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/V-Belt%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty"]', -- JSON array for service info
  '["V-Belt Replacement (OES)", "Spare Part Price Only", "Pulleys, Bearing, Timing Cost Additional", "Scanning Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  1319,                     
  1187                       
);
```

5. **AC Blower Motor Replacement**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'AC Fitments',        
  'AC Blower Motor Replacement',          
  'NEW',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/AC%20Blower%20Motor/Thumbnail.jpg', 
  '["1 Month Warranty"]', -- JSON array for service info
  '["AC Blower Motor Replacement (OES)", "Spare Part Price Only", "AC Filter, Vents, Casing Cost Additional", "Wiring Cost Additional (If Needed)", "Free Pickup & Drop"]', -- JSON array for service list
  2689,                     
  2420                       
);
```

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'AC Service and Repair',         
  'Radiator',        
  'Radiator Replacement',          
  'NEW',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Radiator%20Replacement%20Replacement_/thumbnail.jpg', 
  '["1 Month Warranty", "Recommended : In Case of Blockage in the Radiator Vessels"]', 
  '["Radiator Replacement (OES)", "Spare Part Price Only", "Radiator Hoses, Thermostat Valves Cost Additional", "Coolant Cost Additional", "Free Pickup & Drop"]', 
  4835,                     
  4110                       
),
(
  'AC Service and Repair',         
  'Radiator',        
  'Radiator Fan Motor Replacement',          
  'Bestseller in Summer',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Radiator%20Fan%20Motor%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended : In case of Radiator Fan not working"]', 
  '["Radiator Fan Motor Replacement (OES)", "Spare Part Price Only", "Coolant and Radiator Flush Cost Additional", "Free Pickup & Drop"]', 
  5118,                     
  4350                       
),
(
  'AC Service and Repair',         
  'Radiator',        
  'Radiator Flush & Clean',          
  'NEW',               
  'Takes 2 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Radiator%20cleaning/Thumbnail.jpg', 
  '["Protects Radiator from Corrosion", "Free Pickup and Drop"]', 
  '["Coolant Draining", "Radiator Flushing", "Anti - Freeze Coolant Replacement", "Radiator Cleaning", "Coolant Leakage Inspection"]', 
  1811,                     
  1449                       
);


# Batteries

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Batteries',         
  'Amaron',        
  'Amaron (55 Months Warranty)',          
  'Recommended',               
  'Takes 2 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Battery/Amaron/amaron%20go%20new-min.png', 
  '["35 Amp Hour", "55 Months Warranty", "Free of Cost Installation"]', -- JSON array for service info
  '["Free Pickup & Drop", "Free Installation", "Old Battery Price Included", "Available at Doorstep"]', -- JSON array for service list
  4888,                      -- Original price
  4399                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Batteries',         
  'Amaron',        
  'Amaron (66 Months Warranty)',          
  NULL,               
  'Takes 2 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Battery/Amaron/amaron%20go%20new-min.png', 
  '["35 Amp Hour", "66 Months Warranty", "Free of Cost Installation"]', -- JSON array for service info
  '["Free Pickup & Drop", "Free Installation", "Old Battery Price Included", "Available at Doorstep"]', -- JSON array for service list
  5110,                      -- Original price
  4599                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Batteries',         
  'Exide',        
  'Exide (55 Months Warranty)',          
  NULL,               
  'Takes 2 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Battery/Exide/exide%20red%20new-min.png', 
  '["35 Amp Hour", "55 Months Warranty", "Free of Cost Installation"]', -- JSON array for service info
  '["Free Pickup & Drop", "Free Installation", "Old Battery Price Included", "Available at Doorstep"]', -- JSON array for service list
  5110,                      -- Original price
  4599                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Batteries',         
  'Exide',        
  'Exide (66 Months Warranty)',          
  NULL,               
  'Takes 2 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Battery/Exide/exide%20red%20new-min.png', 
  '["35 Amp Hour", "66 Months Warranty", "Free of Cost Installation"]', -- JSON array for service info
  '["Free Pickup & Drop", "Free Installation", "Old Battery Price Included", "Available at Doorstep"]', -- JSON array for service list
  5443,                      -- Original price
  4899                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Batteries',         
  'Alternator',        
  'Alternator Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Alternator%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of frequently Discharging Battery"]', -- JSON array for service info
  '["Alternator Replacement", "Opening & Fitting of Alternator", "Alternator Belt Additional", "Free Pickup & Drop"]', -- JSON array for service list
  11271,                      -- Original price
  9580                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Batteries',         
  'Alternator',        
  'Alternator Repair',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Alternator%20Repair/thumbnail.jpg', 
  '["3 Months Warranty", "Recommended: In Case of frequently Discharging Battery"]', -- JSON array for service info
  '["Alternator Repair", "Opening & Fitting of Alternator", "Alternator Belt Additional", "Free Pickup & Drop"]', -- JSON array for service list
  4529,                      -- Original price
  3850                        -- Discounted price
);

# Tyres & Wheel Care
# Denting & Painting
# Detailing Services
# Car Spa & Cleaning
# Car Inspections
# Windshields & Lights
# Suspension and Fitments

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Steering',        
  'EPS Module Repair',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/EPS%20Module%20Repair/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Hard Steering"]', -- JSON array for service info
  '["EPS Module Repair", "Steering Rack, Steering Motor Additional if Needed", "Torque Sensor Additional if Needed", "Free Pickup & Drop"]', -- JSON array for service list
  5706,                      -- Original price
  4850                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Steering',        
  'Steering Rack Repair',          
  'New',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Steering%20Rack%20Repair/thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Hard Steering"]', -- JSON array for service info
  '["Steering Rack Repair", "Steering Bush Kit, Lathe Work, Wheel Alignment Included", "Steering Rod Resurfacing", "Calibration and Pinion Cost Additional (If Needed)", "Free Pickup & Drop"]', -- JSON array for service list
  4611,                      -- Original price
  4150                        -- Discounted price
);


INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Suspension',        
  'Front Shock Absorber Replacement',          
  'Free Car Wash',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/New%20Thumbnail/front_shokerthumbnail%20(1).jpg', 
  '["1 Month Warranty", "Free Pickup and Drop"]', -- JSON array for service info
  '["Shocker Strut / Damper OES Replacement (Single Unit)", "Spare Part Price Only", "Shocker Mount, Shocker Coil Spring Additional Charges", "Free Pickup & Drop", "Airmatic Shock Absorber Cost Additional (If Applicable)"]', -- JSON array for service list
  3435,                      -- Original price
  2920                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Suspension',        
  'Rear Shock Absorber Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/New%20Thumbnail/RearshockThumbnail%20(1).jpg', 
  '["1 Month Warranty", "Free Pickup and Drop"]', -- JSON array for service info
  '["Shocker Strut / Damper OES Replacement (Single Unit)", "Spare Part Price Only", "Shocker Mount, Shocker Coil Spring Additional Charges", "Free Pickup & Drop", "Airmatic Shock Absorber Cost Additional (If Applicable)"]', -- JSON array for service list
  3058,                      -- Original price
  2599                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Suspension',        
  'Suspension Lower Arm Replacement',          
  'Spare Part Price Only',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Suspension%20Lower%20Arm%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case Vibration in the Steering Wheel"]', -- JSON array for service info
  '["Suspension Lower Arm Replacement (OES Single Unit)", "Complete Suspension Inspection", "Spare Part Price Only", "Wheel Alignment Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  2529,                      -- Original price
  2150                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Suspension',        
  'Link Rod Replacement',          
  'Spare Part Price Only',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Link%20Road%20Replacement/Thumbanil.jpg', 
  '["1 Month Warranty", "Recommended: In Case Loose Steering Wheel"]', -- JSON array for service info
  '["Link Rod Replacement (OES Single Unit)", "Complete Suspension Inspection", "Spare Part Price Only", "Wheel Alignment Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  976,                      -- Original price
  830                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Suspension',        
  'Tie Rod End Replacement',          
  'Spare Part Price Only',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Tie%20Rod%20End%20Replacement/Thumbanil.jpg', 
  '["1 Month Warranty", "Recommended: In case of Vibration in the Steering Wheel"]', -- JSON array for service info
  '["Tie Rod End Replacement (OES)", "Complete Suspension Inspection", "Spare Part Price Only", "Camber Bolt & Wheel Alignment Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  918,                      -- Original price
  780                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Suspension',        
  'Complete Suspension Inspection',          
  NULL,               
  'Takes 4 hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/New%20Thumbnail/Complete%20Suspension%20Inspection.jpg', 
  '["25 Points Check List", "On Suspension Noise (Recommended)"]', -- JSON array for service info
  '["Front Shocker Check", "Rear Shocker Check", "Shocker Mount Check", "Link Rod Inspection", "Jumping Rod Bush Check"]', -- JSON array for service list
  721,                      -- Original price
  649                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Suspension',        
  'Front Shocker Mount Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Front%20Shocker%20Mount%20Replacement/Thumbanil.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Excessive Noise / Vibration from Suspension"]', -- JSON array for service info
  '["Front Shocker Mount Replacement (OES Single Unit)", "Spare Part Price Only", "Shocker Mount Bearing, Cap Cost Additional", "Airmatic Shock Absorber Mount Cost Additional", "Wheel Alignment Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  988,                      -- Original price
  840                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Suspension',        
  'Front Axle Repair',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Front%20Axle%20Repair/Thumbnail.jpg', 
  '["Recommended: In Case of Noise Coming from Suspension", "Recommended: In Case of Excessive Noise / Vibration from Suspension"]', -- JSON array for service info
  '["Front Axle Repair (Single Unit)", "Opening & Fitting of Front Axle", "Includes Replacement of Axle Bearings & Boot", "Wheel Bearing Cost Additional (If Required)", "Free Pickup & Drop"]', -- JSON array for service list
  3118,                      -- Original price
  2650                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Silencer Repair',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Silencer%20Repair/thumbnail.jpg', 
  '["Recommended: In Case of Silencer making Loud Roaring Noise"]', -- JSON array for service info
  '["Underbody Silencer Inspection", "Repair & Welding of Faulty Silencer", "Sensors, Catalytic Convertor Cost Additional (If Applicable)", "Hanger, Clamp Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  1166,                      -- Original price
  1049                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Premium Top Wash',          
  NULL,               
  'Revitalize Your Ride in Just 1 Hour',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/retailservices/Foam_Wash_Thumbnail.jpg', 
  '["Pickup Charges Additional in Invoice", "Applicable on Walk-in Only"]', -- JSON array for service info
  '["Exterior Top Wash", "Rinsing", "Hand Drying", "Tyre external wash"]', -- JSON array for service list
  997,                      -- Original price
  299                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Radiator Replacement',          
  'Spare Part Price Only',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Radiator%20Replacement%20Replacement_/thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Blockage in the Radiator Vessels"]', -- JSON array for service info
  '["Radiator Replacement (OES)", "Spare Part Price Only", "Radiator Hoses, Thermostat Valves Cost Additional", "Coolant Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  4835,                      -- Original price
  4110                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Gear Box Mounting Replacement',          
  'Spare Part Price Only',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Gear%20Box%20Mounting%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Noise from Engine"]', -- JSON array for service info
  '["Gear Box Mounting Replacement (OES)", "Spare Part Price Only", "Single Unit Only", "Free Pickup & Drop"]', -- JSON array for service list
  1500,                      -- Original price
  1350                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Engine Mounting Replacement',          
  'Spare Part Price Only',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Engine%20Mounting%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Noise from Engine"]', -- JSON array for service info
  '["Engine Mounting Replacement (OES)", "Spare Part Price Only", "Single Unit Only", "Free Pickup & Drop"]', -- JSON array for service list
  3728,                      -- Original price
  3355                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Fuel Pump Replacement',          
  'Spare Part Price Only',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Fuel%20Replacement%20Pump/thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Car Jerking while Accelerating"]', -- JSON array for service info
  '["Fuel Pump Assy. Replacement", "OES Spare Part Cost Only", "Fuel Line & Injectors Cleaning Cost Additional (If Needed)", "Fuel Pipes Cost Additional (If Needed)", "Free Pickup & Drop"]', -- JSON array for service list
  5778,                      -- Original price
  5200                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Radiator Fan Motor Replacement',          
  'Bestseller in Summer',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Radiator%20Fan%20Motor%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In case of Radiator Fan not working"]', -- JSON array for service info
  '["Radiator Fan Motor Replacement (OES)", "Spare Part Price Only", "Coolant and Radiator Flush Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  5118,                      -- Original price
  4350                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Water Pump Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Water%20Pump%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In case of Engine Overheating"]', -- JSON array for service info
  '["Water Pump Replacement (OES)", "Spare Part Cost Only", "Coolant and Radiator Flush Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  7174,                      -- Original price
  6098                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'ECM Repair',          
  NULL,               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/ECM%20Repair/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In case of Car Not Starting"]', -- JSON array for service info
  '["ECM Repair", "Repairing of Electrical Circuits with Diodes & Capacitor", "Opening & Fitting of ECM", "Circuit Board & Programming Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  7294,                      -- Original price
  6200                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Car Wash & Wax',          
  NULL,               
  'Takes 3 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/services_icon/carwashwax_thumbnail.jpg', 
  '["Maintains Car Shine", "Recommended Every 2 Months"]', -- JSON array for service info
  '["Car Wash", "Interior Vacuuming", "Dashboard and Tyre Polish", "Body Wax"]', -- JSON array for service list
  3663,                      -- Original price
  1099                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Dickey Shocker Replacement',          
  NULL,               
  'Takes 2 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Dickey%20Shocker/Thumbnail.jpg', 
  '["1 Month Warranty"]', -- JSON array for service info
  '["Dickey Shocker OES Replacement (Set of 2)", "Opening & Fitting of Dickey Shocker", "Boot / Trunk Hinges Additional", "Free Pickup & Drop"]', -- JSON array for service list
  1278,                      -- Original price
  1150                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Starter Motor Repair',          
  NULL,               
  'Takes 5 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Stater%20Motor/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Car Not Starting"]', -- JSON array for service info
  '["Starter Motor Repair", "Opening & Fitting of Starter Motor", "Armature Additional if Required", "Free Pickup & Drop"]', -- JSON array for service list
  3059,                      -- Original price
  2600                        -- Discounted price
);

Here are the extracted data entries in the required format:

1. **Mud Flaps**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Mud Flaps',          
  NULL,               
  'Takes 2 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/New%20Thumbnail/Mud%20Flaps.jpg', 
  '["1 Month Warranty on Fitting", "Excellent Durability"]', -- JSON array for service info
  '["Mud Flaps Set of 4", "Prevents Soil Accumulation", "Protects Car Underbody", "Easy Fitment"]', -- JSON array for service list
  1000,                      -- Original price
  850                        -- Discounted price
);
```

2. **Door Latch Replacement**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Door Latch Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Inner%20Door%20handle%20Latch/Thumbnail%20Interior%20Door%20Latch%20Replacement.jpeg', 
  '["1 Month Warranty", "Recommended: In Case of Door Not Opening"]', -- JSON array for service info
  '["Inner Door Latch Mechanism Part Replacement", "OES Spare Part Cost Only", "Outside Door Handle Cost Additional (If Needed)", "Paint/Trim Cost Additional (If Needed)", "Free Pickup & Drop"]', -- JSON array for service list
  1422,                      -- Original price
  1280                        -- Discounted price
);
```

3. **Power Window Repair**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Fitments',        
  'Power Window Repair',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Power%20Window%20Repair/thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Window Not Working"]', -- JSON array for service info
  '["Power Window Mechanism Repair", "Power Window Motor Cost Additional", "Power Window Switch Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  1388,                      -- Original price
  1249                        -- Discounted price
);
```

Here are the extracted data entries in the required format:

1. **Noises with Car Suspension & Steering**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Custom Issues',        
  'Noises with Car Suspension & Steering',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/CUSTOM%20SERVICES/Noises%20With%20Car%20Suspension%20_%20Steering.jpg', 
  '["Recommended: In Case of Noise Coming from Suspension"]', -- JSON array for service info
  '["Steering System Inspection", "Complete Suspension Inspection", "25 Points Check-List", "Free Pickup & Drop"]', -- JSON array for service list
  832,                      -- Original price
  649                        -- Discounted price
);
```

2. **Faulty Electricals**

```sql
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Suspension and Fitments',         
  'Custom Issues',        
  'Faulty Electricals',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/CUSTOM%20SERVICES/Faulty%20Electricals.jpg', 
  '["Recommended: In Case of Electrical Malfunctioning"]', -- JSON array for service info
  '["Full Car Scanning", "25 Points Check-List", "Detailed Health Card", "Free Pickup & Drop"]', -- JSON array for service list
  854,                      -- Original price
  649                        -- Discounted price
);
```

If you need any further adjustments or additional data, feel free to let me know!


# Clutch & Body Parts

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Clutch',        
  'Clutch Set Replacement',          
  'FREE 50 POINT INSPECTION',               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Clutch%20Service/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Hard Clutch & Pickup Issue"]', -- JSON array for service info
  '["Clutch Set OES (Clutch Plate + Pressure Plate) Replacement", "Spare Part Price Only", "Clutch Cable / Wire, Release Bearing / Clutch Cylinder, Flywheel, Slave Cylinder in Add Ons", "Clutch Oil, Gear Oil Cost Additional", "Automatic Transmission Clutch rates may vary", "Free Pickup & Drop"]', -- JSON array for service list
  6705,                      -- Original price
  5699                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Clutch',        
  'Clutch Bearing Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Clutch%20Bearing%20OES%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Recommended: In Case of Clutch Pedal Vibrations"]', -- JSON array for service info
  '["Clutch Bearing OES Replacement", "Spare Part Price Only", "Clutch Set, Clutch Cable / Wire, Clutch Cylinder, Flywheel, Hydraulic Bearing in Add Ons", "Clutch Oil, Gear Oil Cost Additional", "Automatic Transmission Clutch rates may vary", "Free Pickup & Drop"]', -- JSON array for service list
  1117,                      -- Original price
  1005                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Clutch',        
  'Flywheel Replacement',          
  NULL,               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/New%20Thumbnail/flywheelThumbnail%20(1).jpg', 
  '["1 Month Warranty", "Recommended: In Case of Noisy Clutch"]', -- JSON array for service info
  '["Flywheel OES Replacement", "Spare Part Price Only", "Clutch Set, Clutch Bearing, Clutch Cable / Wire, Clutch Cylinder, Slave Cylinder in Add Ons", "Clutch Oil, Gear Oil Additional", "Automatic Transmission Clutch rates may vary", "Free Pickup & Drop"]', -- JSON array for service list
  4611,                      -- Original price
  4150                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Clutch',        
  'Flywheel Turning',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Flywheel%20turning/Thumbanil.jpg', 
  '["Recommended: In case of Burning Smell from Clutch"]', -- JSON array for service info
  '["Resurfacing of Flywheel", "Inspection of Clutch System", "Opening & Fitting of Flywheel Cost Additional", "Clutch Plate, Pressure Plate, Clutch Bearing & Clutch Cable Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  944,                      -- Original price
  850                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Clutch',        
  'Clutch Overhaul',          
  'Free Car Wash',               
  'Takes 8 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Overhaul%20Services/Clutch%20Overhaul/clutch%20overhaul.jpg', 
  '["1 Month Warranty on Labour"]', -- JSON array for service info
  '["Opening & Fitting + Inspection Of Below Items", "Clutch Plate", "Pressure Plate", "Release Bearing"]', -- JSON array for service list
  2721,                      -- Original price
  2449                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Front Bumper Replacement',          
  NULL,               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Front%20Bumper/Front%20Bumper.png', 
  '["1 Month Warranty on Fitting", "For Broken / Cracked Bumper (Recommended)"]', -- JSON array for service info
  '["Opening & Fitting of Front Bumper", "Front Bumper Replacement (Black Colour)", "Free Pickup & Drop", "Brackets, Grills, Cladding Additional", "Paint Cost Additional"]', -- JSON array for service list
  3444,                      -- Original price
  3100                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Rear Bumper Replacement',          
  NULL,               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Rear%20Bumper/Rear%20Bumper%20Replacement%20Sq.png', 
  '["1 Month Warranty on Fitting", "For Broken / Cracked Bumper (Recommended)"]', -- JSON array for service info
  '["Opening & Fitting of Rear Bumper", "Rear Bumper Replacement (Black Colour)", "Free Pickup & Drop", "Brackets, Grills, Cladding Additional", "Paint Cost Additional"]', -- JSON array for service list
  3167,                      -- Original price
  2850                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Bonnet Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/7%20services%20Images/Bonnet%20Replacement/Thumbnail.png', 
  '["Recommended: In Case Corroded Bonnet", "Recommended: In Case Broken / Damaged Bonnet"]', -- JSON array for service info
  '["Bonnet Replacement", "Opening & Fitting of Bonnet", "Hinges, Stay Rod / Shocker, Lock Cost Additional", "Paint Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  6339,                      -- Original price
  5705                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Boot Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/7%20services%20Images/Boot%20replacement/Thumbnail.png', 
  '["Recommended: In Case Corroded Boot", "Recommended: In Case Broken / Damaged Boot"]', -- JSON array for service info
  '["Boot Replacement", "Opening & Fitting of Boot", "Hinges, Rod Spring / Shocker Cost Additional", "Paint Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  4054,                      -- Original price
  3649                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Fender Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/7%20services%20Images/Fender%20Replacement/Thumbnail.png', 
  '["Recommended: In Case Corroded Fender", "Recommended: In Case Broken / Damaged Fender"]', -- JSON array for service info
  '["Fender Replacement", "Opening & Fitting of Fender", "Fender Lining, Indicator, Hinge / Support Cost Additional", "Paint Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  1802,                      -- Original price
  1622                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Right Front Door Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/7%20services%20Images/Right%20Front%20Door%20Replacement/Thumbnail.png', 
  '["Recommended: In Case Corroded Door", "Recommended: In Case Broken / Damaged Door"]', -- JSON array for service info
  '["Right Front Door Replacement (Single Unit)", "Opening & Fitting of Right Front Door", "Hinges, Weatherstrip, Handle, Cost Additional", "Trim, Lock, Window Glass & Channel Cost Additional", "Paint Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  6709,                      -- Original price
  6038                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Right Rear Door Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/7%20services%20Images/Right%20Rear%20Door%20Replacement/Thumbnail.png', 
  '["Recommended: In Case Corroded Door", "Recommended: In Case Broken / Damaged Door"]', -- JSON array for service info
  '["Right Rear Door Replacement (Single Unit)", "Opening & Fitting of Right Rear Door", "Hinges, Weatherstrip, Handle, Cost Additional", "Trim, Lock, Window Glass & Channel Cost Additional", "Paint Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  10778,                      -- Original price
  9700                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Left Front Door Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/7%20services%20Images/Left%20Front%20Door%20Replacement/Thumbnail.png', 
  '["Recommended: In Case Corroded Door", "Recommended: In Case Broken / Damaged Door"]', -- JSON array for service info
  '["Left Front Door Replacement (Single Unit)", "Opening & Fitting of Left Front Door", "Hinges, Weatherstrip, Handle, Cost Additional", "Trim, Lock, Window Glass & Channel Cost Additional", "Paint Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  6709,                      -- Original price
  6038                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Body Parts',        
  'Left Rear Door Replacement',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/7%20services%20Images/Left%20Rear%20Door%20Replacement/Thumbnail.png', 
  '["Recommended: In Case Corroded Door", "Recommended: In Case Broken / Damaged Door"]', -- JSON array for service info
  '["Left Rear Door Replacement (Single Unit)", "Opening & Fitting of Left Rear Door", "Hinges, Weatherstrip, Handle, Cost Additional", "Trim, Lock, Window Glass & Channel Cost Additional", "Paint Cost Additional", "Free Pickup & Drop"]', -- JSON array for service list
  10778,                      -- Original price
  9700                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Custom Issues',        
  'Clutch & Transmission Troubles',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/CUSTOM%20SERVICES/Clutch%20_%20Transmission%20Troubles.jpg', 
  '["Recommended: In Case of Hard Clutch"]', -- JSON array for service info
  '["25 Points Check-List", "Physical Car Diagnosis", "Clutch & Gear Box Inspection", "Free Pickup & Drop"]', -- JSON array for service list
  889,                      -- Original price
  649                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Clutch & Body Parts',         
  'Custom Issues',        
  'ABS Issue',          
  NULL,               
  'Takes 6 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/CUSTOM%20SERVICES/ABS%20Issue.jpg', 
  '["Recommended: In Case of ABS Dashboard Light"]', -- JSON array for service info
  '["Full Car Scanning", "25 Points Check-List", "Brake Electrical System Inspection", "Free Pickup & Drop"]', -- JSON array for service list
  901,                      -- Original price
  649                        -- Discounted price
);


# Insurance Claims

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Know Your Policy',        
  'Know Your Policy',          
  NULL,               
  'Call Within 2 Hour',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Know%20Your%20Policy/Know%20Your%20Policy%20Sq.jpg', 
  '["Call Within 2 Hour", "Regarding Doubts with Claim Initimation"]', -- JSON array for service info
  '["Complete Information about your Policy", "Expenditure Assessment", "Suggestions on Purchase of New Policy", "Connect with Insurance Agent", "Vehicle IDV and Premium Rate Suggestions"]', -- JSON array for service list
  111,                      -- Original price
  100                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Accidental Repairs',        
  'Accidental Denting & Painting (Insurance)',          
  NULL,               
  'Takes 24 Hours',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/retailservices/Accidental%20Denting%20_%20Painting/Thumbnail.jpg', 
  '["Recommended: In case of Comprehensive Policy"]', -- JSON array for service info
  '["Accidental Repair in Insurance", "Claim Intimation", "Surveyor Estimate Approval", "Body Panel Replacement (If Required)", "File Charge Included"]', -- JSON array for service list
  1278,                      -- Original price
  1150                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Accidental Repairs',        
  'Fire Damage Assistance (Insurance)',          
  NULL,               
  'Takes 24 Hours',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/retailservices/Fire%20Damage%20Assistance/Thumbnail.jpg', 
  '["Recommended: In case of Comprehensive Policy"]', -- JSON array for service info
  '["Repairing of Fire Damage in Insurance", "Claim Intimation", "Surveyor Estimate Approval", "File Charge Included"]', -- JSON array for service list
  1278,                      -- Original price
  1150                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Accidental Repairs',        
  'Car Flood Damage (Insurance)',          
  NULL,               
  'Takes 24 Hours',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/retailservices/Car%20Flooding%20Damage/Thumbnail.jpg', 
  '["Recommended: In case of Comprehensive Policy"]', -- JSON array for service info
  '["Repairing of Flood Damage in Insurance", "Claim Intimation", "Surveyor Estimate Approval", "File Charge Included"]', -- JSON array for service list
  1278,                      -- Original price
  1150                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Accidental Repairs',        
  'Windshield Replacement (Insurance)',          
  NULL,               
  'Takes 24 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/WindshieldReplacement/Windshield%20Replacement%20Sq.jpg', 
  '["On Cracks in Windshield (Recommended)"]', -- JSON array for service info
  '["Claim Intimation", "Surveyor Estimate Approval", "Co-ordination with Insurance Company", "Windshield Replacement/Repair", "Available at Doorstep"]', -- JSON array for service list
  1278,                      -- Original price
  1150                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Theft / Lost',        
  'Car Theft Claim (Insurance)',          
  NULL,               
  'Takes 24 Hours',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/retailservices/Car%20Theft%20Claim/Thumbnail.jpg', 
  '["Recommended: In case of Comprehensive Policy"]', -- JSON array for service info
  '["Repairing of Flood Damage in Insurance", "Claim Intimation", "Surveyor Estimate Approval", "File Charge Included"]', -- JSON array for service list
  1278,                      -- Original price
  1150                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Inspection',        
  'Doorstep Accidental Inspection',          
  NULL,               
  'Takes 4 hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/DoorstepAccidentalInspection/Doorstep%20Accidental%20Inspection%20Sq.jpg', 
  '["25 Points Checklist", "Every 1 Month (Recommended)"]', -- JSON array for service info
  '["Body Damage Inspection", "25 Points Checklist", "Insurance Claim Advice", "Policy Inspection"]', -- JSON array for service list
  764,                      -- Original price
  649                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Inspection',        
  'Towing (Insurance)',          
  NULL,               
  'Cashless Facility',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Towing%20Insurance/thumbnail.jpg', 
  '["Real Time Claim Tracking Mechanism", "Free Towing"]', -- JSON array for service info
  '["Claim Intimation", "Towing Reimbursement", "Co-ordination with Insurance Company", "Available at Doorstep"]', -- JSON array for service list
  222,                      -- Original price
  200                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Insurance Claims',         
  'Inspection',        
  'Insurance Claim Inspection',          
  NULL,               
  'Cashless Facility',               
  'https://gomechprod.blob.core.windows.net/gm-retail-app/service-new-images/Car%20Insurance_Square.jpg', 
  '["Real Time Claim Tracking Mechanism", "Free Pick-up/Drop"]', -- JSON array for service info
  '["Claim Intimation", "Surveyor Estimate Approval", "Co-ordination with Insurance Company", "2 Years Warranty on Paint Jobs", "Policy Inspection"]', -- JSON array for service list
  721,                      -- Original price
  649                        -- Discounted price
);

# SOS Service

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'SOS Service',         
  NULL,        
  'Battery Jumpstart',          
  'NEW',               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Battery-Jump-Start.png', 
  '["Available at Doorstep"]', -- JSON array for service info
  '["Car Battery Check", "Battery Jumpstart"]', -- JSON array for service list
  973,                      -- Original price
  749                        -- Discounted price
);


INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'SOS Service',         
  NULL,         
  'Car Engine Scanning',          
  'RECOMMENDED',               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Car-Engine-Scanning.png', 
  '["Available at Doorstep", "Scanner Report Provided"]', 
  '["Electrical scanning", "Error code deletion", "Sensor reset", "Inspection of exhaust smoke"]', 
  975,                     
  750                        
),

(
  'SOS Service',         
  NULL,        
  'Car Fluid Leakage',          
  'POPULAR',               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Car-Fluid-Leakage.png', 
  '["50 Points Check", "Detailed Health Card"]', 
  '["Car Battery Check", "Battery Jumpstart"]', 
  845,                     
  650                        
),

(
  'SOS Service',         
  NULL,        
  'Wheel-Lift Tow (20 Kms)',          
  'POPULAR',               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Wheel-Lift-Towing.png', 
  '["Available at Doorstep"]', 
  '["Flat Bed Towing", "Wheel Lift Towing", "Upto 10 Kms"]', 
  1495,                     
  1150                        
),

(
  'SOS Service',         
  NULL,         
  'Car Self Starter Issue',          
  'RECOMMENDED',               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Car-Self-Starter-Issue.png', 
  '["Available at Doorstep"]', 
  '["Critical System Points Check", "Underbody Inspection", "Car Battery Check"]', 
  845,                     
  650                        
),

(
  'SOS Service',         
  NULL,       
  'Flat-Bed Tow (20 Kms)',          
  'RECOMMENDED',               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Flat-Bed-Towing.png', 
  '["Available at Doorstep"]', 
  '["Flat Bed Towing", "Upto 20 Kms"]', 
  1995,                     
  1600                        
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'SOS Service',         
  NULL,        
  'Clutch Breakdown',          
  NULL,               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/sos/Clutch-Breakdown.png', 
  '["Stucked Gear"]', -- JSON array for service info
  '["In Case of Stucked Gear", "In Case of Clutch Pedal Free"]', -- JSON array for service list
  1363,                      -- Original price
  1049                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'SOS Service',         
  NULL,        
  'Car Flooding',          
  NULL,               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/sos/Car-Flooding.png', 
  '["Assistance in Case of Car Stuck in Floods", "Assistance in Case of Car Not Starting"]', -- JSON array for service info
  '["Assistance in Case of Car Stuck in Floods", "Assistance in Case of Car Not Starting"]', -- JSON array for service list
  1363,                      -- Original price
  1049                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'SOS Service',         
  NULL,        
  'Insurance Accident',          
  NULL,               
  'Takes 4 Hours',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/sos/Insurance-Accident.png', 
  '["Assistance in Case of Car Stuck in Floods", "Assistance in Case of Car Not Starting"]', -- JSON array for service info
  '["Assistance in Case of Car Stuck in Floods", "Assistance in Case of Car Not Starting"]', -- JSON array for service list
  843,                      -- Original price
  649                        -- Discounted price
);

INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'SOS Service',         
  NULL,        
  'Brake Failure',          
  NULL,               
  NULL,               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/sos/Brake-Failure.png', 
  '["In Case of Brake Fail", "In Case of Brake Pedal Free"]', -- JSON array for service info
  '["In Case of Brake Fail", "In Case of Brake Pedal Free"]', -- JSON array for service list
  1363,                      -- Original price
  1049                        -- Discounted price
);


INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'SOS Service',         
  NULL,        
  'Wrong Fuel Emergency',          
  NULL,               
  NULL,               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/sos/Wrong-Fuel-Emergency.png', 
  '["In Case of Wrong Fuel in Fuel Tank", "In Case of Car Fuel Mixture"]', -- JSON array for service info
  '["In Case of Wrong Fuel in Fuel Tank", "In Case of Car Fuel Mixture"]', -- JSON array for service list
  1363,                      -- Original price
  1049                        -- Discounted price
);


INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'SOS Service',         
  NULL,        
  'Critical Dashboard Light',          
  NULL,               
  NULL,               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/sos/Critical-Dashboard-Light.png', 
  '["In Case of Dashboard Warning Light", "In Case of Electrical Malfunctions"]', -- JSON array for service info
  '["In Case of Dashboard Warning Light", "In Case of Electrical Malfunctions"]', -- JSON array for service list
  973,                      -- Original price
  749                        -- Discounted price
);

