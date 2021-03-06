-- CREATED TWO TABLES: 
-- 1) AllAccounts to track all the users in the database
-- along with how many types of accounts they have,
-- thier balance, account number, etc.
-- 2) Customers which will track customer ids, customer
-- names, usernames, and passwords
CREATE TABLE AllAccounts (
	accnt_num Integer UNIQUE PRIMARY KEY,
	accnt_type VARCHAR(7) NOT NULL,
	accnt_holder VARCHAR NOT NULL,
	routing_num Integer NOT NULL, 
	balance  decimal NOT NULL  
);

--Drop accnt_type column and add it back with larger varchar size
ALTER TABLE allaccounts DROP COLUMN accnt_type;
ALTER TABLE allaccounts ADD COLUMN accnt_type VARCHAR(20) NOT NULL;

ALTER TABLE allaccounts DROP COLUMN routing_num;
ALTER TABLE allaccounts ADD COLUMN routing_num SERIAL NOT NULL;

ALTER TABLE allaccounts DROP COLUMN accnt_num;
ALTER TABLE allaccounts ADD COLUMN accnt_num SERIAL UNIQUE PRIMARY KEY;

------------------------------------------------------------------------------------

CREATE TABLE Customers (
	cust_id SERIAL UNIQUE PRIMARY KEY,
	cust_name VARCHAR,
	cust_username VARCHAR(30),
	cust_password VARCHAR(30),
	--FOREIGN KEY accnt_num REFERENCES AllAccounts(accnt_num)
	accnt_num INTEGER NOT NULL REFERENCES AllAccounts(accnt_num)
);

ALTER TABLE Customers DROP COLUMN accnt_num;
ALTER TABLE Customers ADD COLUMN accnt_num SERIAL NOT NULL REFERENCES AllAccounts(accnt_num);


-----------------------------------------------------------------

