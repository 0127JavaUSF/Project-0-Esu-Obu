CREATE ROLE postgres1 LOGIN PASSWORD '!mthesh!t';
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO postgres1;
GRANT ALL PRIVILsGES ON ALL SEQUENCES IN SCHEMA public TO postgres1;