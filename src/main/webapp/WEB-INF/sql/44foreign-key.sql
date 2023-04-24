-- 학생명, 전화번호(여러개 가능)
CREATE TABLE Student (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	Name VARCHAR(50)
);
CREATE TABLE StudentPhone (
	Id INT PRIMARY KEY AUTO_INCREMENT,
	StudentId INT,
	Phone VARCHAR(50),
    -- foreign key (외래키 참조키)
    FOREIGN KEY (StudentId) REFERENCES Student(Id)
);

DESC Student;
DESC StudentPhone;




