-- CARTESIAN PRODUCT (곱집합) 카테시안 곱
SELECT COUNT(*) FROM Products; -- 77
SELECT COUNT(*) FROM Categories; -- 8

SELECT COUNT(*) 
FROM Products JOIN Categories; -- 616

SELECT * FROM Products JOIN Categories;



