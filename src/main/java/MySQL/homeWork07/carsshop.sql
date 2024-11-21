-- Створення бази carsshop, якщо вона відсутня
CREATE DATABASE IF NOT EXISTS carsshop;
USE carsshop;

-- Таблиця Customers
CREATE TABLE Customers (
    CustomerID INT NOT NULL AUTO_INCREMENT,
    CustomerName VARCHAR(50) NOT NULL,
    BornDate DATE NOT NULL,
    PRIMARY KEY (CustomerID)
);

-- Таблиця Cars
CREATE TABLE Cars (
    CarID INT NOT NULL AUTO_INCREMENT,
    CarName VARCHAR(50) NOT NULL,
    CarPrice DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (CarID)
);

-- Таблиця Purchases
CREATE TABLE Purchases (
    PurchaseID INT NOT NULL AUTO_INCREMENT,
    CustomerID INT NOT NULL,
    CarID INT NOT NULL,
    PRIMARY KEY (PurchaseID),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID),
    FOREIGN KEY (CarID) REFERENCES Cars(CarID)
);

-- Вставка даних у Customers
INSERT INTO Customers (CustomerName, BornDate)
VALUES
('Олег Іванов', '1990-05-15'),
('Марія Петренко', '2000-11-20'),
('Іван Василенко', '1985-03-10');

-- Вставка даних у Cars
INSERT INTO Cars (CarName, CarPrice)
VALUES
('Toyota Corolla', 20000.00),
('Honda Civic', 22000.00),
('Mazda 3', 21000.00);

-- Вставка даних у Purchases
INSERT INTO Purchases (CustomerID, CarID)
VALUES
(1, 1),
(1, 3),
(2, 2);

-- Функція для знаходження мінімального віку
DELIMITER //
CREATE FUNCTION GetMinAge() RETURNS INT
BEGIN
    DECLARE minAge INT;
    SELECT MIN(YEAR(CURDATE()) - YEAR(BornDate)) INTO minAge
    FROM Customers;
    RETURN minAge;
END //
DELIMITER ;

-- Запит для вибірки машин наймолодшого клієнта
SELECT GetMinAge() AS MinAge;

SELECT c.CustomerName, c
