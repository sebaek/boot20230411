-- group by : 집계함수를 그룹별로 리턴할 때 사용

SELECT SUM(Price) FROM Products;
SELECT CategoryID, SUM(Price) FROM Products
GROUP BY CategoryID;

SELECT Country, COUNT(CustomerID) FROM Customers
GROUP BY Country;

-- 나라별 고객 수를 나라이름 역순으로 조회
SELECT Country, COUNT(CustomerID) FROM Customers
GROUP BY Country
ORDER BY Country DESC;
-- 고객이 많은 나라순 조회
SELECT Country, COUNT(CustomerID) FROM Customers
GROUP BY Country
ORDER BY 2 DESC;

-- 고객이 가장 많은 나라 조회
SELECT Country, COUNT(CustomerID) FROM Customers
GROUP BY Country
ORDER BY 2 DESC
LIMIT 0, 1;


