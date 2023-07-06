SELECT name, major FROM codecamp.student ORDER BY name;

SELECT * FROM codecamp.student ORDER BY name DESC; return in -- descending order

SELECT * FROM codecamp.student LIMIT 2; -- will print only two students

-- CREATING EMPLOYEE TABLE IN CODECAMP DATABASE
CREATE TABLE codecamp.employee(
    emp_id INT PRIMARY KEY,
    first_name VARCHAR(40),
    last_name VARCHAR(40),
    birth_date DATE,
    sex VARCHAR(2),
    salary INT,
    super_id INT,
    branch_id INT
);

INSERT INTO codecamp.employee (emp_id, first_name, last_name, birth_date, sex, salary, super_id, branch_id) VALUE (100, 'David', 'Wallance', '', 'M', 250000, ' NULL', 1)

-- CREATING BRANCH TABLE IN CODECAMP DATABASE
CREATE TABLE codecamp.branch(
    branch_id INT PRIMARY KEY,
    branch_name VARCHAR(40),
    mgr_id INT,
    mgr_start_date DATE,
    FOREIGN KEY(mgr_id) REFERENCES codecamp.employee(emp_id) ON DELETE SET NULL
);

ALTER TABLE codecamp.employee
ADD FOREIGN KEY(branch_id)
REFERENCES codecamp.branch(branch_id)
ON DELETE SET NULL;

ALTER TABLE codecamp.employee
ADD FOREIGN KEY(super_id)
REFERENCES codecamp.employee(emp_id)
ON DELETE SET NULL;

-- now create client table
CREATE TABLE codecamp.client(
    client_id INT PRIMARY KEY,
    client_name VARCHAR(40),
    branch_id INT,
    FOREIGN KEY (branch_id) REFERENCES codecamp.branch(branch_id) ON DELETE SET NULL
);

-- now create works_with table with two primary key(composite) which are also foreign key
CREATE TABLE codecamp.works_with(
    emp_id INT,
    client_id INT,
    total_sales INT,
    PRIMARY KEY(emp_id, client_id),
    FOREIGN KEY(emp_id) REFERENCES codecamp.employee(emp_id) ON DELETE CASCADE,
    FOREIGN KEY(client_id) REFERENCES codecamp.client(client_id) ON DELETE CASCADE
);

-- now create branch supplier table with two primary key.ABORT
CREATE TABLE codecamp.branch_supplier(
    branch_id INT,
    supplier_name VARCHAR(40),
    supply_type VARCHAR(40),
    PRIMARY KEY(branch_id, supplier_name),
    FOREIGN KEY(branch_id) REFERENCES codecamp.branch(branch_id) ON DELETE CASCADE
);


INSERT INTO codecamp.employee VALUES(100, 'David', 'Wallace', '1967-11-17','M', 25000, NULL, NULL );

INSERT INTO codecamp.branch VALUES(1, 'Corporate', 100, '2006-02-09');

UPDATE codecamp.employee
SET branch_id = 1
WHERE emp_id = 100;

INSERT INTO codecamp.employee VALUES(101, 'Jan', 'Levinson', '1961-05-11', 'F', 110000, 100, 1);


INSERT INTO codecamp.employee VALUES(102, 'Michael', 'Scott', '1964-03-15', 'M', 75000, 100, NULL);

INSERT INTO codecamp.branch VALUES(2, 'Scranton', 102, '1992-04-06');

UPDATE codecamp.employee
SET branch_id = 2
WHERE emp_id = 102;

INSERT INTO codecamp.employee VALUES(103, 'Angela', 'Martin', '1971-06-25', 'F', 63000, 102, 2);
INSERT INTO codecamp.employee VALUES(104, 'Kelly', 'Kapoor', '1980-02-05', 'F', 55000, 102, 2);
INSERT INTO codecamp.employee VALUES(105, 'Stanley', 'Hudson', '1958-02-19', 'M', 69000, 102, 2);


INSERT INTO codecamp.employee VALUES(106, 'Josh', 'Porter', '1969-09-05', 'M', 78000, 100, NULL);

