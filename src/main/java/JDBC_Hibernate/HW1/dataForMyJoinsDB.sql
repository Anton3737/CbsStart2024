-- Видалення таблиць, якщо вони існують
DROP TABLE IF EXISTS PhoneANDName;
DROP TABLE IF EXISTS SaleryPosition;
DROP TABLE IF EXISTS FemilyBornLivePlase;

-- Завдання 3: Створення таблиць
-- Таблиця імен і телефонів
CREATE TABLE PhoneANDName
(
    id          SERIAL PRIMARY KEY,
    Phone       VARCHAR(20),
    NamesWorker VARCHAR(40)
);

INSERT INTO PhoneANDName (id, Phone, NamesWorker)
VALUES (1, '380996667788', 'Рассел Кроу'),
       (2, '380634445566', 'Джони Депп'),
       (3, '380738881122', 'Ольга Польякова');

-- Таблиця зарплат і посад
CREATE TABLE SaleryPosition
(
    id             SERIAL PRIMARY KEY,
    Salery         NUMERIC(10, 2) NOT NULL,
    PositionWorker VARCHAR(20)
);

INSERT INTO SaleryPosition (id, Salery, PositionWorker)
VALUES (1, 111234.22, 'главный директор'),
       (2, 33121.99, 'менеджер'),
       (3, 5000.35, 'рабочий');

-- Таблиця сімейного стану, дати народження та місця проживання
CREATE TABLE FemilyBornLivePlase
(
    id        SERIAL PRIMARY KEY,
    BornDate  DATE,
    Family    VARCHAR(30),
    LivePlace VARCHAR(70)
);

INSERT INTO FemilyBornLivePlase (id, BornDate, Family, LivePlace)
VALUES (1, '1975-03-10', 'одружений', 'Київ вул.Золотоворітська 15 кв. 10'),
       (2, '1983-08-01', 'не одружений', 'Чернівці вул. Симона Петлюри 100 кв.2'),
       (3, '1999-10-18', 'одружена', 'Житомир вул. Шевченка 10 кв.  98');

-- Завдання 3: Створення індексів
CREATE INDEX idx_phone ON PhoneANDName (Phone);
CREATE INDEX idx_position ON SaleryPosition (PositionWorker);
CREATE INDEX idx_family ON FemilyBornLivePlase (Family);
CREATE INDEX idx_liveplace ON FemilyBornLivePlase (LivePlace);

-- Завдання 4: Створення відображень
-- 1. Контактні дані працівників
CREATE OR REPLACE VIEW ContactInfo AS
SELECT pn.NamesWorker AS WorkerName,
       pn.Phone       AS PhoneNumber,
       fb.LivePlace   AS Address
FROM PhoneANDName pn
         JOIN
     FemilyBornLivePlase fb ON pn.id = fb.id;

-- 2. Дата народження та номери телефонів неодружених працівників
CREATE OR REPLACE VIEW UnmarriedWorkersInfo AS
SELECT pn.NamesWorker AS WorkerName,
       fb.BornDate    AS BirthDate,
       pn.Phone       AS PhoneNumber
FROM PhoneANDName pn
         JOIN
     FemilyBornLivePlase fb ON pn.id = fb.id
WHERE fb.Family = 'не одружений';

-- 3. Дата народження та номери телефонів менеджерів
CREATE OR REPLACE VIEW ManagerInfo AS
SELECT pn.NamesWorker AS WorkerName,
       fb.BornDate    AS BirthDate,
       pn.Phone       AS PhoneNumber
FROM PhoneANDName pn
         JOIN
     FemilyBornLivePlase fb ON pn.id = fb.id
         JOIN
     SaleryPosition sp ON pn.id = sp.id
WHERE sp.PositionWorker = 'менеджер';
