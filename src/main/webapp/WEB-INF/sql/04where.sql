-- = 같다
-- <> 다르다
SELECT * FROM Customers; -- 91개
SELECT * FROM Customers
WHERE Country = 'Mexico'; -- 5개
SELECT * FROM Customers
WHERE Country <> 'Mexico'; -- 86개
SELECT * FROM Customers
WHERE Country != 'Mexico'; -- 86개

-- 문제1) 나라가 USA가 아닌 공급자들 조회
SELECT * FROM Suppliers
WHERE Country <> 'USA';
SELECT SupplierName FROM Suppliers
WHERE Country != 'USA';