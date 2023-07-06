CREATE TABLE leetcod_easy.employees(
    id INT,
    name VARCHAR(20)
);

CREATE TABLE leetcod_easy.employeeUNI(
    id INT,
    unique_id INT
);

INSERT INTO leetcod_easy.employees(id, name) VALUES(1, 'Alice');
INSERT INTO leetcod_easy.employees(id, name) VALUES(7, 'Bob');
INSERT INTO leetcod_easy.employees(id, name) VALUES(11, 'Meir');
INSERT INTO leetcod_easy.employees(id, name) VALUES(90, 'Winston');
INSERT INTO leetcod_easy.employees(id, name) VALUES(3, 'Jonathan');

INSERT INTO leetcod_easy.employeeuni(id, unique_id) VALUES (3,1);
INSERT INTO leetcod_easy.employeeuni(id, unique_id) VALUES (11,2);
INSERT INTO leetcod_easy.employeeuni(id, unique_id) VALUES (90,3);

-- DELETE FROM leetcod_easy.employeeuni WHERE id=3;
-- DELETE FROM leetcod_easy.employeeuni WHERE id=90;

ALTER TABLE leetcod_easy.employees ADD PRIMARY KEY(id);

ALTER TABLE leetcod_easy.employeeuni ADD PRIMARY KEY (id, unique_id);

SELECT name, unique_id  FROM leetcod_easy.employees LEFT JOIN  leetcod_easy.employeeuni ON employeeuni.id = leetcod_easy.employees.id;

SELECT name FROM leetcod_easy.employees;
SELECT * FROM leetcod_easy.employeeuni;
