-- CREATE TABLE joins.emp(
--     emp_id INT,
--     name VARCHAR(30),
--     gender VARCHAR(5),
--     age INT,
--     salary INt
-- );

-- ALTER TABLE joins.emp MODIFY gender VARCHAR(15);

-- INSERT INTO joins.emp(emp_id, name, gender, age, salary) VALUES(206, 'AMAN', 'MALE', 24, 350000);
-- INSERT INTO joins.emp(emp_id, name, gender, age, salary) VALUES(208, 'TANISHA', 'FEMALE', 27, 460000);
-- INSERT INTO joins.emp(emp_id, name, gender, age, salary) VALUES(203, 'HARPREET', 'FEMALE', 29, 890000);
-- INSERT INTO joins.emp(emp_id, name, gender, age, salary) VALUES(201, 'RAM', 'MALE', 23, 358000);
-- INSERT INTO joins.emp(emp_id, name, gender, age, salary) VALUES(205, 'VISHAL', 'MALE', 25, 560000);
-- INSERT INTO joins.emp(emp_id, name, gender, age, salary) VALUES(204, 'SHUBHAM', 'MALE', 29, 679000);
-- INSERT INTO joins.emp(emp_id, name, gender, age, salary) VALUES(207, 'ROHAN', 'MALE', 28, 700000);
-- INSERT INTO joins.emp(emp_id, name, gender, age, salary) VALUES(210, 'PRIYANKA', 'FEMALE', 27, 650000);


-- CREATE TABLE joins.emp_dpt(
--     dpt_id INT,
--     emp_id INT,
--     dpt VARCHAR(100),
--     city VARCHAR(100),
--     pin int
-- );

-- INSERT INTO joins.emp_dpt(dpt_id, emp_id, dpt, city, pin) VALUES(21, 205, 'HR', 'BANGALORE', 560076);
-- INSERT INTO joins.emp_dpt(dpt_id, emp_id, dpt, city, pin) VALUES(23, 203, 'DEVELOPER', 'DELHI', 879009);
-- INSERT INTO joins.emp_dpt(dpt_id, emp_id, dpt, city, pin) VALUES(23, 206, 'DEVELOPER', 'PUNE', 476501);
-- INSERT INTO joins.emp_dpt(dpt_id, emp_id, dpt, city, pin) VALUES(22, 207, 'HSALES', 'BANGALORE', 568077);
-- INSERT INTO joins.emp_dpt(dpt_id, emp_id, dpt, city, pin) VALUES(21, 201, 'HR', 'PUNE', 564487);
-- INSERT INTO joins.emp_dpt(dpt_id, emp_id, dpt, city, pin) VALUES(22, 210, 'SALES', 'MUMBAI', 656009);
-- INSERT INTO joins.emp_dpt(dpt_id, emp_id, dpt, city, pin) VALUES(24, 209, 'ANALYST', 'AHEMDABAD', 678879);
-- INSERT INTO joins.emp_dpt(dpt_id, emp_id, dpt, city, pin) VALUES(25, 200, 'ANALYST', 'PUNE', 238977);

-- SELECT * FROM joins.emp_dpt;

SELECT * FROM joins.emp INNER JOIN joins.emp_dpt On emp.emp_id = emp_dpt.emp_id;