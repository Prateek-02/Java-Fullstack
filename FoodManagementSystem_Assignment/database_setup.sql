-- Run this in SQL*Plus BEFORE starting the application
-- conn scott/tiger

CREATE SEQUENCE cat_seq   START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE food_seq  START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE order_seq START WITH 1 INCREMENT BY 1;

-- Hibernate will auto-create tables (hbm2ddl.auto=update)
