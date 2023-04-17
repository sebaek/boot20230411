-- null : 값이 없음
-- null vs '' : 데이터베이스 마다 다름

-- IS NULL : 값이 null 인가?
SELECT * FROM Suppliers
WHERE ContactName = '';
SELECT * FROM Suppliers
WHERE ContactName IS NULL;

-- IS NOT NULL : 값이 NULL 아닌 컬럼 조회
SELECT * FROM Suppliers
WHERE NOT ContactName IS NULL
ORDER BY 1 DESC;
SELECT * FROM Suppliers
WHERE ContactName IS NOT NULL
ORDER BY 1 DESC;