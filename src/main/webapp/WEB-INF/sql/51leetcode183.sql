CREATE DATABASE leetcode183;
USE leetcode183;
CREATE TABLE Customers (
	id INT PRIMARY KEY,
    name VARCHAR(100)
);
INSERT INTO Customers VALUES (1, 'Joe');
INSERT INTO Customers VALUES (2, 'Henry');
INSERT INTO Customers VALUES (3, 'Sam');
INSERT INTO Customers VALUES (4, 'Max');

CREATE TABLE Orders (
	id INT PRIMARY KEY,
    customerId INT,
    FOREIGN KEY (customerId) REFERENCES Customers(id)
);
INSERT INTO Orders VALUES (1, 3);
INSERT INTO Orders VALUEs (2, 1);


