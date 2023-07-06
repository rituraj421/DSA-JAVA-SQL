CREATE TABLE codecamp.goal (
    Year_id INT PRIMARY KEY AUTO_INCREMENT,
    year INT(4),
    goal INT(10)
);

INSERT INTO codecamp.goal (year, goal) VALUES (2024, 700000);
INSERT INTO codecamp.goal (year, goal) VALUES (2024, 700000);
INSERT INTO codecamp.goal (year, goal) VALUES (2025, 20000000);
INSERT INTO codecamp.goal (year, goal) VALUES (2026, 2000000000);

SELECT * FROM codecamp.goal;

UPDATE codecamp.goal SET year = 24 WHERE year = 2024;

UPDATE codecamp.goal SET year = 2024 WHERE Year_id = 3;

DELETE FROM codecamp.goal WHERE Year_id = 3;