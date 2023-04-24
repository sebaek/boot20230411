SELECT COUNT(*) FROM Products; -- 77개 행
SELECT COUNT(*) FROM Categories; -- 8개 행
SELECT COUNT(*) FROM Suppliers;  -- 29개 행
DESC Products; -- 6개 열
DESC Categories; -- 3개 열
DESC Suppliers; -- 8개 열

SELECT * FROM 
Products JOIN Categories JOIN Suppliers; -- 17개 열
SELECT COUNT(*) FROM 
Products JOIN Categories JOIN Suppliers; -- 17864개 행

SELECT * FROM 
Products p JOIN Categories c ON p.CategoryID = c.CategoryID
           JOIN Suppliers s ON p.SupplierID = s.SupplierID; -- 77개행
           
-- 예) 1번 상품의 상품명, 카테고리명, 공급자명
SELECT p.ProductName, c.CategoryName, s.SupplierName
FROM Products p JOIN Categories c ON p.CategoryID = c.CategoryID
                JOIN Suppliers s ON p.SupplierID = s.SupplierID
WHERE p.ProductID = 1;
           

