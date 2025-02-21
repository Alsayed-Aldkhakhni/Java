###############################################################
# Subject: Filling the Database with data.
# Date   : Jan 30, 2025
# Author : Alsayed A. Khaleel
###############################################################

-- 10 rows for the Persons table
INSERT INTO Persons (FirstName, LastName, Salary, Address, Age, PhoneNumber, DateOfBirth, Gender)
VALUES
('John', 'Doe', 50000.00, '1234 Elm St', 35, '12345678901', '1989-05-14', 'Male'),
('Jane', 'Smith', 60000.00, '5678 Oak St', 40, '12345678902', '1984-02-23', 'Female'),
('Michael', 'Johnson', 55000.00, '4321 Pine St', 30, '12345678903', '1994-01-10', 'Male'),
('Emily', 'Davis', 65000.00, '9876 Birch St', 28, '12345678904', '1996-07-17', 'Female'),
('William', 'Brown', 70000.00, '1234 Maple St', 45, '12345678905', '1980-11-02', 'Male'),
('Olivia', 'Taylor', 75000.00, '7890 Cedar St', 34, '12345678906', '1990-09-12', 'Female'),
('James', 'Miller', 62000.00, '5678 Redwood St', 50, '12345678907', '1974-03-28', 'Male'),
('Sophia', 'Wilson', 54000.00, '1357 Elm St', 32, '12345678908', '1992-06-05', 'Female'),
('Liam', 'Moore', 56000.00, '2468 Pine St', 29, '12345678909', '1995-08-18', 'Male'),
('Ava', 'Anderson', 53000.00, '4680 Birch St', 33, '12345678910', '1991-12-25', 'Female');

-- 10 rows for the Dependents table
INSERT INTO Dependents (PersonID, FirstName, LastName, DateOfBirth, Age, Gender, Relationship)
VALUES
(100, 'Anna', 'Doe', '2015-02-01', 9, 'Female', 'Daughter'),
(101, 'David', 'Smith', '2012-09-15', 12, 'Male', 'Son'),
(102, 'Alex', 'Johnson', '2010-11-20', 14, 'Male', 'Son'),
(103, 'Isabella', 'Davis', '2016-03-30', 8, 'Female', 'Daughter'),
(104, 'Jack', 'Brown', '2009-06-22', 15, 'Male', 'Son'),
(105, 'Charlotte', 'Taylor', '2017-01-09', 7, 'Female', 'Daughter'),
(106, 'Oliver', 'Miller', '2014-11-11', 10, 'Male', 'Son'),
(107, 'Grace', 'Wilson', '2011-07-25', 13, 'Female', 'Daughter'),
(108, 'Ethan', 'Moore', '2012-12-10', 12, 'Male', 'Son'),
(109, 'Mia', 'Anderson', '2013-05-22', 11, 'Female', 'Daughter');

-- 10 rows for the Managers table
INSERT INTO Managers (PersonID, ManagedDpt, email, password)
VALUES
(100, NULL, 'john.doe@company.com', 'password123'),
(101, NULL, 'jane.smith@company.com', 'password123'),
(102, NULL, 'michael.johnson@company.com', 'password123'),
(103, NULL, 'emily.davis@company.com', 'password123'),
(104, NULL, 'william.brown@company.com', 'password123'),
(105, NULL, 'olivia.taylor@company.com', 'password123'),
(106, NULL, 'james.miller@company.com', 'password123'),
(107, NULL, 'sophia.wilson@company.com', 'password123'),
(108, NULL, 'liam.moore@company.com', 'password123'),
(109, NULL, 'ava.anderson@company.com', 'password123');

-- 10 rows for the Admins table
INSERT INTO Admins (PersonID, email, password)
VALUES
(100, 'admin1@company.com', 'adminpass1'),
(101, 'admin2@company.com', 'adminpass2'),
(102, 'admin3@company.com', 'adminpass3'),
(103, 'admin4@company.com', 'adminpass4'),
(104, 'admin5@company.com', 'adminpass5'),
(105, 'admin6@company.com', 'adminpass6'),
(106, 'admin7@company.com', 'adminpass7'),
(107, 'admin8@company.com', 'adminpass8'),
(108, 'admin9@company.com', 'adminpass9'),
(109, 'admin10@company.com', 'adminpass10');

-- 10 rows for the Departments table
INSERT INTO Departments (DepartmentName, DepartmentLocation, ManagerID, DptCreateDate, ManagerStartDate)
VALUES
('IT', 'New York', 1000, '2010-01-01', '2010-01-01'),
('HR', 'San Francisco', 1001, '2011-01-01', '2012-04-12'),
('Finance', 'Chicago', 1002, '2012-01-01', '2013-09-15'),
('Marketing', 'Los Angeles', 1003, '2010-01-01', '2014-05-18'),
('Sales', 'Dallas', 1004, '2012-01-01', '2015-06-25'),
('Support', 'Seattle', 1005, '2014-01-01', '2016-08-30'),
('Research', 'Boston', 1006, '2015-01-01', '2017-11-01'),
('Legal', 'Austin', 1007, '2016-01-01', '2018-03-07'),
('Operations', 'Denver', 1008, '2018-01-01', '2019-02-21'),
('R&D', 'Miami', 1009, '2019-01-01', '2020-09-10');

