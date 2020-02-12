INSERT INTO customers (cust_id, cust_name, cust_username, cust_password, accnt_num) VALUES
	(1, 'Mary Jane', 'mjane', '86a94e059964ec38336ef02862f895a9', 111001),
	(2, 'John Doe', 'jdoe', 'a31405d272b94e5d12e9a52a665d3bfe', 111001),
	(3, 'Herbert Ron', 'hron', '946056b186736eee0341710333401be4', 111002),
	(4, 'Alan Michaels', 'amichaels', '1bf7d74c495bd7823c8a711dcb4813fc', 111003),
	(5, 'Princess Willo', 'pwillo', '21b62bc3a2a1af18df9775dfea19d873', 111003),
	(6, 'Beyonce Carter', 'bcarter', '32a1c1c5d2037feb49e599b58203c723', 111004);
	
	
	


INSERT INTO accounts (accnt_num, accnt_type, accnt_holder, routing_num, balance) VALUES
	(111001, 'joint-checking', 'Mary Jane & John Doe', 0001111, 320.00),
	(111002, 'single-checking', 'Herbert Ron', 0002111, 21.50),
	(111003, 'joint-savings', 'Alan Michaels & Princess Willo', 0003111, 20345.98),
	(111004, 'single-savings', 'Beyonce Carter', 0003111, 25050765.87);