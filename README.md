# Autocare
AutoCare is a web application that helps car owners manage their vehicle's maintenance and service records. Users  can register their cars, view service history. The system will  also allow car owners to book services at authorized service centers



**#TechStack** 

Frontend - Angular,
Backend - SpringBoot,
DataBase - PostgreSQL


**#Running the project** 

1) Download the Autocare Frontend and Backend file

2) Open the frontend in the vscode

3) Open the Backend file in the SpringBoot/Vscode

4) check whether the system has installed the Maven & JUnit

5) Install all the dependencies mentioned in the POM.XML

6) In the PostgreSQl Database add the "autocare" database

7) Run the Frontend using the "ng serve"  

8) Run the Backend from the "AutoCareBackend Application.Java"

**#Creating the  list of service in the database table**

use the sql query command to insert the services in the database table

----- Insert the query in the Product Table -------

>>>>>>Insert for 'Rear Brake Shoes'
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Services',        
  'Rear Brake Shoes',          
  'Recommended',               
  '3 Hours Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/BrakePads/Brake%20Shoe%20Thumbnail.jpg', 
  '["1 Month Warranty", "For Both Rear Wheels"]', -- JSON array for service info
  '["Brake Pad Replacement", "Brake Fluid Check", "Wheel Alignment"]', -- JSON array for service list
  '70',                     
  '50'                       
);
 
 
>>>>>Insert for 'Front Brake Discs'
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Services',        
  'Front Brake Discs',          
  'Recommended',               
  '5 Hours Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Front%20Disc%20Brake/Thumbnail.jpg', 
  '["1 Month Warranty", "Cost For Single Wheel"]', -- JSON array for service info
  '["Brake Disc Replacement", "Brake Fluid Change", "Pad Check"]', -- JSON array for service list
  '120',                     
  '100'                       
);
 
 
>>>>>Insert for 'Caliper Pin Replacement'
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Services',        
  'Caliper Pin Replacement',          
  'Recommended',               
  '6 Hours Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Caliper%20Pin%20Replacement/Thumbnail.jpg', 
  '["1 Month Warranty", "Prevent Brake Failure"]', -- JSON array for service info
  '["Pin Replacement", "Caliper Lubrication", "Wheel Check"]', -- JSON array for service list
  '90',                     
  '75'                       
);


 
 
 
>>>>>Insert for 'Disc Turning'
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Services',        
  'Disc Turning',          
  'Recommended',               
  '4 Hours Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Overhaul%20Services/Disc%20Turning/disc%20turning.jpg', 
  '["1 Month Warranty on Labour", "For Both Front Wheels"]', -- JSON array for service info
  '["Disc Inspection", "Surface Grinding", "Brake Pad Check"]', -- JSON array for service list
  '85',                     
  '60'                       
);
 
 
 
>>>>>Insert for 'Handbrake Wire Replacement'
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Services',        
  'Handbrake Wire Replacement',          
  'Recommended',               
  '4 Hours Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Hand%20Brake%20/Thumbnail.jpg', 
  '["1 Month Warranty"]', -- JSON array for service info
  '["Wire Replacement", "Handbrake Check", "System Lubrication"]', -- JSON array for service list
  '60',                     
  '40'                       
);
 
 
>>>>> Insert for 'Brake Drums Turning'
INSERT INTO "public"."product" 
("category", "service_heading", "service_name", "tag", "time_tag", "img", "service_info", "service_list", "original_price", "price") 
VALUES 
(
  'Periodic Services',         
  'Brake Services',        
  'Brake Drums Turning',          
  'Recommended',               
  '4 Hours Taken',               
  'https://gomechprod.blob.core.windows.net/gomech-retail/gomechanic_assets/Brake%20Drums/Thumbnail2.jpg', 
  '["1 Month Warranty on Labour", "For Both Rear Wheels"]', -- JSON array for service info
  '["Drum Inspection", "Surface Regrinding", "Brake Adjustment"]', -- JSON array for service list
  '80',                     
  '70'                       
);


----------------------------------------------------------------- xxx ---------------------------------------------------------


 

