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



