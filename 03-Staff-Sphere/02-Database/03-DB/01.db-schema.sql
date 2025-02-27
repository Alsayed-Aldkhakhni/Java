###############################################################
# Subject: The database definition (database schema).
# Date   : Jan 30, 2025
# Author : Alsayed A. Khaleel
###############################################################

--  Create the Database that we gonna use through the project. 
CREATE DATABASE staff_sphere;
USE staff_sphere;

--  This Persons TABLE is the parent of Employees, Managers and Admins TABLEs. 
CREATE TABLE Persons
(
    PersonID    INT            AUTO_INCREMENT,
    FirstName   VARCHAR(50)    NOT NULL,
    LastName    VARCHAR(50)    NOT NULL,
    Salary      DOUBLE(7, 2),
    Address     VARCHAR(50),
    Age         SMALLINT,
    PhoneNumber VARCHAR(11)    NOT NULL,
    DateOfBirth DATE           NOT NULL, -- DATE format is YYYY-MM-DD
    Gender      ENUM('Male',  'Female'),

    CONSTRAINT  PK_person             PRIMARY KEY(PersonID),
    CONSTRAINT  UC_person_phoneNum    UNIQUE(PhoneNumber),
    CONSTRAINT  chk_person_age        CHECK(Age >= 22 AND Age < 60)
);
ALTER TABLE Persons AUTO_INCREMENT = 100; --  start counting persons from 100 


--  Dependents Those are the employees' sons, daughters or wifes.
--  One Person may have zero or more dependent on our system.    
CREATE TABLE Dependents
(
    PersonID     INT                NOT NULL,
    FirstName    VARCHAR(50)        NOT NULL,
    LastName     VARCHAR(50)        NOT NULL,
    DateOfBirth  Date,
    Age          SMALLINT,
    Gender       ENUM('Male', 'Female') NOT NULL,
    Relationship ENUM('Son',  'Wife',  'Daughter'),

    CONSTRAINT   FK_dependent_person FOREIGN KEY(PersonID) REFERENCES Persons(PersonID) ON DELETE CASCADE,
    CONSTRAINT   chk_age             CHECK(Age >= 1)
);


--  Managers who are managing, make sense :-), the departments and employees. 
CREATE TABLE Managers
(
    ManagerID  INT         AUTO_INCREMENT,
    PersonID   INT,
    ManagedDpt INT,
    email      VARCHAR(50) NOT NULL,
    password   VARCHAR(30) NOT NULL,

    CONSTRAINT PK_manager        PRIMARY KEY(ManagerID),
    CONSTRAINT FK_manager_person FOREIGN KEY(PersonID)  REFERENCES Persons(PersonID) ON DELETE CASCADE,
    CONSTRAINT UC_manager_person UNIQUE(PersonID)
);
ALTER TABLE Managers AUTO_INCREMENT = 1000; --  start counting Admins from 1000. 


--  Admins in this TABLE is the one who are responsible for controlling the system.
CREATE TABLE Admins
(
    AdminID   INT         AUTO_INCREMENT,
    PersonID  INT         NOT NULL,
    email     VARCHAR(50) NOT NULL,
    password  VARCHAR(30) NOT NULL,

    CONSTRAINT PK_admin        PRIMARY KEY(AdminID),
    CONSTRAINT FK_admin_person FOREIGN KEY(PersonID) REFERENCES Persons(PersonID) ON DELETE CASCADE,
    CONSTRAINT UC_admin_person UNIQUE(PersonID)
);
ALTER TABLE Admins AUTO_INCREMENT = 2000; --  start counting Admins from 2000. 


--  Those employees who are working on projects and managed by managers. 
CREATE TABLE Employees
(
    EmployeeID  INT           AUTO_INCREMENT,
    PersonID    INT           NOT NULL,
    WorksAtDpt  INT,
    JobTitle    VARCHAR(20)   NOT NULL,
    RatePerHour DECIMAL(5, 2) NOT NULL,
    Password    VARCHAR(30)   NOT NULL,

    CONSTRAINT  PK_employee        PRIMARY KEY(EmployeeID),
    CONSTRAINT  UC_employee        UNIQUE(PersonID),
    CONSTRAINT  chk_rate_per_hour  CHECK(RatePerHour > 0.0 AND RatePerHour <= 300.0),
    CONSTRAINT  FK_employee_person FOREIGN KEY(PersonID)   REFERENCES Persons(PersonID) ON DELETE CASCADE
);
ALTER TABLE Employees AUTO_INCREMENT = 11000; --  start counting Employees from 11000. 


