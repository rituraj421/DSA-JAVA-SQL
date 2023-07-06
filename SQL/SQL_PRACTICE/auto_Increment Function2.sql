CREATE TABLE codecamp.student1 (
    st_id INT PRIMARY KEY AUTO_INCREMENT,
    friend varchar(20),
    rival varchar(20)
);

SELECT * FROM codecamp.student1;

INSERT INTO codecamp.student1(friend, rival) VALUES ('badri', 'cant say');
INSERT INTO codecamp.student1(friend, rival) VALUES ('roshan', 'cant say');

--  DROP TABLE codecamp.student1;



