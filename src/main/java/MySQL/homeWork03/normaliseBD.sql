CREATE DATABASE Normalise;
USE DATABASE Normalise;


CREATE TABLE Persons (
    PersonID SERIAL PRIMARY KEY,
    FullName VARCHAR(255) NOT NULL
);

CREATE TABLE Squads (
    SquadID SERIAL PRIMARY KEY,
    SquadNumber INT NOT NULL
);

CREATE TABLE Weapons (
    WeaponID SERIAL PRIMARY KEY,
    WeaponName VARCHAR(50) NOT NULL
);

CREATE TABLE WeaponDistribution (
    DistributionID SERIAL PRIMARY KEY,
    PersonID INT REFERENCES Persons(PersonID),
    SquadID INT REFERENCES Squads(SquadID),
    WeaponID INT REFERENCES Weapons(WeaponID),
    IssuedByID INT REFERENCES Persons(PersonID)
);


INSERT INTO Persons (FullName)
VALUES
    ('Петров В.А., оф. 205'),
    ('Лодарев П.С., оф. 221'),
    ('Іващенко А.А., оф. 201'),
    ('Духов Р.М.'),
    ('Буров О.С., майор'),
    ('Рибаков Н.Г., майор'),
    ('Деребанов В.Я., підполковник');


INSERT INTO Squads (SquadNumber)
VALUES
    (222),
    (232),
    (212),
    (200);

INSERT INTO Weapons (WeaponName)
VALUES
    ('АК-47'),
    ('Глок20'),
    ('АК-74');

INSERT INTO WeaponDistribution (PersonID, SquadID, WeaponID, IssuedByID)
VALUES
    (1, 1, 1, 5), -- Петров В.А., 222, АК-47, Буров О.С.
    (1, 1, 2, 6), -- Петров В.А., 222, Глок20, Рибаков Н.Г.
    (2, 2, 3, 7), -- Лодарев П.С., 232, АК-74, Деребанов В.Я.
    (2, 2, 2, 6), -- Лодарев П.С., 232, Глок20, Рибаков Н.Г.
    (3, 3, 1, 5), -- Іващенко А.А., 212, АК-47, Буров О.С.
    (3, 3, 2, 6), -- Іващенко А.А., 212, Глок20, Рибаков Н.Г.
    (4, 4, 1, 5); -- Духов Р.М., 200, АК-47, Буров О.С.


SELECT
    wd.DistributionID,
    p.FullName AS PersonName,
    s.SquadNumber,
    w.WeaponName,
    i.FullName AS IssuedBy
FROM
    WeaponDistribution wd
JOIN Persons p ON wd.PersonID = p.PersonID
JOIN Squads s ON wd.SquadID = s.SquadID
JOIN Weapons w ON wd.WeaponID = w.WeaponID
JOIN Persons i ON wd.IssuedByID = i.PersonID;
