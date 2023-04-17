-- HAVING : 집계함수의 조건 설정
SELECT Country, COUNT(CustomerID) 
FROM Customers
GROUP BY Country;

-- 5명 이상의 고객이 있는 나라 조회
SELECT Country, COUNT(CustomerID) numOfCustomer
FROM Customers
WHERE numOfCustomer >= 5 -- record를 거르는 조건
GROUP BY Country;

SELECT Country, COUNT(CustomerID) numOfCustomer
FROM Customers
GROUP BY Country
HAVING numOfCustomer >= 5;
