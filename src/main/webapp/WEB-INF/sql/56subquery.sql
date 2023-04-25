USE w3schools;

SELECT lastName, firstName FROM Employees;

SELECT lastName, firstName
FROM (SELECT lastName, firstName FROM Employees) emp
WHERE lastName >= 'd' AND lastName < 'e';




