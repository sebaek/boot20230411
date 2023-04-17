-- update : 레코드 수정

SELECT * FROM Customers WHERE CustomerID = 1;

UPDATE Customers            -- 테이블명
SET CustomerName = '서태웅' -- 변경할 컬럼과 값
WHERE CustomerID = 1;       -- 변경할 레코드의 조건
SELECT * FROM Customers WHERE CustomerID = 1;

UPDATE Customers
SET 					      -- 변경할 컬럼과 값 (,)
	CustomerName = '정대만',
    City = 'Seoul',
    Country = 'Korea'
WHERE CustomerID = 1;
    