--  Department table that stores the departments in the organization. 
CREATE TABLE Departments
(
    DepartmentID       INT          AUTO_INCREMENT,
    DepartmentName     VARCHAR(30)  NOT NULL,
    DepartmentLocation VARCHAR(50)  NOT NULL,
    ManagerID          INT,
    DptCreateDate      DATE,
    ManagerStartDate   DATE         DEFAULT (CURRENT_DATE),

    CONSTRAINT UC_department_mgr    UNIQUE(ManagerID),
    CONSTRAINT UC_department_name   UNIQUE(DepartmentName),
    CONSTRAINT PK_department        PRIMARY KEY(DepartmentID),
    CONSTRAINT FK_department_person FOREIGN KEY(ManagerID) REFERENCES Managers(ManagerID) ON DELETE SET NULL,
    CHECK(ManagerStartDate >= DptCreateDate)
);
ALTER TABLE Departments AUTO_INCREMENT = 400;         --  start counting the departments from 400. 

ALTER TABLE Managers ADD CONSTRAINT FK_manager_dpt    --  Connect the managers table with the department . 
FOREIGN KEY (ManagedDpt) REFERENCES Departments(DepartmentID)  ON DELETE SET NULL;

ALTER TABLE Employees  ADD CONSTRAINT FK_employee_dpt --  Connect the employees table with the department . 
FOREIGN KEY(WorksAtDpt) REFERENCES Departments(DepartmentID)   ON DELETE SET NULL;


--  Project table that stores the data of projects managed by departments. 
CREATE TABLE Projects
(
    ProjectID          INT           AUTO_INCREMENT,
    ProjectName        VARCHAR(30)   NOT NULL,
    ControlledByDpt    INT           NOT NULL,
    ProjectDescription VARCHAR(100)  NOT NULL,

    CONSTRAINT UC_project_name       UNIQUE(ProjectName),
    CONSTRAINT PK_project            PRIMARY KEY(ProjectID),
    CONSTRAINT FK_project_department FOREIGN KEY(ControlledByDpt) REFERENCES Departments(DepartmentID) ON  DELETE CASCADE
);
ALTER Table Projects AUTO_INCREMENT = 500; --  Start counting from 500 for projects. 


--  This relation represents the employees's worked hours at projects. 
CREATE TABLE WorksOn
(
    EmployeeID  INT,
    ProjectID   INT,
    WorkedHours DECIMAL(5, 1),

    CONSTRAINT  FK_works_on_employee FOREIGN KEY(EmployeeID) REFERENCES Employees(EmployeeID) ON DELETE CASCADE,
    CONSTRAINT  FK_works_on_project  FOREIGN KEY(ProjectID)  REFERENCES Projects(ProjectID),
    CONSTRAINT  PK_works_on          PRIMARY KEY(EmployeeID, ProjectID)
);


--  Tasks table that stores the data of the tasks assigned to the employee 
--  in their departments by their managers.
CREATE TABLE Tasks
(
    TaskID          INT   AUTO_INCREMENT,
    DepartmentID    INT,
    TaskName        VARCHAR(30),
    TaskDescription VARCHAR(100),
    EmployeeID      INT,
    StartDate       DATE  DEFAULT (CURRENT_DATE),
    EndDate         DATE,
    Status          ENUM('Done', 'In Progress', 'Inactive'),

    CONSTRAINT PK_task          PRIMARY KEY (TaskID, DepartmentID),
    CONSTRAINT FK_task_employee FOREIGN KEY (EmployeeID)   REFERENCES Employees(EmployeeID)      ON DELETE SET NULL,
    CONSTRAINT FK_task_dpt      FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);

ALTER TABLE Tasks AUTO_INCREMENT = 700;

--  The vacations requested by the employees. 
CREATE TABLE Vacations
(
    VacationID   INT          AUTO_INCREMENT,
    RequesterID  INT,
    DepartmentID INT,
    StartDate    DATE,
    EndDate      DATE,
    Causes       VARCHAR(200) NOT     NULL,
    Status       BOOLEAN      DEFAULT FALSE,

    CONSTRAINT PK_vacation          PRIMARY KEY(VacationID,   DepartmentID),
    CONSTRAINT FK_vacation_dpt      FOREIGN KEY(DepartmentID) REFERENCES Departments(DepartmentID),
    CONSTRAINT FK_vacation_employee FOREIGN KEY(RequesterID)  REFERENCES Employees(EmployeeID), 
    Check(EndDate > StartDate)
);
ALTER TABLE Vacations AUTO_INCREMENT = 800; --  start counting the vacations from 800. 
