-- Active: 1741870467090@@172.18.0.2@3306@staff_sphere
###############################################################
# Subject: The database definition (database schema).
# Date   : Jan 30, 2025
# Author : Alsayed A. Khaleel
###############################################################

--  Create the Database that we gonna use through the project.
CREATE DATABASE staff_sphere;
USE staff_sphere;

--  This persons table is the parent of employees, managers and admins tables.
CREATE TABLE persons (
    person_id    INT AUTO_INCREMENT,
    first_name   VARCHAR(50) NOT NULL,
    last_name    VARCHAR(50) NOT NULL,
    salary       DECIMAL(7, 2),
    address      VARCHAR(50),
    age          SMALLINT,
    phone_number VARCHAR(11) NOT NULL,
    birth_date   DATE NOT NULL,     -- DATE format is YYYY-MM-DD
    gender       ENUM('M', 'F'),
    CONSTRAINT PK_person          PRIMARY KEY (person_id),
    CONSTRAINT UC_person_phoneNum UNIQUE      (phone_number)
);

ALTER TABLE persons AUTO_INCREMENT = 100;

--  Dependents Those are the employees' sons, daughters or wifes.
--  One Person may have zero or more dependent on our system.
CREATE TABLE dependents (
    person_id     INT NOT NULL,
    first_name    VARCHAR(50) NOT NULL,
    last_name     VARCHAR(50) NOT NULL,
    birth_date    Date,
    age           SMALLINT,
    gender        ENUM('M', 'F') NOT NULL,
    Relationship  ENUM('Son', 'Wife', 'Daughter'),
    CONSTRAINT FK_dependent_person FOREIGN KEY (person_id)
     REFERENCES persons (person_id) ON UPDATE CASCADE ON DELETE CASCADE
);

