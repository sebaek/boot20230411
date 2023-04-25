CREATE DATABASE leetcode175;
USE leetcode175;

CREATE TABLE Person (
	personId INT PRIMARY KEY,
    lastName VARCHAR(200),
    firstName VARCHAR(200)
);
INSERT INTO Person VALUES (1, 'Wang', 'Allen');
INSERT INTO Person VALUES (2, 'Alice', 'Bob');

SELECT * FROM Person;

CREATE TABLE Address (
	addressId INT PRIMARY KEY,
    personId INT,
    city VARCHAR(200),
    state VARCHAR(200)
);
INSERT INTO Address VALUES (1, 2, 'New York City', 'New York');
INSERT INTO Address VALUES (2, 3, 'Leetcode', 'California');






