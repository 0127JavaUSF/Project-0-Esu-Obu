ALTER TABLE customers ADD  COLUMN cust_email VARCHAR UNIQUE;
--ALTER TABLE customers ADD CONSTRAINTS cust_email NOT NULL;

UPDATE customers SET cust_email = 'mj@gmail.com' WHERE cust_id = 1;
UPDATE customers SET cust_email = 'jdoedoe@aol.com' WHERE cust_id = 2;
UPDATE customers SET cust_email = 'herbet_ron@email.com' WHERE cust_id = 3;
UPDATE customers SET cust_email = 'malan_michaels@comcast.net' WHERE cust_id = 4;
UPDATE customers SET cust_email = 'p_willo@sheisme.com' WHERE cust_id = 5;
UPDATE customers SET cust_email = 'beyonce_knowles_c@beyingme.com' WHERE cust_id = 6;
	
	--(2, 'John Doe', 'jdoe', 'a31405d272b94e5d12e9a52a665d3bfe', 111001, 'jdoedoe@aol.com'),
	--(3, 'Herbert Ron', 'hron', '946056b186736eee0341710333401be4', 111002, 'herbet_ron@email.com'),
	--(4, 'Alan Michaels', 'amichaels', '1bf7d74c495bd7823c8a711dcb4813fc', 111003, 'alan_michaels@comcast.net'),
	--(5, 'Princess Willo', 'pwillo', '21b62bc3a2a1af18df9775dfea19d873', 111003, 'p_willo@sheisme.com'),
	--(6, 'Beyonce Carter', 'bcarter', '32a1c1c5d2037feb49e599b58203c723', 111004, 'beyonce_knowles_c@beyingme.com');