-- LIMIT m    위에서 부터 m개
-- LIMIT 0, m

-- LIMIT n, m   n번부터 m개

SELECT * FROM Customers ORDER BY CustomerID;
SELECT * FROM Customers ORDER BY CustomerID LIMIT 3;
SELECT * FROM Customers ORDER BY CustomerID LIMIT 0, 3;

SELECT * FROM Customers ORDER BY CustomerID LIMIT 3, 3;

SELECT * FROM Customers ORDER BY CustomerID LIMIT 6, 3;
