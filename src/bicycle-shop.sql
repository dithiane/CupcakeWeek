DROP TABLE IF EXISTS CUSTOMER;
DROP TABLE IF EXISTS PRODUCT;
DROP TABLE IF EXISTS TRANSACTION;

CREATE TABLE CUSTOMER(
	id SERIAL PRIMARY KEY,
	firstname VARCHAR,
	lastname VARCHAR,
	email VARCHAR
) 

CREATE TABLE PRODUCT(
	id SERIAL PRIMARY KEY,
	brand VARCHAR,
	model VARCHAR,
	description VARCHAR,
	price FLOAT,
	quantity INTEGER
)

CREATE TABLE TRANSACTION(
    id SERIAL PRIMARY KEY,
    date DATE,
    customer_id INT REFERENCES CUSTOMER(id),
    product_id INT REFERENCES PRODUCT(id)
)

INSERT INTO CUSTOMER (firstname, lastname, email)
VALUES ('John', 'Strong', 'johnstrong@gmail.com')

INSERT INTO CUSTOMER (firstname, lastname, email)
VALUES ('Alan', 'Strong', 'alanstrong@gmail.com')

INSERT INTO PRODUCT (brand, model, description, price, quantity)
VALUES ('Aventon', 'Commuter', 'Aventon selection of electric commuter bikes has something for everyone!', 1.199, 2 )

INSERT INTO PRODUCT (brand, model, description, price, quantity)
VALUES ('Aventon', 'Soltera', 'Engineered for agility, crafted with minimality.', 1.199, 1 )

INSERT INTO TRANSACTION (date, customer_id, product_id)
VALUES (CURRENT_TIMESTAMP, 1, 1)
INSERT INTO TRANSACTION (date, customer_id, product_id)
VALUES (CURRENT_TIMESTAMP, 1, 2)
INSERT INTO TRANSACTION (date, customer_id, product_id)
VALUES (CURRENT_TIMESTAMP, 2, 2)

SELECT * FROM TRANSACTION t, CUSTOMER c, PRODUCT p
WHERE t.customer_id = c.id
AND t.product_id = p.id
LIMIt 2

INSERT INTO CUSTOMER (firstname, lastname, email)
VALUES ('Mike', 'Ameron', 'markameron@gmail.com')

DELETE FROM TRANSACTION
WHERE product_id = (
  SELECT id FROM PRODUCT
  WHERE model = 'Soltera'
);
  
DELETE FROM PRODUCT
WHERE model = 'Soltera';

UPDATE product
SET brand ='Morning star'
WHERE brand = 'Aventon'



