CREATE DATABASE IF NOT EXISTS gameshopdbtwo;

USE gameshopdbtwo;
DROP TABLE orders;
DROP TABLE products;
DROP TABLE customers;

CREATE TABLE customers(
customer_id INT PRIMARY KEY AUTO_INCREMENT,
first_name CHAR(20),
last_name CHAR(20)
);

CREATE TABLE products (
product_id INT PRIMARY KEY AUTO_INCREMENT,
product_name char(40) NOT NULL
);

CREATE TABLE orders (
order_id INT PRIMARY KEY AUTO_INCREMENT,
fk_customer_id INT,
fk_product_id INT,
order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (fk_customer_id) REFERENCES customers(customer_id),
FOREIGN KEY (fk_product_id) REFERENCES products(product_id)
);

INSERT INTO customers (first_name, last_name)
Values ('Devin','Patel');

INSERT INTO products (product_name)
VALUES ('WoW');

INSERT INTO orders (fk_customer_id,fk_product_id)
VALUES (1,1);