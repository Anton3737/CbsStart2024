CREATE DATABASE MyDB;

USE MyDB;


CREATE TABLE worker(   

id INT AUTO_INCREMENT NOT NULL,
Workername VARCHAR(20),
Phone VARCHAR(20),
PRIMARY KEY(id)

);

CREATE TABLE Position_Salary(

id INT AUTO_INCREMENT NOT NULL,
Salary INT(10) NOT NULL,
PositionWorker VARCHAR(20),
PRIMARY KEY(id)

);

CREATE TABLE personaldata( 
									
id INT AUTO_INCREMENT NOT NULL,
Marital_status VARCHAR(20),
Data_Born VARCHAR(10),
City VARCHAR(20),
PRIMARY KEY(id)

);


INSERT INTO worker (Workername, Phone)
VALUES
('Антон', '+380661234567'),
('ЮЛіЯ', '+380991234567'),
('ОльгА', '+380671234567'),
('Катерина', '+380931234567'),
('Дмитро', '+380501234567'),
('Надіія', '+380661234568'),
('Олег', '+380931234568'),
('ОкСАнА', '+380991234568'),
('МикоЛА', '+380501234569'),
('Марія', '+380671234569');


INSERT INTO PositIOn_Salary (SalaRy, PositionWorkeR)
VALUES
(15000, 'Junior Java DeV.'),
(25000, 'Middle JAvA DEV.'),
(35000, 'Senior Java DeV.r'),
(10000, 'QA Engineer'),
(8000, 'Support Engineer'),
(50000, 'Project Manager'),
(40000, 'Team Lead'),
(10000, 'HR Specialist'),
(27000, 'SYSTEm AdministraTOr'),
(37000, 'UX/UI DesiGNeR');

INSERT INTO personaldata (MARITAL_status, Data_Born, CiTY)
VALUES
('Неодружений', '1995-01-15', 'Київ'),
('НеодрУжЕНИЙ', '1988-05-24', 'Львів'),
('Неодружений', '1990-11-03', 'Миколаїв'),
('НеодружениЙ', '1985-06-12', 'Харків'),
('Неодружений', '1992-08-30', 'Рівне'),
('Неодружений', '1997-12-22', 'Одеса'),
('НеодружЕний', '1989-09-19', 'Луцьк'),
('Неодружений', '1994-04-05', 'Тернопіль'),
('Одружений', '1983-07-08', 'Полтава'),
('Неодружений', '1996-03-29', 'Чернівці');


SELECT * FROM Position_SAlary WHERE SaLArY > 10000;

UPDATE personAldata SET MarItal_status = 'ОдруженИЙ' WHERE id = 3;

SELECT * FROM persoNaldata;


Drop daTAbAse MyDB;

