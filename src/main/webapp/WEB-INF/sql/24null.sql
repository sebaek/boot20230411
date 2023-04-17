-- null 과의 연산은 모두 false
SELECT * FROM Products WHERE CategoryID = 2; -- 14
SELECT * FROM Products 
WHERE CategoryID = 2 
   AND Price >= 25.00; -- 4
SELECT * FROM Products 
WHERE CategoryID = 2 
   AND Price < 25.00; -- 8
SELECT * FROM Products
WHERE CategoryID = 2
   AND IFNULL(Price, 0) < 25.00; -- 10   
   
   
   
   