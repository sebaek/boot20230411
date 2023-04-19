-- Character(String) 문자형
-- VARCHAR(길이)
CREATE TABLE MyTable02 (
	Col1 VARCHAR(3),
    Col2 VARCHAR(5)
); 
SELECT * FROM MyTable02;
INSERT INTO MyTable02 (Col1, Col2) 
VALUES ('abc', 'abcde'); -- ok
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('ab', 'abcd'); -- ok
INSERT INTO MyTable02 (Col1, Col2)
VALUES ('abcd', 'abcdef'); -- fail




-- Numeric (수)



-- 날짜시간
