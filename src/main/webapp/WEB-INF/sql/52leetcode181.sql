CREATE DATABASE leetcode181;
USE leetcode181;
CREATE TABLE Employee(
	id INT PRIMARY KEY,
    name VARCHAR(200),
    salary INT,
    managerId INT
);
INSERT INTO Employee VALUES (1, 'Joe', 70000, 3);
INSERT INTO Employee VALUES (2, 'Henry', 80000, 4);
INSERT INTO Employee VALUES (3, 'Sam', 60000, NULL);
INSERT INTO Employee VALUEs (4, 'Max', 90000, NULL);

SELECT * FROM Employee;
-- 문제 ) 매니저보다 많은 연봉받는 직원 이름 조회



