-- IN 특정 값 중에 있으면...
SELECT * FROM Customers
WHERE Country = 'Germany' OR Country = 'France';
SELECT * FROM Customers
WHERE Country IN ('Germany', 'France');

-- 3, 5 번 카테고리에 속한 상품들 조회
