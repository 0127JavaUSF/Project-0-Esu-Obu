-- DCL - DATA CONTROL LANGUAGE

-- 1. GRANT - Grant grants privileges to a role
-- 2. REVOKE - REVOKE revokes PRIVILEGES FROM a ROLE 

-- Roles themselves ARE created USING DDL AS they ARE DATABASE objects.

CREATE ROLE jdbc_bot LOGIN PASSWORD '!mthesh!t';
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO jdbc_bot;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO jdbc_bot;