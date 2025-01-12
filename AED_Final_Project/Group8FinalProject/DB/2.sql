

-- CREATE DATABASE universitysystem;
-- USE universitysystem;

CREATE TABLE professors (
    name VARCHAR(255) PRIMARY KEY,
    subjectTeach VARCHAR(255),
    email VARCHAR(255),
    age INT,
    username VARCHAR(255) UNIQUE,
    password VARCHAR(255)
);

CREATE TABLE students (
    name VARCHAR(255) PRIMARY KEY,
    subjectTaken VARCHAR(255),
    email VARCHAR(255),
    age INT,
    username VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    LoanAmount VARCHAR(255)
);

CREATE TABLE staffAdmin (
    username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255),
    role VARCHAR(255)
);

CREATE TABLE bankservices (
    name VARCHAR(255),
    accountType VARCHAR(255),
    operation VARCHAR(255),
    amount DECIMAL(10, 2)
);

CREATE TABLE bankresponse (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    accountType VARCHAR(255),
    operation VARCHAR(255),
    amount DECIMAL(10, 2),
    employee VARCHAR(255),
    actionTaken VARCHAR(255)
);

CREATE TABLE bankemployee (
    name VARCHAR(255),
    gender VARCHAR(10),
    age INT,
    phone VARCHAR(15),
    username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255)
);

CREATE TABLE police (
    name VARCHAR(255),
    gender VARCHAR(10),
    phone VARCHAR(15),
    age INT,
    salary DECIMAL(10, 2),
    designation VARCHAR(255),
    username VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255)
);

CREATE TABLE crimedetails (
    name VARCHAR(255),
    phone VARCHAR(15),
    address VARCHAR(255),
    crimeDetails VARCHAR(255),
    officer VARCHAR(255),
    action VARCHAR(255)
);

CREATE TABLE courseregistration (
    username VARCHAR(255),
    Subject VARCHAR(255),
    ProfessorName VARCHAR(255),
    Email VARCHAR(255),
    Age INT,
    FOREIGN KEY (username) REFERENCES students(username),
    FOREIGN KEY (ProfessorName) REFERENCES professors(name)
);

CREATE TABLE coursegrade (
    studentname VARCHAR(255),
    subject VARCHAR(255),
    marks VARCHAR(50),
    remarks VARCHAR(255),
    FOREIGN KEY (studentname) REFERENCES students(name)
);

CREATE TABLE agent (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    phone VARCHAR(15) UNIQUE,
    password VARCHAR(255),
    gender VARCHAR(10)
);

CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    password VARCHAR(255),
    phone VARCHAR(15) UNIQUE,
    reason VARCHAR(255)
);

CREATE TABLE medicine (
    id INT AUTO_INCREMENT PRIMARY KEY,
    medicine_name VARCHAR(255),
    price VARCHAR(50),
    quantity VARCHAR(50),
    company VARCHAR(255)
);

CREATE TABLE crimereport (
    name VARCHAR(255),
    phone BIGINT,
    address VARCHAR(255),
    crimeDetails VARCHAR(255)
);

ALTER TABLE students
ADD COLUMN medicineTaken VARCHAR(255) DEFAULT NULL,
ADD COLUMN medicineQuant INT DEFAULT 0;

ALTER TABLE coursegrade
DROP FOREIGN KEY coursegrade_fk_1;

ALTER TABLE coursegrade
ADD CONSTRAINT coursegrade_fk_1
FOREIGN KEY (studentname)
REFERENCES students(Name)
ON DELETE CASCADE;

ALTER TABLE courseregistration
DROP FOREIGN KEY fk_professorname; -- Replace with your actual key name
ALTER TABLE courseregistration
ADD CONSTRAINT fk_professorname
FOREIGN KEY (ProfessorName)
REFERENCES professors(name)
ON DELETE CASCADE;



