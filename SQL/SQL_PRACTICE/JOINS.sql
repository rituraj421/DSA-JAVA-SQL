-- CREATE DATABASE JOINS;

-- CREATE TABLE joins.employee(
--     emp_id INT PRIMARY KEY,
--     emp_name VARCHAR(150)
-- );

-- INSERT INTO joins.employee VALUES(1, 'Anil');
-- INSERT INTO joins.employee VALUES(2, 'Suresh');
-- INSERT INTO joins.employee VALUES(3, 'Mahesh');
-- INSERT INTO joins.employee VALUES(4, 'Mohan');
-- INSERT INTO joins.employee VALUES(5, 'Sohan');

-- SELECT * FROM joins.employee;

-- CREATE TABLE joins.employeeDetails(
--     emp_id INT NOT NULL,
--     emp_age INT NOT NULL,
--     emp_address VARCHAR(200) NULL,
--     emp_salary DECIMAL(8,2) NULL
-- );

-- INSERT INTO joins.employeeDetails VALUES(1,33,'Delhi', 2923.90);
-- INSERT INTO joins.employeeDetails VALUES(2,43,'NCR', 3444.90);
-- INSERT INTO joins.employeeDetails VALUES(3,22,'Haryana', 3456.90);
-- INSERT INTO joins.employeeDetails VALUES(4,65,'UP', 5433.90);
-- INSERT INTO joins.employeeDetails VALUES(8,34,'Delhi', 4222.90);
-- INSERT INTO joins.employeeDetails VALUES(10,32,'Delhi', 4554.90);

-- SELECT * FROM joins.employeeDetails;

-- SELECT employee.emp_id, emp_name, emp_age, emp_address, emp_salary FROM joins.employee LEFT JOIN joins.employeedetails ON (employee.emp_id = employeedetails.emp_id);
-- SELECT employee.emp_id, emp_name, emp_age, emp_address, emp_salary FROM joins.employee RIGHT JOIN joins.employeedetails ON (employee.emp_id = employeedetails.emp_id);

-- SELECT employee.emp_id, emp_name, emp_age, emp_address, emp_salary FROM joins.employee INNER JOIN joins.employeedetails ON (employee.emp_id = employeedetails.emp_id);

SELECT employee.emp_id, emp_name, emp_age, emp_address, emp_salary FROM joins.employee FULL JOIN joins.employeedetails ON (employee.emp_id = employeedetails.emp_id);

