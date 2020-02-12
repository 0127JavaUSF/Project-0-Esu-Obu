-- CREATED TWO TABLES: 
-- 1) accounts to track all the users in the database
-- along with how many types of accounts they have,
-- thier balance, account number, etc.
-- 2) Customers which will track customer ids, customer
-- names, usernames, and passwords
--3) customeraccounts to keep track of which accounts belong to which users

CREATE TABLE accounts (
	accnt_num serial UNIQUE PRIMARY KEY,
	accnt_type VARCHAR NOT NULL,
	accnt_holder VARCHAR NOT NULL,
	routing_num serial UNIQUE NOT NULL,
	balance decimal NOT NULL
);



CREATE TABLE customers (
	cust_id serial UNIQUE PRIMARY KEY,
	cust_name VARCHAR NOT NULL,
	cust_username VARCHAR(20) UNIQUE NOT NULL,
	cust_password VARCHAR(20) UNIQUE NOT NULL
);



CREATE TABLE customeraccounts (
	accnt_num serial NOT NULL REFERENCES accounts(accnt_num),
	routing_num serial NOT NULL REFERENCES accounts(routing_num),
	cust_id serial NOT NULL REFERENCES customers(cust_id)	
);

ALTER TABLE customeraccounts DROP cust_id;

ALTER TABLE customeraccounts DROP cust_username;