-- DEFAULT 기본값 정할 수 있음
CREATE TABLE MyTable14 (
	Col1 INT,
    Col2 INT DEFAULT 99
);
INSERT INTO MyTable14 (Col1, Col2)
VALUES (100, 200);
INSERT INTO MyTable14 (Col1)
VALUES (100); -- Col2에 99 입력됨
INSERT INTO MyTable14 (Col2)
VALUES (200); -- Col1은 null임

SELECT * FROM MyTable14;
CREATE TABLE MyTable15 (
	Col1 VARCHAR(30),
    Col2 VARCHAR(30) DEFAULT '기본'
);
-- 연습) 3개행 추가
-- 1) Col1과 Col2에 모두 값 넣기
-- 2) Col2에만 값 넣고
-- 3) Col1에만 값 넣기


