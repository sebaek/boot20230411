USE w3schools;

-- AND
SELECT * 
FROM Customers
WHERE CustomerId > 4 AND Country = 'Germany';

SELECT * 
FROM Employees
WHERE LastName >= 'M' AND BirthDate >= '1960-01-01';

-- 카테고리ID가 2이고 가격이 20.00 이상인 상품들 조회
SELECT * FROM Products;


