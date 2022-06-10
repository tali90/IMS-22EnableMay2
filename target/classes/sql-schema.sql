drop schema if exists ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`items` (
	`items_id` INT(11) NOT NULL AUTO_INCREMENT,
    `items_name` VARCHAR(40) NOT NULL,
    `price` DEC(10, 2) NOT NULL,
    PRIMARY KEY (`items_id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders` (
	fk_id INT NOT NULL,
    order_id INT NOT NULL auto_increment,
    PRIMARY KEY (order_id), 
    FOREIGN KEY (fk_id) REFERENCES customers(id)
);

CREATE TABLE IF NOT EXISTS `ims`.`orders_items` (
	order_itemsID INT NOT NULL auto_increment,
    fk_order_id INT NOT NULL,
    fk_items_id INT NOT NULL,
    item_quantity INT NOT NULL,
    
    PRIMARY KEY (order_itemsID),
    FOREIGN KEY (fk_order_id) REFERENCES orders(order_id),
    FOREIGN KEY (fk_items_id) REFERENCES items(items_id)
    );
    
    