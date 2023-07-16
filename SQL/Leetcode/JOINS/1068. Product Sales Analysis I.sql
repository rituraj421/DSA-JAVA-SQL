CREATE TABLE leetcod_easy.sales(
    sale_id INT,
    product_id INT,
    year INT,
    quantity INT,
    price INT
);

CREATE TABLE leetcod_easy.product(
    produdct_id INT,
    product_name VARCHAR(10)
);

ALTER TABLE leetcod_easy.sales ADD PRIMARY KEY (sale_id);

-- ALTER TABLE leetcod_easy.sales ADD FOREIGN KEY (product_id) REFERENCES leetcod_easy.product(produdct_id);

ALTER TABLE leetcod_easy.product ADD PRIMARY KEY(produdct_id);

INSERT INTO leetcod_easy.sales VALUES(1, 100, 2008, 10, 5000);
INSERT INTO leetcod_easy.sales VALUES(2, 100, 2009, 12, 5000);
INSERT INTO leetcod_easy.sales VALUES(7, 200, 2011, 15, 9000);

INSERT INTO leetcod_easy.product VALUES(100, 'Nokia');
INSERT INTO leetcod_easy.product VALUES(200, 'Apple');
INSERT INTO leetcod_easy.product VALUES(300, 'Samsung');

-- Write an SQL query that reports the product_name, year, and price for each sale_id in the Sales table.

-- Return the resulting table in any order.

SELECT product_name, year, price FROM leetcod_easy.sales INNER JOIN leetcod_easy.product ON leetcod_easy.product.produdct_id = sales.product_id;