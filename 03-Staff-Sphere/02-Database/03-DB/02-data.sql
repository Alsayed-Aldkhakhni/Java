-- Active: 1740760354307@@172.18.0.2@3306@staff_sphere
###############################################################
# Subject: Filling the Database with data.
# Date   : Jan 30, 2025
# Author : Alsayed A. Khaleel
###############################################################

INSERT INTO staff_sphere.persons (
    first_name,
    last_name,
    phone_number,
    salary,
    address,
    birth_date,
    gender
)
VALUES
    ('Alsayed', 'Khaleel', '11356789', 7500.00, '456 Qina EG', '1999-05-12', 'M'),
    ('Adel', 'Mostafa', '123456788', 7500.00, '258 Shebeen EG', '2003-10-18', 'M'),
    ('Hoda', 'Ahmed', '123456787', 5000.00, '961 Cairo EG', '1995-10-10', 'F'),
    ('Moamen', 'Mohammed', '123456786', 10000.00, '123 Tanta EG', '1999-05-12', 'M'),
    ('Mostafa', 'Saad', '123456785', 99000.00, '456 Giza EG', '2003-10-18', 'M'),
    ('Samieer', 'Mostafa', '123456784', 55000.00, '789 Cairo EG', '2000-09-10', 'M'),
    ('Khalid', 'Waleed', '123456783', 5000.00, '789 Shebeen EG', '2003-10-18', 'M'),
    ('Ali', 'Alsayed', '123456782', 7000.00, '789 Tanta EG', '2000-09-10', 'M'),
    ('Soha', 'Basim', '123456781', 6000.00, '256 Shebeen EG', '2003-10-18', 'F'),
    ('Goda', 'Ragab', '113455789', 3000.00, '256 Cairo EG', '1999-05-12', 'M'),
    ('Ahmed', 'Sameer', '123456779', 4000.00, '369 Qina EG', '2000-09-10', 'M'),
    ('Mitwally', 'Moataz', '123456769', 9000.00, '369 Shebeen EG', '2001-09-10', 'M'),
    ('Adel', 'Mosaad', '123456759', 9500.00, '369 Giza EG', '2001-09-10', 'M'),
    ('Samir', 'Fakhr', '123456749', 2500.00, '853 Cairo EG', '2001-09-10', 'M'),
    ('Monier', 'Amr', '123456739', 15000.00, '853 Shebeen EG', '1999-05-12', 'M'),
    ('Tarik', 'Hamed', '123456729', 3500.00, '853 Tanta EG', '2001-09-11', 'M'),
    ('Abdallah', 'Saad', '123456719', 25000.00, '965 Shebeen EG', '2001-09-11', 'M'),
    ('Muhammed', 'Ahmed', '123456709', 12000.00, '965 Tanta EG', '2001-11-11', 'M'),
    ('Meroo', 'Maroo', '133455789', 7000.00, '965 Cairo EG', '2001-11-11', 'M'),
    ('Eman', 'Ali', '123445789', 5000.00, '365 Shebeen EG', '2002-11-12', 'F'),
    ('Aya', 'Ali', '123446789', 7000.00, '365 Giza EG', '1999-05-12', 'F'),
    ('Wafaa', 'Muhammed', '124456789', 10000.00, '365 Cairo EG', '2002-11-12', 'F'),
    ('Asmaa', 'Mero', '123454789', 50000.00, '452 Shebeen EG', '1990-11-12', 'F'),
    ('Hadeer', 'Ali', '123446729', 2000.00, '123 Qina EG', '1990-11-12', 'F'),
    ('Sandii', 'Osama', '113456789', 3000.00, '452 Shebeen EG', '1999-05-12', 'F'),
    ('Sara', 'Ashraf', '121456789', 4000.00, '123 Tanta EG', '1995-01-01', 'F'),
    ('Marwaa', 'Khalid', '123456689', 7000.00, '452 Cairo EG', '1995-01-01', 'F'),
    ('Marwaan', 'Mohammed', '523456789', 6500.00, '123 Shebeen EG', '1995-01-11', 'M'),
    ('Minar', 'Ahmed', '132456789', 7500.00, '452 Giza EG', '1999-05-12', 'F'),
    ('Ahmed', 'Mohammed', '123256789', 8000.00, '951 Cairo EG', '1995-01-12', 'M'),
    ('Adel', 'Ashraf', '133456789', 7000.00, '951 Shebeen EG', '1995-10-10', 'M'),
    ('Samie', 'Ahmed', '223456789', 2000.00, '653 Cairo EG', '1995-01-12', 'M');

