-- DELETE : 테이블의 record 지우기

-- 매우 주의!!!! 

DELETE 
FROM Customers -- 지울 테이블 명
WHERE CustomerID = 94; -- 지울 레코드의 조건
;
-- 지우기전 같은 테이블 같은 조건으로 SELECT 하기!!
SELECT * 
FROM Customers -- 지울 테이블 명
WHERE CustomerID = 94; -- 지울 레코드의 조건

-- 93번 고객 지우기
-- 78번 상품 지우기
-- 79번 상품 지우기




