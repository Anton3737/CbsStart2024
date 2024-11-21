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

--Завдання 3: Задайте індекси на таблицях

-- Індекс на колонку Phone для швидкого пошуку за номерами телефонів
CREATE INDEX idx_phone ON PhoneANDName (Phone);

-- Індекс на PositionWorker для швидкого пошуку за посадою
CREATE INDEX idx_position ON SaleryPosition (PositionWorker);

-- Індекс на Family для швидкого пошуку співробітників за сімейним статусом
CREATE INDEX idx_family ON FemilyBornLivePlase (Family);

-- Індекс на LivePlace для оптимізації пошуку за місцем проживання
CREATE INDEX idx_liveplace ON FemilyBornLivePlase (LivePlace);


--Завдання 4: Створення відображення

--1. Контактні дані працівників:

CREATE VIEW ContactInfo AS
SELECT
    pn.NamesWorker AS WorkerName,
    pn.Phone AS PhoneNumber,
    fb.LivePlace AS Address
FROM
    PhoneANDName pn
JOIN
    FemilyBornLivePlase fb
ON
    pn.id = fb.id;

--2. Дата народження та номери телефонів неодружених працівників:

CREATE VIEW UnmarriedWorkersInfo AS
SELECT
    pn.NamesWorker AS WorkerName,
    fb.BornDate AS BirthDate,
    pn.Phone AS PhoneNumber
FROM
    PhoneANDName pn
JOIN
    FemilyBornLivePlase fb
ON
    pn.id = fb.id
WHERE
    fb.Family = 'не одружений';


--3. Дата народження та номери телефонів менеджерів:

CREATE VIEW ManagerInfo AS
SELECT
    pn.NamesWorker AS WorkerName,
    fb.BornDate AS BirthDate,
    pn.Phone AS PhoneNumber
FROM
    PhoneANDName pn
JOIN
    FemilyBornLivePlase fb
ON
    pn.id = fb.id
JOIN
    SaleryPosition sp
ON
    pn.id = sp.id
WHERE
    sp.PositionWorker = 'менеджер';



