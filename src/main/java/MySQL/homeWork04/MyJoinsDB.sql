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

-- Сделайте выборку при помощи JOIN’s для таких заданий:


-- Тест join
SELECT * FROM PhoneANDName
INNER JOIN FemilyBornLivePlase
ON PhoneANDName.id = FemilyBornLivePlase.id;




-- 1) Получите контактные данные сотрудников (номера телефонов, место жительства).

SELECT PhoneANDName.Phone , FemilyBornLivePlase.LivePlace   -- витягни поля Табилиця(PhoneANDName).поле(Phone Телефон) і Табилиця(FemilyBornLivePlase).поле(LivePlace адоеса)
FROM PhoneANDName										  	-- із таблиці PhoneANDName
JOIN FemilyBornLivePlase ON PhoneANDName.id = FemilyBornLivePlase.id;  -- співставив на полях PhoneANDName.id = FemilyBornLivePlase.id


-- 2) Получите информацию о дате рождения всех холостых сотрудников и их номера.


SELECT FemilyBornLivePlase.BornDate, FemilyBornLivePlase.Family, PhoneANDName.Phone
FROM PhoneANDName
JOIN FemilyBornLivePlase ON PhoneANDName.id = FemilyBornLivePlase.id
WHERE FemilyBornLivePlase.Family = 'не одружений';


-- 3) Получите информацию обо всех менеджерах компании: дату рождения и номер телефона.

SELECT FemilyBornLivePlase.BornDate,PhoneANDName.Phone   -- Беремо необхідні нам колонки з необхідних таблиць
FROM PhoneANDName									     -- Вихідна таблиця PhoneANDName
JOIN FemilyBornLivePlase ON FemilyBornLivePlase.id = PhoneANDName.id  -- вибірку робимо по Телефону ІД і Даті народження ІД її результат буле в - (PhoneANDName)
JOIN SaleryPosition ON SaleryPosition.id = FemilyBornLivePlase.id     -- вибірку робимо по Зарплаті ІД і Даті народження ІД  її результат буле в - (SaleryPosition)
WHERE SaleryPosition.PositionWorker = 'менеджер';                     -- відбираємо через WHERE у потрібній нам колоні по ключовому слову