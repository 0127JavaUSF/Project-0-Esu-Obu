SELECT accnt_num, routing_num
FROM public.customeraccounts;

ALTER TABLE customeraccounts ADD COLUMN cust_id serial NOT NULL REFERENCES customers(cust_id);