INSERT INTO codecamp.branch VALUES(3, 'Stamford', 106, '1998-02-13');

UPDATE codecamp.employee
SET branch_id = 3
WHERE emp_id = 106;

INSERT INTO codecamp.employee VALUES(107, 'Andy', 'Bernard', '1973-07-22', 'M', 65000, 106, 3);
INSERT INTO codecamp.employee VALUES(108, 'Jim', 'Halpert', '1978-10-01', 'M', 71000, 106, 3);


INSERT INTO codecamp.branch_supplier VALUES(2, 'Hammer Mill', 'Paper');
INSERT INTO codecamp.branch_supplier VALUES(2, 'Uni-ball', 'Writing Utensils');
INSERT INTO codecamp.branch_supplier VALUES(3, 'Patriot Paper', 'Paper');
INSERT INTO codecamp.branch_supplier VALUES(2, 'J.T. Forms & Labels', 'Custom Forms');
INSERT INTO codecamp.branch_supplier VALUES(3, 'Uni-ball', 'Writing Utensils');
INSERT INTO codecamp.branch_supplier VALUES(3, 'Hammer Mill', 'Paper');
INSERT INTO codecamp.branch_supplier VALUES(3, 'Stamford Lables', 'Custom Forms');

INSERT INTO codecamp.client VALUES(400, 'Dunmore Highschool', 2);
INSERT INTO codecamp.client VALUES(401, 'Lackawana Country', 2);
INSERT INTO codecamp.client VALUES(402, 'FedEx', 3);
INSERT INTO codecamp.client VALUES(403, 'John Daly Law, LLC', 3);
INSERT INTO codecamp.client VALUES(404, 'Scranton Whitepages', 2);
INSERT INTO codecamp.client VALUES(405, 'Times Newspaper', 3);
INSERT INTO codecamp.client VALUES(406, 'FedEx', 2);

INSERT INTO codecamp.works_with VALUES(105, 400, 55000);
INSERT INTO codecamp.works_with VALUES(102, 401, 267000);
INSERT INTO codecamp.works_with VALUES(108, 402, 22500);
INSERT INTO codecamp.works_with VALUES(107, 403, 5000);
INSERT INTO codecamp.works_with VALUES(108, 403, 12000);
INSERT INTO codecamp.works_with VALUES(105, 404, 33000);
INSERT INTO codecamp.works_with VALUES(107, 405, 26000);
INSERT INTO codecamp.works_with VALUES(102, 406, 15000);
INSERT INTO codecamp.works_with VALUES(105, 406, 130000);

SELECT * FROM codecamp.employee;

SELECT * FROM codecamp.employee ORDER BY salary;

SELECT * FROM codecamp.employee ORDER BY sex, first_name;

SELECT first_name AS forename, last_name FROM codecamp.employee;

SELECT count(emp_id) FROM codecamp.employee;

SELECT count(emp_id) FROM codecamp.employee WHERE sex = 'F' AND birth_date > '1970-01-01';

SELECT AVG(salary) FROM codecamp.employee;

SELECT SUM(salary) FROM codecamp.employee;

SELECT SUM(total_sales), emp_id FROM codecamp.works_with GROUP BY emp_id;

SELECT * FROM codecamp.client WHERE client_name LIKE '%LLC';

SELECT * FROM codecamp.employee WHERE birth_date LIKE '____-10-%';

SELECT first_name AS ritu FROM codecamp.employee UNION SELECT branch_name FROM codecamp.branch;

INSERT INTO codecamp.branch VALUES(4, 'Buffalo', NULL, NULL);

SELECT emp_id, first_name, branch_name FROM codecamp.employee JOIN codecamp.branch ON employee.emp_id = branch.mgr_id;

SELECT first_name, last_name FROM codecamp.employee WHERE emp_id IN (
    SELECT emp_id FROM codecamp.works_with WHERE total_sales > 30000
);

SELECT client_name FROM codecamp.client WHERE branch_id = (
    SELECT branch_id FROM codecamp.branch WHERE mgr_id = 102
);


SELECT * FROM codecamp.branch;