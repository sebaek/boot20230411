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

-- 연습)
-- MyTable03 
-- 3개의 컬럼
-- 첫번째 컬럼 Type : 문자열 10개까지 저장가능
-- 두번째 컬럼 Type : 문자열 100개까지 저장가능
-- 세번째 컬럼 Type : 문자열 1000개까지 저장가능
CREATE TABLE MyTable03 (
	MyCol1 VARCHAR(10), 
    Col2 VARCHAR(100),
    Col3 VARCHAR(1000)
);
DESC MyTable03; 

-- Numeric (수)
-- int 정수형
-- decimal, dec 실수형
CREATE TABLE MyTable04 (
	Col1 INT
);
DESC MyTable04;
INSERT INTO MyTable04 (Col1) VALUES (33); -- ok
INSERT INTO MyTable04 (Col1) 
VALUES (1234567890); -- ok
INSERT INTO MyTable04 (Col1) 
VALUES (999999999); -- ok
INSERT INTO MyTable04 (Col1)
VALUES (3.14); -- 소수점 이하 생략
SELECT * FROM MyTable04;

-- 연습 ) MyTable05 만들기
-- 두개의 컬럼이 모두 정수 저장 가능
CREATE TABLE MyTable05 (
	Col1 INT,
    Col2 INT
);
DESC MyTable05;
-- 최대값 : 2147483647
-- 최소값 : -2147483648
INSERT INTO MyTable05 (Col1, Col2)
VALUES (2147483647, -2147483648); -- ok
INSERT INTO MyTable05 (Col1, Col2)
VALUES (2147483648, -2147483648); -- fail
SELECT * FROM MyTable05;


-- DEC  실수형
-- DEC(총길이, 소수점이하길이) 
CREATE TABLE MyTable06 (
	Col1 DEC(5, 2),
    Col2 DEC(3, 1)
);
INSERT INTO MyTable06 (Col1) VALUES (999.99); -- ok
INSERT INTO MyTable06 (Col1) VALUES (-999.99); -- ok
INSERT INTO MyTable06 (Col1) VALUES (1000.99); -- fail
INSERT INTO MyTable06 (Col1) VALUES (999.999); -- fail
SELECT * FROM MyTable06;

-- 연습) MyTable07 만들기
-- 두개 컬럼 (실수형), 총길이, 소수점이하길이 직접 작성


-- 날짜시간
