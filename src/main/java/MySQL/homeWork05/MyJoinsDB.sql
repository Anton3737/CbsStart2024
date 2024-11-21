USE MyJoinsDB;

DROP TABLE PhoneANDName;
DROP TABLE SaleryPosition;
DROP TABLE FemilyBornLivePlase;

-- Задание 3
-- В данной базе данных создайте 3 таблицы,
-- В 1-й таблице содержатся имена и номера телефонов сотрудников компании. +
-- Во 2-й таблице содержатся ведомости о зарплате и должностях сотрудников:  +
-- главный директор, менеджер, рабочий.
-- В 3-й таблице содержится информация о семейном положении, дате рождения, и месте проживания.+

CREATE TABLE PhoneANDName(

id INT NOT NULL,
Phone VARCHAR(20),
NamesWorker VARCHAR(40),

PRIMARY KEY(id)

);

INSERT INTO PhoneANDName
(id, Phone, NamesWorker)
VALUES
(1, '380996667788', 'Рассел Кроу'),
(2, '380634445566', 'Джони Депп'),
(3, '380738881122', 'Ольга Польякова');



CREATE TABLE SaleryPosition(

id INT NOT NULL,
Salery DOUBLE NOT NULL,
PositionWorker VARCHAR(20),

PRIMARY KEY (id)

);
INSERT INTO SaleryPosition
(id, Salery, PositionWorker)
VALUES
(1, 111234.22,'главный директор'),
(2, 33121.99,'менеджер'),
(3, 5000.35,'рабочий');



CREATE TABLE FemilyBornLivePlase(

id INT NOT NULL,
BornDate VARCHAR(10),
Family VARCHAR(30),
LivePlace VARCHAR(70),

PRIMARY KEY (id)

);

INSERT INTO FemilyBornLivePlase
(id, BornDate, Family, LivePlace)
VALUES
(1, '10/03/1975','одружений', 'Київ вул.Золотоворітська 15 кв. 10'),
(2, '01/08/1983','не одружений','Чернівці вул. Симона Петлюри 100 кв.2'),
(3, '18/10/1999','одружена','Житомир вул. Шевченка 10 кв.  98');

-- ------------------------------------------------------------------------------------------------------

-- Задание 4


--1. Отримання контактних даних співробітників (номери телефонів, місце проживання):
SELECT
    p.NamesWorker AS Name,
    p.Phone AS Phone,
    f.LivePlace AS Address
FROM
    PhoneANDName p
JOIN
    FemilyBornLivePlase f
ON
    p.id = f.id;


--2. Отримання інформації про дату народження всіх неодружених співробітників та їх номери:

SELECT
    f.BornDate AS BirthDate,
    p.Phone AS Phone
FROM
    FemilyBornLivePlase f
JOIN
    PhoneANDName p
ON
    f.id = p.id
WHERE
    f.Family = 'не одружений';

--3. Отримання інформації про всіх менеджерів компанії: дату народження та номер телефону:
SELECT
    p.NamesWorker AS Name,
    f.BornDate AS BirthDate,
    p.Phone AS Phone
FROM
    PhoneANDName p
JOIN
    FemilyBornLivePlase f
ON
    p.id = f.id
JOIN
    SaleryPosition s
ON
    p.id = s.id
WHERE
    s.PositionWorker = 'менеджер';


--Отримання імен покупців та імен співробітників, у яких TotalPrice товару більше 1000:

USE ShopDB;

SELECT
    c.CustomerName AS CustomerName,
    e.NamesWorker AS EmployeeName
FROM
    Orders o
JOIN
    Customers c
ON
    o.CustomerID = c.CustomerID
JOIN
    Employees e
ON
    o.EmployeeID = e.EmployeeID
WHERE
    o.TotalPrice > 1000;