INSERT INTO staff_sphere.dependents (
    person_id,
    first_name,
    last_name,
    gender,
    birth_date,
    Relationship
)
VALUES
    (100, 'Hoda', 'Alsayed', 'F', '2015-05-05', 'Daughter'),
    (104, 'Sosii', 'Saad', 'F', '2002-06-01', 'Wife'),
    (101, 'Shimaa', 'Adel', 'F', '2010-08-02', 'Daughter'),
    (103, 'Hagar', 'Muhammed', 'F', '2002-03-05', 'Wife'),
    (103, 'Sara', 'Moamen', 'F', '2012-09-02', 'Daughter'),
    (105, 'Amr', 'Samieer', 'M', '2013-08-05', 'Son'),
    (100, 'Khalid', 'Alsayed', 'M', '2010-01-12', 'Son'),
    (102, 'Khalid', 'Saad', 'M', '2020-01-01', 'Son'),
    (106, 'Adel', 'Khalid', 'M', '2018-08-02', 'Son'),
    (108, 'Marwa', 'Muhammed', 'F', '2017-03-01', 'Daughter'),
    (107, 'Kareem', 'Ali', 'M', '2010-09-02', 'Son'),
    (107, 'Aya', 'Ali', 'F', '2008-01-05', 'Daughter'),
    (109, 'Ahmed', 'Goda', 'M', '2003-01-12', 'Son');


INSERT INTO staff_sphere.managers (
    person_id,
    email,
    password
)
VALUES
    (100, 'alsayed@company.com', 'password01'),
    (103, 'moamen@company.com', 'password02'),
    (105, 'samieer@company.com', 'password03'),
    (110, 'ahmed@company.com', 'password04'),
    (107, 'ali@company.com', 'password05');

INSERT INTO staff_sphere.departments (
    dpt_name,
    dpt_loc,
    manager_id,
    mgr_st_date,
    dpt_cr_date
)
VALUES
    ('CS', 'Floor01', 1000, CURDATE(), '2022-05-10'),
    ('IT', 'Floor02', 1001, '2023-10-15', '2020-09-09'),
    ('IS', 'Floor03', 1003, '2020-12-15', '2015-05-01'),
    ('OR', 'Floor04', 1002, CURDATE(), '2024-05-22'),
    ('HR', 'Floor05', 1004, '2010-05-12', '2010-05-01');

UPDATE staff_sphere.managers
SET managed_dpt = 700
WHERE manager_id = 1000;

UPDATE staff_sphere.managers
SET managed_dpt = 701
WHERE manager_id = 1001;

UPDATE staff_sphere.managers
SET managed_dpt = 702
WHERE manager_id = 1002;

UPDATE staff_sphere.managers
SET managed_dpt = 703
WHERE manager_id = 1003;

UPDATE staff_sphere.managers
SET managed_dpt = 704
WHERE manager_id = 1004;

INSERT INTO admins (
    email,
    password,
    person_id
)
VALUES
    ('minar@company.com', 'admin123', 128),
    ('ahmed@company.com', 'admin456', 129),
    ('adel@company.com', 'admin8383', 130),
    ('samie@company.com', 'admin9393', 131);

INSERT INTO staff_sphere.employees (
    person_id,
    job_title,
    works_at,
    rate,
    Password
)
VALUES
    (104, 'SE', 700, 25.25, 'password123'),
    (101, 'App Developer', 700, 25.25, 'password123'),
    (102, 'Front-end', 700, 25.25, 'password123'),
    (106, 'Back-end', 700, 25.25, 'password123'),
    (108, 'Analyst', 702, 15.12, 'password567'),
    (107, 'Designer', 702, 25.25, 'password123'),
    (123, 'Front-end', 700, 25.25, 'password123'),
    (109, 'Data engineer', 702, 33.36, 'password123'),
    (111, 'Back-end', 700, 15.12, 'password567'),
    (112, 'Web Developer', 700, 15.12, 'password567'),
    (113, 'Data Scientist', 702, 25.25, 'password123'),
    (114, 'SE', 700, 33.96, 'password891'),
    (115, 'Analyst', 702, 25.25, 'password123'),
    (116, 'IT Engineer', 701, 33.96, 'password891'),
    (117, 'IT Engineer', 701, 33.96, 'password891'),
    (118, 'Decision Maker', 703, 12.65, 'password123'),
    (119, 'SE', 700, 33.96, 'password891'),
    (120, 'App Developer', 700, 33.96, 'password891'),
    (121, 'Web Developer', 700, 33.96, 'password891'),
    (122, 'Data Scientist', 702, 33.96, 'password891'),
    (124, 'Decision Maker', 703, 44.65, 'password123'),
    (125, 'SE', 700, 40.96, 'password891'),
    (126, 'App Developer', 700, 37.96, 'password891'),
    (127, 'Web Developer', 700, 31.96, 'password891');