--  managers who are managing, make sense :-), the departments and employees.
CREATE TABLE managers (
    manager_id    INT AUTO_INCREMENT,
    person_id     INT,
    managed_dpt   INT,
    email         VARCHAR(50) NOT NULL,
    password      VARCHAR(30) NOT NULL,
    CONSTRAINT PK_manager          PRIMARY KEY (manager_id),
    CONSTRAINT FK_manager_person   FOREIGN KEY (person_id)
     REFERENCES persons (person_id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT UC_manager_person   UNIQUE (person_id)
);

ALTER TABLE managers AUTO_INCREMENT = 1000; --  start counting managers from 1000.

--  admins in this table is the one who are responsible for controlling the system.
CREATE TABLE admins (
    admin_id    INT AUTO_INCREMENT,
    person_id   INT NOT NULL,
    email       VARCHAR(50) NOT NULL,
    password    VARCHAR(30) NOT NULL,
    CONSTRAINT PK_admin            PRIMARY KEY (admin_id),
    CONSTRAINT FK_admin_person     FOREIGN KEY (person_id)
     REFERENCES persons (person_id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT UC_admin_person     UNIQUE (person_id)
);

ALTER TABLE admins AUTO_INCREMENT = 2000; --  start counting admins from 2000.

--  Those employees who are working on projects and managed by managers.
CREATE TABLE employees (
    employee_id  INT AUTO_INCREMENT,
    person_id    INT NOT NULL,
    works_at     INT,
    job_title    VARCHAR(20)   NOT NULL,
    rate         DECIMAL(5, 2) NOT NULL,
    Password     VARCHAR(30)   NOT NULL,
    CONSTRAINT PK_employee     PRIMARY KEY (employee_id),
    CONSTRAINT UC_employee     UNIQUE (person_id),
    CONSTRAINT FK_employee_person FOREIGN KEY (person_id)
     REFERENCES persons (person_id) ON DELETE CASCADE ON UPDATE CASCADE
);

ALTER TABLE employees AUTO_INCREMENT = 11000; --  start counting employees from 11,000.

--  Department table that stores the departments in the organization.
CREATE TABLE departments (
    department_id INT AUTO_INCREMENT,
    dpt_name      VARCHAR(30) NOT NULL,
    dpt_loc       VARCHAR(50) NOT NULL,
    manager_id    INT,
    dpt_cr_date   DATE,
    mgr_st_date   DATE DEFAULT(CURRENT_DATE), -- the date in which this manager became the manager of this dpt.
    CONSTRAINT PK_department          PRIMARY KEY (department_id),
    CONSTRAINT FK_department_manager  FOREIGN KEY (manager_id)
     REFERENCES managers (manager_id) ON DELETE SET NULL ON UPDATE CASCADE,
    CONSTRAINT UC_department_mgr     UNIQUE (manager_id),
    CONSTRAINT UC_department_name    UNIQUE (dpt_name),
    CHECK (mgr_st_date >= dpt_cr_date)
);

ALTER TABLE departments AUTO_INCREMENT = 700; -- start counting the departments from 700.

ALTER TABLE managers -- Add a foreign key to managers table to reference the departments. [manages]
ADD CONSTRAINT FK_manager_dpt FOREIGN KEY (managed_dpt)
 REFERENCES departments (department_id) ON DELETE SET NULL ON UPDATE CASCADE;

ALTER TABLE employees -- Add a foreign key to employees table to reference the departments. [works at]
ADD CONSTRAINT FK_employee_dpt FOREIGN KEY (works_at)
 REFERENCES departments (department_id) ON DELETE SET NULL ON UPDATE CASCADE;

--  Project table that stores the data of projects managed by departments.
CREATE TABLE projects (
    project_id        INT            AUTO_INCREMENT,
    project_name      VARCHAR(30)    NOT NULL,
    controlled_by_dpt INT            NOT NULL,
    prj_description   VARCHAR(100)   NOT NULL,
    CONSTRAINT PK_project            PRIMARY KEY (project_id),
    CONSTRAINT UC_project_name       UNIQUE (project_name),
    CONSTRAINT FK_project_department FOREIGN KEY (controlled_by_dpt)
     REFERENCES departments (department_id) ON DELETE CASCADE ON UPDATE CASCADE
);

ALTER Table projects AUTO_INCREMENT = 300; --  Start counting from 300 for projects.

--  This relation represents the employees's worked hours at projects.
CREATE TABLE works_on (
    employee_id   INT,
    project_id    INT,
    worked_hours  DECIMAL(5, 1),
    CONSTRAINT PK_works_on          PRIMARY KEY (employee_id, project_id),
    CONSTRAINT FK_works_on_employee FOREIGN KEY (employee_id)
     REFERENCES employees (employee_id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FK_works_on_project  FOREIGN KEY (project_id)
     REFERENCES projects  (project_id) ON DELETE CASCADE ON UPDATE CASCADE
);

--  tasks table that stores the data of the tasks assigned to the employee
--  in their departments by their managers.
CREATE TABLE tasks (
    task_id          INT AUTO_INCREMENT,
    department_id    INT,
    task_name        VARCHAR(30)  NOT NULL,
    task_description VARCHAR(100) NOT NULL,
    employee_id      INT,
    deadline         DATE         NOT NULL,
    task_status      ENUM(
        'Done',
        'In Progress',
        'Inactive'
    ) DEFAULT 'Inactive',
    CONSTRAINT PK_task          PRIMARY KEY (task_id, department_id),
    CONSTRAINT FK_task_employee FOREIGN KEY (employee_id)
     REFERENCES employees   (employee_id) ON DELETE SET NULL ON UPDATE CASCADE,
    CONSTRAINT FK_task_dpt      FOREIGN KEY (department_id)
     REFERENCES departments (department_id) ON DELETE CASCADE ON UPDATE CASCADE
);

ALTER TABLE tasks AUTO_INCREMENT = 500;

--  The vacations requested by the employees.
CREATE TABLE vacations (
    vacation_id       INT AUTO_INCREMENT,
    employee_id       INT,
    department_id     INT,
    number_of_days    INT  NOT NULL,
    vacation_st_date  DATE,
    vacation_end_date DATE,
    causes            VARCHAR(200)  NOT NULL,
    vacation_status   ENUM(
        'Approved',
        'Refused',
        'Pending'
    ) DEFAULT 'Pending',
    CONSTRAINT PK_vacation          PRIMARY KEY (vacation_id),
    CONSTRAINT FK_vacation_dpt      FOREIGN KEY (department_id)
     REFERENCES departments (department_id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT FK_vacation_employee FOREIGN KEY (employee_id)
     REFERENCES employees   (employee_id) ON DELETE CASCADE ON UPDATE CASCADE
);

ALTER TABLE vacations AUTO_INCREMENT = 800;

-- create a virtual table (view) to store dependents of search person.
CREATE VIEW vw_pers_dependents AS
SELECT
    p.person_id AS 'PersonID',
    CONCAT(p.first_name, ', ', p.last_name) AS 'Person',
    CONCAT(d.first_name, ', ', d.last_name) AS 'Dependent', 
    p.address AS 'Address',
    d.birth_date AS 'Depnd DOB',
    d.age AS 'Depnd Age',
    Relationship,
    d.gender AS 'Depnd Sex'
    FROM
    persons AS p
    INNER JOIN
    dependents d
    ON p.person_id = d.person_id ORDER BY p.person_id;

/* returns data of employees. */
CREATE PROCEDURE getEmployees()
BEGIN
    SELECT
        e.employee_id AS 'Emp ID', 
        CONCAT(p.first_name, ', ', p.last_name) AS 'Name',
        d.dpt_name AS 'Works At', 
        e.job_title AS 'Works As', 
        p.salary AS 'Salary',
        p.address AS 'Address',
        p.phone_number AS 'Phone',
        p.birth_date AS 'DOB',
        p.age AS 'Age',
        p.gender AS 'Sex'
    FROM 
        persons AS p
    INNER JOIN 
        employees AS e ON p.person_id = e.person_id 
    INNER JOIN 
        departments AS d ON e.works_at = d.department_id;
END;

/* retrieve personal info about an employee. */
CREATE PROCEDURE getEmployeeInfo(IN emp_id INT)
BEGIN
    SELECT
        e.employee_id AS 'Emp ID', 
        CONCAT(p.first_name, ', ', p.last_name) AS 'Name',
        d.dpt_name AS 'Works At', 
        e.job_title AS 'Works As', 
        p.salary AS 'Salary',
        p.address AS 'Address',
        p.phone_number AS 'Phone',
        p.birth_date AS 'DOB',
        p.age AS 'Age',
        p.gender AS 'Sex'
    FROM 
        persons AS p
    INNER JOIN 
        employees AS e ON p.person_id = e.person_id 
    INNER JOIN 
        departments AS d ON e.works_at = d.department_id
    WHERE e.employee_id = emp_id;
END;

/* returns data of admins. */
CREATE PROCEDURE getAdmins()
BEGIN
        SELECT
        a.admin_id AS 'AdminID',
        CONCAT(p.first_name, ', ', p.last_name) AS 'Name',
        a.email AS 'Email',
        p.salary AS 'Salary',
        p.address AS 'Address',
        p.phone_number AS 'Phone',
        p.birth_date AS 'DOB',
        p.age AS 'Age',
        p.gender AS 'Sex'
        FROM admins AS a INNER JOIN persons AS p ON a.person_id = p.person_id;
END;

/* retrieve personal info about an admin. */
CREATE PROCEDURE getAdminInfo(IN ad_id INT)
BEGIN
        SELECT
        a.admin_id AS 'AdminID',
        CONCAT(p.first_name, ', ', p.last_name) AS 'Name',
        a.email AS 'Email',
        p.salary AS 'Salary',
        p.address AS 'Address',
        p.phone_number AS 'Phone',
        p.birth_date AS 'Birth Date',
        p.age AS 'Age',
        p.gender AS 'Sex'
        FROM admins AS a INNER JOIN persons AS p ON a.person_id = p.person_id
        WHERE a.admin_id = ad_id;
END;

/* returns the managers' data. */
CREATE PROCEDURE getManagers()
BEGIN
    SELECT
    m.manager_id AS 'MgrID',
    CONCAT(p.first_name, ', ', p.last_name) AS 'Name',
    m.email AS 'Email',
    d.dpt_name AS 'ManagesDpt',
    p.salary AS 'Salary',
    p.address AS 'Address',
    p.phone_number AS 'Phone',
    p.birth_date AS 'DOB',
    p.age AS 'Age',
    p.gender AS 'Sex'
    FROM managers AS m INNER JOIN persons AS p ON m.person_id = p.person_id
    INNER JOIN departments AS d ON d.department_id = m.managed_dpt;
END;

/* retrieve personal info about a manager. */
-- manager_id, Name, email, dpt_name, salary, address, phone_number, birth_date, age, gender, 

CREATE PROCEDURE getMgrInfo(IN mgr_id INT)
BEGIN
    SELECT
    m.manager_id AS 'MgrID',
    CONCAT(p.first_name, ', ', p.last_name) AS 'Name',
    m.email AS 'Email',
    d.dpt_name AS 'ManagesDpt',
    p.salary AS 'Salary',
    p.address AS 'Address',
    p.phone_number AS 'Phone',
    p.birth_date AS 'DOB',
    p.age AS 'Age',
    p.gender AS 'Sex'
    FROM managers AS m INNER JOIN persons AS p ON m.person_id = p.person_id
    INNER JOIN departments AS d ON d.department_id = m.managed_dpt
    WHERE m.manager_id = mgr_id;
END;

CALL getMgrInfo(1000);

/* returns data of Dependents. */
CREATE PROCEDURE getDependents()
BEGIN
    SELECT * FROM vw_pers_dependents;
END;

/* get dependents of a specific person. */
CREATE PROCEDURE getDependentsOf(IN pid INT)
BEGIN
    SELECT * FROM vw_pers_dependents WHERE `Person ID` = pid;
END;

/* set the employees salary based on their worked hours. */
CREATE PROCEDURE calEmployeesSalary()
BEGIN
    UPDATE persons as p
    SET salary = (
        SELECT SUM(worked_hours) * rate
        FROM works_on as w
        INNER JOIN employees as e ON w.employee_id = e.employee_id
        WHERE e.person_id = p.person_id
        GROUP BY e.person_id
    )
    WHERE EXISTS (
        SELECT 1
        FROM employees e
        WHERE e.person_id = p.person_id
    );
END;

/* Retrieve tasks' data. */
CREATE PROCEDURE getTasks()
BEGIN
SELECT e.employee_id AS 'EmpID', CONCAT(
        p.first_name, ', ', p.last_name
    ) AS 'EmpName', t.task_name AS 'TaskName', t.task_description AS 'Desc', d.dpt_name AS 'BelongsTo', t.deadline AS 'Deadline', t.vacation_status AS 'Status'
FROM
    employees as e
    INNER JOIN persons as p ON e.person_id = p.person_id
    INNER JOIN tasks   as t ON t.employee_id = e.employee_id
    INNER JOIN departments as d ON t.department_id = d.department_id;
END;

/* set the age of the persons and dependents. */
CREATE PROCEDURE setAge()
BEGIN
    UPDATE staff_sphere.dependents SET age = YEAR(CURRENT_DATE) - YEAR(birth_date);
    UPDATE staff_sphere.persons SET age = YEAR(CURRENT_DATE) - YEAR(birth_date);
END;

