-- +, -, *, /, %
SELECT * FROM Products;
SELECT ProductName, Price * 1300 FROM Products;
SELECT ProductName, Price * 1300 AS wonPrice 
FROM Products;

SELECT ProductName, Price / 100 FROM Products;
SELECT ProductName, Price + 100 FROM Products;
SELECT ProductName, Price - 100 FROM Products;

-- 문자열 연결
SELECT City + Country FROM Customers; -- x
SELECT CONCAT(City, Country) FROM Customers; -- ok
SELECT CONCAT(City, ",", Country) FROM Customers; -- ok
SELECT CONCAT(City, " ", Country) FROM Customers; -- ok
SELECT CONCAT(City, " ", Country) cityOfCountry
FROM Customers; -- ok

-- 직원이름 "firstName, LastName"형식으로 조회
SELECT CONCAT(FirstName, ", ", LastName) fullName
FROM Employees;

-- 원화(* 1300)로 10만원 이상인 상품들 조회
SELECT * FROM Products
WHERE Price*1300 >= 100000;
SELECT * FROM Products
WHERE Price >= 100000 / 1300;
SELECT ProductId, 
ProductName, 
SupplierID, 
CategoryID, 
Unit,
Price dollor,
Price * 1300 won FROM Products
WHERE Price >= 100000 / 1300;
SELECT *,
Price * 1300 won FROM Products
WHERE Price >= 100000 / 1300;

