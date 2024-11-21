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


-- Завдання 4: Створення процедури для вставки даних з перевіркою та транзакцією
DELIMITER //
CREATE PROCEDURE InsertEmployeeData (
    IN inPhone VARCHAR(20),
    IN inNamesWorker VARCHAR(40),
    IN inSalary DECIMAL(10, 2),
    IN inPositionWorker VARCHAR(20),
    IN inBornDate DATE,
    IN inFamilyStatus VARCHAR(30),
    IN inLivePlace VARCHAR(70)
)
BEGIN
    DECLARE phoneExists INT;

    -- Початок транзакції
    START TRANSACTION;

    -- Перевірка, чи існує співробітник із заданим номером телефону
    SELECT COUNT(*) INTO phoneExists
    FROM PhoneAndName
    WHERE Phone = inPhone;

    IF phoneExists > 0 THEN
        -- Відкат транзакції, якщо співробітник із таким телефоном вже існує
        ROLLBACK;
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Співробітник з таким телефоном вже існує.';
    ELSE
        -- Вставка даних у таблицю PhoneAndName
        INSERT INTO PhoneAndName (Phone, NamesWorker)
        VALUES (inPhone, inNamesWorker);

        -- Вставка даних у таблицю SalaryPosition
        INSERT INTO SalaryPosition (Salary, PositionWorker)
        VALUES (inSalary, inPositionWorker);

        -- Вставка даних у таблицю FamilyBornLivePlace
        INSERT INTO FamilyBornLivePlace (BornDate, FamilyStatus, LivePlace)
        VALUES (inBornDate, inFamilyStatus, inLivePlace);

        -- Підтвердження транзакції
        COMMIT;
    END IF;
END //
DELIMITER ;

-- Завдання 5: Створення тригера для забезпечення цілісності даних
DELIMITER //
CREATE TRIGGER BeforeEmployeeDelete
BEFORE DELETE ON PhoneAndName
FOR EACH ROW
BEGIN
    -- Видалення записів із таблиці SalaryPosition
    DELETE FROM SalaryPosition
    WHERE id = OLD.id;

    -- Видалення записів із таблиці FamilyBornLivePlace
    DELETE FROM FamilyBornLivePlace
    WHERE id = OLD.id;
END //
DELIMITER ;

-- Приклад використання процедури InsertEmployeeData
CALL InsertEmployeeData(
    '380987654321',
    'Том Генкс',
    90000.00,
    'Менеджер',
    '1960-07-09',
    'одружений',
    'Львів, вул. Франка 12, кв. 5'
);

-- Спроба вставити співробітника з тим самим телефоном для демонстрації відкату
CALL InsertEmployeeData(
    '380996667788',
    'Крістіан Бейл',
    85000.00,
    'Робітник',
    '1974-01-30',
    'не одружений',
    'Одеса, вул. Дерибасівська 1, кв. 10'
);
