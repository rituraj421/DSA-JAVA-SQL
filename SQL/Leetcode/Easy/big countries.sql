create TABLE leetcod_easy.bigCountries(
    id INT ( 10 ) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(25) NOT NULL,
    continent varchar(255) NOT NULL,
    area int,
    population int,
    gdp bigint
);

USE leetcod_easy; 

insert into bigCountries (name, continent, area, population, gdp) values ('Afghanistan', 'Asia', '652230', '25500100', '20343000000');
insert into bigCountries (name, continent, area, population, gdp) values ('Albania', 'Europe', '28748', '2831741', '12960000000');
insert into bigCountries (name, continent, area, population, gdp) values ('Algeria', 'Africa', '2381741', '37100000', '188681000000');
insert into bigCountries (name, continent, area, population, gdp) values ('Andorra', 'Europe', '468', '78115', '3712000000');
insert into bigCountries (name, continent, area, population, gdp) values ('Angola', 'Africa', '1246700', '20609294', '100990000000');


SELECT * FROM `leetcod_easy`.`bigcountries` LIMIT 1000;

SELECT name, population, area from leetcod_easy.bigcountries where area >= 3000000 or population >= 25000000;