-- NOT NULL : NULL 허용 안함
CREATE TABLE MyTable17 (
	Col1 INT,
    Col2 INT NOT NULL
);
INSERT INTO MyTable17 (Col1, Col2) 
VALUES (100, 200); -- ok
INSERT INTO MyTable17 (Col2)
VALUES (200); -- ok
INSERT INTO MyTable17 (Col1)
VALUES (100); -- fail
SELECT * FROM MyTable17;

-- 연습 ) MyTable18, 두개 컬럼, VARCHAR(20)
-- 두번째 컬러만 NOT NULL 제약사항 적용






