-- LIMIT m    위에서 부터 m개
-- LIMIT 0, m

-- LIMIT n, m   n번부터 m개

SELECT * FROM Customers ORDER BY CustomerID;
SELECT * FROM Customers ORDER BY CustomerID LIMIT 3;
SELECT * FROM Customers ORDER BY CustomerID LIMIT 0, 3;

SELECT * FROM Customers ORDER BY CustomerID LIMIT 3, 3;

SELECT * FROM Customers ORDER BY CustomerID LIMIT 6, 3;

-- 두번째로 나이가 많은 직원 조회

-- 2번 카테고리 상품 중 두번째로 가격이 비싼 상품 조회