UPDATE `Managers` SET `ManagedDpt` = 401 WHERE `ManagerID` = 1000;
UPDATE `Managers` SET `ManagedDpt` = 402 WHERE `ManagerID` = 1001;
UPDATE `Managers` SET `ManagedDpt` = 403 WHERE `ManagerID` = 1002;
UPDATE `Managers` SET `ManagedDpt` = 404 WHERE `ManagerID` = 1003;
UPDATE `Managers` SET `ManagedDpt` = 405 WHERE `ManagerID` = 1004;
UPDATE `Managers` SET `ManagedDpt` = 406 WHERE `ManagerID` = 1005;
UPDATE `Managers` SET `ManagedDpt` = 407 WHERE `ManagerID` = 1006;
UPDATE `Managers` SET `ManagedDpt` = 408 WHERE `ManagerID` = 1007;
UPDATE `Managers` SET `ManagedDpt` = 409 WHERE `ManagerID` = 1008;

-- 10 rows for the Employees table
INSERT INTO Employees (PersonID, WorksAtDpt, JobTitle, RatePerHour, Password)
VALUES
(100, 401, 'Developer', 35.50, 'devpass1'),
(101, 402, 'Analyst', 40.00, 'analystpass2'),
(102, 403, 'Designer', 30.75, 'designerpass3'),
(103, 404, 'Manager', 50.00, 'managerpass4'),
(104, 405, 'Admin', 20.25, 'adminpass5'),
(105, 406, 'HR', 25.00, 'hrpass6'),
(106, 407, 'Developer', 37.00, 'devpass7'),
(107, 408, 'Analyst', 45.00, 'analystpass8'),
(108, 409, 'Designer', 32.50, 'designerpass9');

-- 10 rows for the Projects table
INSERT INTO Projects (ProjectName, ControlledByDpt, ProjectDescription)
VALUES
('Project A', 401, 'Website Development'),
('Project B', 402, 'Employee Onboarding System'),
('Project C', 403, 'Financial Forecasting Tool'),
('Project D', 404, 'Marketing Campaign'),
('Project E', 405, 'Sales CRM'),
('Project F', 406, 'Customer Support Portal'),
('Project G', 407, 'New Product Research'),
('Project H', 408, 'Legal Compliance'),
('Project I', 409, 'Operations Optimization');

-- 10 rows for the WorksOn table
INSERT INTO WorksOn (EmployeeID, ProjectID, WorkedHours)
VALUES
(11000, 500, 35.5),
(11001, 501, 40.0),
(11002, 502, 30.5),
(11003, 503, 45.0),
(11004, 504, 20.0),
(11005, 505, 50.5),
(11006, 506, 37.0),
(11007, 507, 42.0),
(11008, 508, 25.0);

-- 10 rows for the Tasks table
INSERT INTO Tasks (DepartmentID, TaskName, TaskDescription, EmployeeID, StartDate, EndDate, Status)
VALUES
(401, 'Task A', 'Complete website design', 11000, '2025-02-01', '2025-03-01', 'In Progress'),
(402, 'Task B', 'Conduct interviews', 11001, '2025-02-05', '2025-03-10', 'In Progress'),
(403, 'Task C', 'Prepare financial reports', 11002, '2025-02-10', '2025-03-15', 'Done'),
(404, 'Task D', 'Create marketing content', 11003, '2025-02-12', '2025-03-12', 'In Progress'),
(405, 'Task E', 'Train new sales staff', 11004, '2025-02-14', '2025-03-14', 'Inactive'),
(406, 'Task F', 'Resolve customer queries', 11005, '2025-02-18', '2025-03-18', 'In Progress'),
(407, 'Task G', 'Design new product features', 11006, '2025-02-20', '2025-03-20', 'Inactive'),
(408, 'Task H', 'Prepare legal documents', 11007, '2025-02-22', '2025-03-22', 'Done'),
(409, 'Task I', 'Improve operational processes', 11008, '2025-02-25', '2025-03-25', 'In Progress');

-- 10 rows for the Vacations table
INSERT INTO Vacations (RequesterID, DepartmentID, NumOfDays, StartDate, EndDate, Causes, Status)
VALUES
(11000, 401, 7, '2025-03-01', '2025-03-07', 'Personal', FALSE),
(11001, 402, 5, '2025-03-05', '2025-03-10', 'Vacation', FALSE),
(11002, 403, 7, '2025-03-10', '2025-03-17', 'Family Emergency', TRUE),
(11003, 404, 5, '2025-03-12', '2025-03-17', 'Sick Leave', FALSE),
(11004, 405, 3, '2025-03-14', '2025-03-17', 'Personal', TRUE),
(11005, 406, 6, '2025-03-15', '2025-03-21', 'Vacation', FALSE),
(11006, 407, 8, '2025-03-18', '2025-03-26', 'Sick Leave', TRUE),
(11007, 408, 4, '2025-03-20', '2025-03-24', 'Vacation', FALSE),
(11008, 409, 7, '2025-03-22', '2025-03-29', 'Personal', TRUE);
