DROP TABLE IF EXISTS customer, sale CASCADE;

CREATE TABLE customer(
	customer_id serial PRIMARY KEY,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NOT NULL,
	phone_number varchar(10),
	--keep phone numbers raw data, phone number formats are UI things
	CONSTRAINT UQ_customer_phone_number UNIQUE(phone_number)
);

CREATE TABLE sale(
	sale_id serial,
	customer_id int NOT NULL
);

ALTER TABLE sale ADD CONSTRAINT FK_sale_customer_id FOREIGN KEY(customer_id) REFERENCES customer(customer_id);