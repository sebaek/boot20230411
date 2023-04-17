-- 내장 함수
-- COUNT : 레코드 수 리턴
SELECT * FROM Customers;
SELECT COUNT(CustomerID) FROM Customers;
SELECT COUNT(CustomerName) FROM Customers;
SELECT COUNT(Country) FROM Customers; -- 91
SELECT COUNT(DISTINCT Country) FROM Customers; -- 21
SELECT COUNT(CustomerID) FROM Customers
WHERE Country = 'Brazil';

-- DISTINCT : 중복제거
SELECT Country FROM Customers; -- 91개
SELECT DISTINCT Country FROM Customers; -- 21개
SELECT DISTINCT Country 
FROM Customers
ORDER BY 1;
SELECT DISTINCT Country 
FROM Customers
ORDER BY Country;
