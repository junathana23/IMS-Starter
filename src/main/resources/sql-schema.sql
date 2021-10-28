drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

create table imsorderDetails (detailID int auto_increment Not Null,
 OrderId int,
 itemID int,
 primary key(detailID),
 foreign key(OrderId) references imsorders(OrderId),
 foreign key(itemID) references items(itemID)
 );
