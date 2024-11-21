-- Створення бази даних
CREATE DATABASE IF NOT EXISTS MyFunkDB;
USE MyFunkDB;

-- Таблиця 1: Імена та номери телефонів співробітників
CREATE TABLE PhoneAndName (
    id INT NOT NULL AUTO_INCREMENT,
    Phone VARCHAR(20) NOT NULL,
    NamesWorker VARCHAR(40) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO PhoneAndName (Phone, NamesWorker)
VALUES
('380996667788', 'Рассел Кроу'),
('380634445566', 'Джоні Депп'),
('380738881122', 'Ольга Полякова');

-- Таблиця 2: Зарплати та посади
CREATE TABLE SalaryPosition (
    id INT NOT NULL AUTO_INCREMENT,
    Salary DECIMAL(10, 2) NOT NULL,
    PositionWorker VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO SalaryPosition (Salary, PositionWorker)
VALUES
(111234.22, 'головний директор'),
(33121.99, 'менеджер'),
(5000.35, 'робітник');

-- Таблиця 3: Сімейний стан, дати народження, місце проживання
CREATE TABLE FamilyBornLivePlace (
    id INT NOT NULL AUTO_INCREMENT,
    BornDate DATE NOT NULL,
    FamilyStatus VARCHAR(30) NOT NULL,
    LivePlace VARCHAR(70) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO FamilyBornLivePlace (BornDate, FamilyStatus, LivePlace)
VALUES
('1975-03-10', 'одружений', 'Київ, вул. Золотоворітська 15, кв. 10'),
('1983-08-01', 'не одружений', 'Чернівці, вул. Симона Петлюри 100, кв. 2'),
('1999-10-18', 'одружена', 'Житомир, вул. Шевченка 10, кв. 98');

-- Процедура 1: Контактні дані співробітників
DELIMITER //
CREATE PROCEDURE GetContactInfo()
BEGIN
    SELECT
        pn.NamesWorker AS WorkerName,
        pn.Phone AS PhoneNumber,
        fb.LivePlace AS Address
    FROM
        PhoneAndName pn
    JOIN
        FamilyBornLivePlace fb
    ON
        pn.id = fb.id;
END //
DELIMITER ;

-- Процедура 2: Інформація про неодружених співробітників
DELIMITER //
CREATE PROCEDURE GetUnmarriedWorkersInfo()
BEGIN
    SELECT
        pn.NamesWorker AS WorkerName,
        fb.BornDate AS BirthDate,
        pn.Phone AS PhoneNumber
    FROM
        PhoneAndName pn
    JOIN
        FamilyBornLivePlace fb
    ON
        pn.id = fb.id
    WHERE
        fb.FamilyStatus = 'не одружений';
END //
DELIMITER ;

-- Процедура 3: Інформація про менеджерів
DELIMITER //
CREATE PROCEDURE GetManagerInfo()
BEGIN
    SELECT
        pn.NamesWorker AS WorkerName,
        fb.BornDate AS BirthDate,
        pn.Phone AS PhoneNumber
    FROM
        PhoneAndName pn
    JOIN
        FamilyBornLivePlace fb
    ON
        pn.id = fb.id
    JOIN
        SalaryPosition sp
    ON
        pn.id = sp.id
    WHERE
        sp.PositionWorker = 'менеджер';
END //
DELIMITER ;

