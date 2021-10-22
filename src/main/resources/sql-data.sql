INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
 Create IMS;
 USE IMS;
 
 Create Table Customers (custID int auto_increment,
 FirstName varchar(20) NOT NULL, 
 Surname varchar (40) NOT NULL,
 primary key(custSID)
 );
 
 create table Items (itemID int auto_increment,
 ItemName varchar(40) NOT null,
 ItemPrice double NOT NULL,
 primary key(itemID)
 );
 
 create table imsorders (OrderId int auto_increment Not Null,
 custID int,
 itemQuant int,
 total double,
 Primary key(OrderId),
 Foreign Key (custID) references customers(custID)
 );
 
 create table imsorderDetails (detailID int auto_increment Not Null,
 OrderId int,
 itemID int,
 primary key(detailID),
 foreign key(OrderId) references imsorders(OrderId),
 foreign key(itemID) references items(itemID)
 );
 