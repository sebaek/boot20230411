USE w3schools;

SELECT lastName, firstName FROM Employees;

SELECT lastName, firstName
FROM (SELECT lastName, firstName FROM Employees) emp
WHERE lastName >= 'd' AND lastName < 'e';

-- 고객별 소비금액
SELECT AVG(구매금액) FROM 
(SELECT c.CustomerID, c.CustomerName, SUM(p.Price * od.Quantity) 구매금액 
FROM
	Orders o JOIN OrderDetails od ON o.OrderID = od.OrderID
		     JOIN Customers c ON o.CustomerID = c.CustomerID
             JOIN Products p ON od.ProductID = p.ProductID
GROUP BY c.CustomerID
ORDER BY 구매금액 DESC) t1;


