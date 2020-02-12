ALTER TABLE customers 
	ADD COLUMN email varchar UNIQUE;


ALTER TABLE customers 
	DROP COLUMN email;

ALTER TABLE customers 
	ADD COLUMN email varchar UNIQUE;
	
SELECT * FROM customers;
