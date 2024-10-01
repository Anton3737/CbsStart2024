CREATE DATABASE carDB;

USE carDB;

CREATE TABLE cars (
    id INT AUTO_INCREMENT NOT NULL,
    brand VARCHAR(50),
    model VARCHAR(50),
    engine_volume DECIMAL(4, 2),
    price DECIMAL(10, 2),
    max_speed INT,
    PRIMARY KEY(id)
);

INSERT INTO cars (brand, model, engine_volume, price, max_speed)
VALUES
    ('Toyota', 'Corolla', 1.8, 20000.00, 180),
    ('Honda', 'Civic', 2.0, 22000.00, 200),
    ('Nissan', 'Altima', 2.5, 25000.00, 210),
    ('Mazda', '3', 2.0, 21000.00, 190),
    ('Subaru', 'Impreza', 2.5, 28000.00, 220),
    ('Mitsubishi', 'Lancer', 2.0, 23000.00, 200),
    ('Toyota', 'Camry', 2.5, 27000.00, 210),
    ('Honda', 'Accord', 2.4, 26000.00, 220),
    ('Nissan', '370Z', 3.7, 40000.00, 250),
    ('Lexus', 'IS 300', 3.0, 45000.00, 240);


SELECT * FROM cars;

DROP DATABASE carDB; 