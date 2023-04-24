DESC Orders;
SELECT * FROM Orders o JOIN Customers c
ON o.CustomerID = c.CustomerID; -- 830
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CustomerID = c.CustomerID; -- 832
SELECT * FROM Orders o RIGHT JOIN Customers c
ON o.CustomerID = c.CustomerID
WHERE o.OrderId IS NULL; -- 주문한적 없는 고객

