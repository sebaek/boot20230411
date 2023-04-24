-- CARTESIAN PRODUCT (곱집합) 카테시안 곱
SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8

SELECT COUNT(*) 
FROM Products JOIN Categories; -- 616

SELECT * FROM Products JOIN Categories;

-- ON : 조인 조건
SELECT * FROM Products JOIN Categories 
ON Products.CategoryId = Categories.CategoryId;

-- 조인 후 컬럼 수 : 왼쪽테이블컬럼수 + 오른쪽테이블컬럼수
DESC Products; -- 6개 컬럼
DESC Categories; -- 3개 컬럼
SELECT * FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryId; -- 9개 컬럼

SELECT ProductName, CategoryName 
FROM Products JOIN Categories
ON Products.CategoryId = Categories.CategoryId;



