USE w3schools;

-- order by : 결과의 순서를 정할 때 사용

SELECT CustomerID, CustomerName, ContactName -- column 명들
FROM Customers 					 -- table
WHERE 							 -- 선택할 records의 조건
	CustomerID < 10 
ORDER BY ContactName ASC; 

SELECT CustomerID, CustomerName, ContactName -- column 명들
FROM Customers 					 -- table
WHERE 							 -- 선택할 records의 조건
	CustomerID < 10 
ORDER BY ContactName DESC; 

SELECT * FROM Customers
ORDER BY CustomerName DESC;

SELECT * FROM Customers
ORDER BY Country ASC;

SELECT * FROM Customers
ORDER BY Country;

-- 모든 상품을 가격순으로 조회 (낮은 가격이 먼저 조회)

-- 모든 직원을 생년월일순 조회 (어린 직원이 먼저 조회)



