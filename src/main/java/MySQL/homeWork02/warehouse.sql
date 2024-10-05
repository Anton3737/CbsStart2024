CREATE DATABASE wholesale_warehouse;

USE wholesale_warehouse;

CREATE TABLE Suppliers(
supplier_id int auto_increment,
name varchar(255) not null,
contact_person varchar(255) not null,
phone varchar(20) not null,
email varchar(255) not null,
address varchar(255),
created date,
primary key(supplier_id)
);

CREATE TABLE Staff(
staff_id int auto_increment,
first_name varchar(255) not null,
last_name varchar(255) not null,
staff_position varchar(255) not null,
phone varchar(20) not null,
email varchar(255),
start_job_date date,
salary decimal(10,2),
primary key(staff_id)
);

CREATE TABLE Customers(
customer_id int auto_increment,
company_name varchar(255) not null,
contact_person varchar(255) not null,
phone varchar(20) not null,
email varchar(255),
address varchar(255) not null,
discount_rate decimal(10,2) not null,
primary key(customer_id)
);

CREATE TABLE Products(
product_id int auto_increment,
stuff_name varchar(255),
supplier_id int,
price decimal(10,2),
quantity decimal(10,6),
description text,
delivery_date date,
primary key (product_id),
foreign key (supplier_id) references Suppliers(supplier_id)
);

CREATE TABLE Orders(
order_id int auto_increment,
customer_id int,
staff_id int,
order_date date,
total_amount decimal(10,2),
primary key(order_id),
foreign key (customer_id) references Customers(customer_id),
foreign key (staff_id) references Staff(staff_id)
);

CREATE TABLE OrderDetails(
order_detail_id int auto_increment,
order_id int,
product_id int,
quantity int,
price decimal(10,2),
primary key(order_detail_id),
foreign key (order_id) references Orders(order_id),
foreign key (product_id) references Products(product_id)

);

INSERT INTO Suppliers (name, contact_person, phone, email, address, created) VALUES
('Книгарня Є', 'Ольга Іваненко', '+380501234567', 'ivanenko@knyharnya.com', 'Київ, вул. Хрещатик, 36', '2023-05-10'),
('Буква', 'Андрій Петренко', '+380671234567', 'petrenko@bukva.ua', 'Львів, вул. Галицька, 12', '2022-11-15'),
('Видавництво Старого Лева', 'Марина Коваленко', '+380631234567', 'kovalenko@starylev.com.ua', 'Одеса, вул. Дерибасівська, 3', '2021-08-20');


INSERT INTO Staff (first_name, last_name, staff_position, phone, email, start_job_date, salary) VALUES
('Олександр', 'Шевченко', 'Менеджер', '+380931234567', 'shevchenko@knyharnya.com', '2020-01-15', 12000.00),
('Марія', 'Кравченко', 'Продавець', '+380671234888', 'kravchenko@bukva.ua', '2019-09-10', 10000.00),
('Ігор', 'Гончар', 'Касир', '+380501239999', 'gonchar@starylev.com.ua', '2021-02-28', 9000.00);


INSERT INTO Customers (company_name, contact_person, phone, email, address, discount_rate) VALUES
('ТОВ Літера', 'Катерина Волошина', '+380671234999', 'voloshina@litera.ua', 'Київ, вул. Прорізна, 5', 10.50),
('ФОП Дмитренко', 'Олексій Дмитренко', '+380931234888', 'dmytrenko@fop.com', 'Львів, вул. Зелена, 45', 7.00),
('ТОВ Читач', 'Галина Савченко', '+380501234222', 'savchenko@chytach.ua', 'Одеса, вул. Пушкінська, 10', 12.00);


INSERT INTO Products (stuff_name, supplier_id, price, quantity, description, delivery_date) VALUES
('Книга "Маруся Чурай"', 1, 220.00, 40.000000, 'Історичний роман Ліни Костенко', '2023-08-25'),
('Книга "Солодка Даруся"', 2, 160.00, 60.000000, 'Роман Марії Матіос про трагедії карпатської родини', '2023-09-10'),
('Книга "Кайдашева сім\'я"', 1, 140.50, 85.000000, 'Класичний твір Івана Нечуя-Левицького', '2023-09-02'),
('Книга "Хіба ревуть воли, як ясла повні?"', 3, 180.00, 70.000000, 'Соціальний роман Панаса Мирного', '2023-08-30'),
('Книга "Лісова пісня"', 2, 130.00, 100.000000, 'Драма-феєрія Лесі Українки', '2023-09-05'),
('Книга "Місто"', 1, 210.00, 50.000000, 'Модерністський роман Валер\'яна Підмогильного', '2023-08-28'),
('Книга "Тигролови"', 3, 250.00, 45.000000, 'Пригодницький роман Івана Багряного', '2023-09-07'),
('Книга "Записки українського самашедшого"', 2, 195.00, 65.000000, 'Психологічний роман Ліни Костенко', '2023-09-12'),
('Книга "Ворошиловград"', 1, 275.00, 55.000000, 'Сучасний роман Сергія Жадана', '2023-09-14'),
('Книга "Фелікс Австрія"', 3, 230.00, 75.000000, 'Історична проза Софії Андрухович', '2023-09-20');


INSERT INTO Orders (customer_id, staff_id, order_date, total_amount) VALUES
(1, 1, '2023-09-10', 1500.00),
(2, 2, '2023-09-12', 1353.75),
(3, 3, '2023-09-15', 2500.00);


INSERT INTO OrderDetails (order_id, product_id, quantity, price) VALUES
(1, 1, 5, 220.00),  -- 5 книг "Маруся Чурай"
(1, 3, 10, 140.50), -- 10 книг "Кайдашева сім'я"
(2, 2, 8, 160.00),  -- 8 книг "Солодка Даруся"
(2, 6, 3, 210.00),   -- 3 книги "Місто"
(3, 7, 7, 250.00),   -- 7 книг "Тигролови"
(3, 10, 5, 230.00);  -- 5 книг "Фелікс Австрія"





























