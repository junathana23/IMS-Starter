INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
 Create IMS;
 USE IMS;
 
 Create Table Customers (ID int auto_increment,
 FirstName varchar(20) NOT NULL, 
 Surname varchar (40) NOT NULL,
 primary key(ID)
 );
 
 create table Items (ID int auto_increment,
 ItemName varchar(40) NOT null,
 ItemPrice double NOT NULL,
 primary key(ID)
 );
 
 