INSERT INTO staff_sphere.projects (
    project_name,
    prj_description,
    controlled_by_dpt
)
VALUES
    ('Project A', 'Build a website', 700),
    ('Project B', 'Build an mobile app', 700),
    ('Project C', 'Build a system', 701),
    ('Project D', 'Build a desktop app', 701),
    ('Project E', 'Build a robot', 702),
    ('Project F', 'Build an OS', 702),
    ('Project G', 'Build an Embedded system', 703),
    ('Project H', 'Build a new browser', 704);

INSERT INTO staff_sphere.tasks (
    task_name,
    task_description,
    department_id,
    deadline
)
VALUES
    ('Task A', 'Make me a cup of tea :-)', 704, CURDATE()),
    ('Task B', 'Make me a cup of green tea :-)', 700, CURDATE()),
    ('Task E', 'Implement the desktop interface', 701, CURDATE()),
    ('Task C', 'Design the front-end of the website', 700, CURDATE()),
    ('Task D', 'Implement the back-end of the website', 700, CURDATE()),
    ('Task F', 'Implement the front-end of the we site', 700, CURDATE()),
    ('Task G', 'Design the DB', 702, CURDATE()),
    ('Task H', 'Implement the database design of the robot', 702, CURDATE()),
    ('Task I', 'Test the quality of the new Browser', 704, CURDATE()),
    ('Task J', 'Test the new OS', 702, CURDATE()),
    ('Task K', 'Implement the Embedded system', 703, CURDATE()),
    ('Task L', 'Make me another cup of tea :-)', 703, CURDATE()),
    ('Task M', 'Where is the tea?', 703, CURDATE()),
    ('Task N', 'Make 100 push-ups', 703, CURDATE()),
    ('Task O', 'Make a report of the mobile app features', 700, CURDATE());


INSERT INTO staff_sphere.works_on (
    employee_id,
    project_id,
    worked_hours
)
VALUES
    (11000, 300, 50),
    (11000, 305, 60),
    (11001, 305, 60),
    (11002, 304, 60),
    (11002, 303, 40),
    (11001, 301, 20),
    (11020, 302, 80),
    (11004, 302, 50),
    (11006, 301, 20),
    (11006, 304, 30),
    (11007, 303, 50),
    (11008, 305, 70),
    (11009, 306, 80),
    (11010, 307, 10),
    (11010, 300, 50),
    (11011, 301, 16),
    (11012, 302, 25),
    (11013, 303, 32),
    (11013, 300, 25.5),
    (11010, 306, 20),
    (11020, 306, 40),
    (11021, 307, 50.35),
    (11005, 301, 55),
    (11006, 302, 66),
    (11003, 303, 51),
    (11020, 305, 90),
    (11004, 306, 28),
    (11014, 302, 50.35),
    (11015, 306, 55),
    (11016, 300, 66),
    (11017, 300, 51),
    (11018, 300, 90),
    (11019, 304, 28),
    (11022, 300, 51),
    (11023, 301, 90),
    (11003, 304, 100);


INSERT INTO vacations (
    employee_id,
    department_id,
    number_of_days,
    causes
)
VALUES
    (11001, 700, 10,  'Family vacation'),
    (11002, 701, 5,  'Medical reasons'),
    (11003, 702, 7,  'Personal reasons'),
    (11004, 703, 14,  'Traveling abroad'),
    (11005, 704, 3,  'Family event'),
    (11006, 700, 10,  'Family vacation'),
    (11007, 701, 5,  'Medical reasons'),
    (11008, 702, 7,  'Personal reasons'),
    (11009, 703, 14,  'Traveling abroad'),
    (11010, 704, 3,  'Family event'),
    (11011, 700, 10,  'Family vacation'),
    (11012, 701, 5,  'Medical reasons'),
    (11013, 702, 7,  'Personal reasons'),
    (11014, 703, 14,  'Traveling abroad'),
    (11015, 704, 3,  'Family event'),
    (11016, 700, 10,  'Family vacation'),
    (11017, 701, 5,  'Medical reasons'),
    (11018, 702, 7,  'Personal reasons'),
    (11019, 703, 14,  'Traveling abroad'),
    (11020, 704, 3,  'Family event'),
    (11001, 700, 10,  'Family vacation');


CALL `calEmployeesSalary`();
CALL `setAge`();