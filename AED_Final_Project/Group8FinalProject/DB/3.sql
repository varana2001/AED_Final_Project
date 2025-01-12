-- Insert into professors table
INSERT INTO professors (name, subjectTeach, email, age, username, password) VALUES
('Dr. Alice Smith', 'Web Design', 'alice.smith@university.edu', 45,  'alice123','alice123'),
('Dr. Bob Johnson', 'AED', 'bob.johnson@university.edu', 50, 'bob123', 'bob123'),
('Dr. Carol Davis', 'DMDD', 'carol.davis@university.edu', 40, 'carol123', 'carol123'),
('Dr. David Miller', 'PSA',  'david.miller@university.edu', 35, 'david123', 'david123'),
('Kal Bugrara', 'AED', 'kal.bugrara@university.edu', 55, 'kal123', 'kalpass'),
('Manuel Montrond', 'DMDD', 'manuel.montrond@university.edu', 48, 'manuel123', 'manuelpass'),
('Dinno Konstantopolaus', 'PSA', 'dinno.konstantopolaus@university.edu', 42, 'dinno123', 'dinnopass');


-- Insert into students table
INSERT INTO students (name, subjectTaken , email, age, username,password,LoanAmount) VALUES
('John Doe','AED' , 'john.doe@student.edu', 20, 'john123','john123',NULL),
('Jane Roe', 'PSA', 'jane.roe@student.edu', 22, 'jane123','jane123',NULL),
('Robert Brown', 'DMDD','robert.brown@student.edu', 23, 'robert123' ,'robert123',NULL),

('Aksh Talati', 'AED', 'aksh.talati@student.edu', 21, 'aksh123', 'akshpass', NULL),
('Bhargav Gandhi', 'PSA', 'bhargav.gandhi@student.edu', 22, 'bhargav123', 'bhargavpass', NULL),
('Varana Navadiya', 'DMDD', 'varana.navadiya@student.edu', 20, 'varana123', 'varanapass', NULL);


-- Insert into staffAdmin table
INSERT INTO staffAdmin (username, password, role) VALUES
('UNIADMIN', '7890', 'University Admin'),
('POLADM', '7890', 'Police Admin'),
('BANADMIN', '7890', 'Bank Admin');



-- Insert into bankServices table
INSERT INTO bankservices (name, accountType, operation, amount) VALUES
('John Doe', 'Savings', 'Deposit', 1000.00),
('Jane Roe', 'Checking', 'Withdrawal', 500.00),
('Alice Bank', 'Savings', 'Deposit', 2000.00),
('Bob Bank', 'Checking', 'Withdrawal', 1500.00),
('Jane Roe', 'Savings', 'Deposit', 500.00),
('John Doe', 'Checking', 'Withdrawal', 300.00);


-- Insert into bankResponse table
INSERT INTO bankresponse (name, accountType, operation, amount, employee, actionTaken) VALUES
('John Doe', 'Savings', 'Deposit', 1000.00, 'Alice Bank', 'Approved'),
('Jane Roe', 'Checking', 'Withdrawal', 500.00, 'Bob Bank', 'Approved'),
('Alice Bank', 'Savings', 'Deposit', 2000.00, 'Bob Bank', 'Approved'),
('Bob Bank', 'Checking', 'Withdrawal', 1500.00, 'Alice Bank', 'Approved'),
('Jane Roe', 'Savings', 'Deposit', 500.00, 'Alice Bank', 'Pending'),
('John Doe', 'Checking', 'Withdrawal', 300.00, 'Bob Bank', 'Rejected');


-- Insert into bankEmployee table
INSERT INTO bankemployee (name, gender, age, phone, username, password) VALUES
( 'Alice Bank', 'Female', 30, '9876543210','bankemp1', 'bankemp1'),
( 'Bob Bank', 'Male', 35, '8765432109','bankemp2', 'bankemp2');

-- Insert into police table
INSERT INTO police (name, gender, phone, age, salary, designation, username, password) VALUES
('Officer Mark', 'Male', '1239876540', 40, 60000.00, 'Investigator', 'police1', 'police1'),
('Officer Anna', 'Female', '4569871230', 35, 55000.00, 'Patrol Officer', 'police2', 'police2');

-- Insert into crimeDetails table
INSERT INTO crimedetails (name, phone, address, crimeDetails, officer, action) VALUES
('John Doe', '1234567890', '123 Elm Street', 'Theft', 'Officer Mark', 'Investigation Ongoing'),
('Jane Roe', '0987654321', '456 Maple Avenue', 'Assault', 'Officer Anna', 'Case Closed'),
('Alice Brown', '1122334455', '789 Birch Street', 'Robbery', 'Officer Mark', 'Under Investigation'),
('Robert White', '6677889900', '123 Oak Lane', 'Fraud', 'Officer Anna', 'Case Opened'),
('Emily Green', '9988776655', '456 Pine Road', 'Burglary', 'Officer Mark', 'Suspect Identified');


-- Insert into courseregistration table
INSERT INTO courseregistration (username, Subject, ProfessorName,Email,Age) VALUES
('john123', 'Web Design', 'Dr. Alice Smith','alice.smith@university.edu', 45),
('jane123', 'AED', 'Dr. Bob Johnson','bob.johnson@university.edu', 50),
('robert123', 'DMDD', 'Dr. Carol Davis','carol.davis@university.edu', 40 ),
('aksh123', 'AED', 'Kal Bugrara', 'kal.bugrara@university.edu', 55),
('bhargav123', 'PSA', 'Dinno Konstantopolaus', 'dinno.konstantopolaus@university.edu', 42),
('varana123', 'DMDD', 'Manuel Montrond', 'manuel.montrond@university.edu', 48);

-- Insert into coursegrade table
INSERT INTO coursegrade (studentname, subject, marks, remarks) VALUES
('John Doe', 'Web Design', '90', 'Excellent'),
('Jane Roe', 'AED', '85', 'Very Good'),
('Robert Brown', 'DMDD', '80', 'Good'),
('Aksh Talati', 'AED', '88', 'Very Good'),
('Bhargav Gandhi', 'PSA', '75', 'Good'),
('Varana Navadiya', 'DMDD', '82', 'Very Good');


INSERT INTO agent (id, name, age, phone, password, gender) VALUES
(1, 'John Agent', 35, '1234567890', 'agentpass1', 'Male'),
(2, 'Alice Agent', 28, '9876543210', 'agentpass2', 'Female'),
(3, 'Mark Agent', 40, '1122334455', 'agentpass3', 'Male');

INSERT INTO employee (id, name, age, password, phone,reason) VALUES
(1, 'Robert Employee', 30, 'employeepass1','2233445566', 'For system testing'),
(2, 'Emma Employee', 25, 'employeepass2', '6677889900', 'Operational needs'),
(3, 'David Employee', 38, 'employeepass3','4455667788', 'Inventory management'),
(4, 'Sophia Employee', 29, 'employeepass4', '3344556677', 'System Maintenance'),
(5, 'Lucas Employee', 31, 'employeepass5', '7788990011', 'Security Operations');

INSERT INTO medicine (id, medicine_name, price, quantity, company) VALUES
(1, 'Paracetamol', 5, 100, 'PharmaCorp'),
(2, 'Ibuprofen', 8, 50, 'HealthPlus'),
(3, 'Amoxicillin', 12, 200, 'MediCare');

-- Insert data into crimereport
INSERT INTO crimereport (name, phone, address, crimeDetails) VALUES
('John Doe', 9876543210, '123 Main Street', 'Burglary reported on 5th Dec'),
('Jane Smith', 9876543211, '456 Elm Street', 'Car theft reported near Elm Street'),
('David Johnson', 9876543212, '789 Oak Avenue', 'Disturbance reported in the neighborhood'),
('Sophia Brown', '8899776655', '321 Willow Lane', 'Vandalism reported near school premises'),
('Lucas White', '7766554433', '654 Cedar Avenue', 'Suspicious activity reported at Cedar Park'),
('Emily Taylor', '6655443322', '987 Ash Boulevard', 'Hit-and-run accident reported near Ash Mall');


UPDATE students
SET medicineTaken = NULL, medicineQuant = 0
WHERE name = 'John Doe';

UPDATE students
SET medicineTaken = NULL, medicineQuant = 0
WHERE name = 'Jane Roe';

UPDATE students
SET medicineTaken = NULL, medicineQuant = 0
WHERE name = 'Robert Brown';

-- Update LoanAmount for students
UPDATE students SET LoanAmount = 20000 WHERE name = 'John Doe';
UPDATE students SET LoanAmount = 15000 WHERE name = 'Jane Roe';
UPDATE students SET LoanAmount = 10000 WHERE name = 'Robert Brown';
UPDATE students SET LoanAmount = 18000 WHERE name = 'Aksh Talati';
UPDATE students SET LoanAmount = 12000 WHERE name = 'Bhargav Gandhi';
UPDATE students SET LoanAmount = 14000 WHERE name = 'Varana Navadiya';

-- Update medicine details for students
UPDATE students SET medicineTaken = 'Paracetamol', medicineQuant = 2 WHERE name = 'John Doe';
UPDATE students SET medicineTaken = 'Ibuprofen', medicineQuant = 1 WHERE name = 'Jane Roe';
UPDATE students SET medicineTaken = 'Amoxicillin', medicineQuant = 3 WHERE name = 'Robert Brown';
UPDATE students SET medicineTaken = 'Paracetamol', medicineQuant = 1 WHERE name = 'Aksh Talati';
UPDATE students SET medicineTaken = 'Ibuprofen', medicineQuant = 2 WHERE name = 'Bh argav Gandhi';
UPDATE students SET medicineTaken = 'Amoxicillin', medicineQuant = 1 WHERE name = 'Varana Navadiya';

UPDATE courseregistration SET ProfessorName = 'Dr. Alice Smith' WHERE ProfessorName = 'alice123';
UPDATE courseregistration SET ProfessorName = 'Dr. Bob Johnson' WHERE ProfessorName = 'bob123';
UPDATE courseregistration SET ProfessorName = 'Dr. Carol Davis' WHERE ProfessorName = 'carol123';
UPDATE courseregistration SET ProfessorName = 'Kal Bugrara' WHERE ProfessorName = 'kal123';
UPDATE courseregistration SET ProfessorName = 'Dr. David Miller' WHERE ProfessorName = 'david123';
UPDATE courseregistration SET ProfessorName = 'Manuel Montrond' WHERE ProfessorName = 'manuel123';
UPDATE courseregistration SET ProfessorName = 'Dinno Konstantopolaus' WHERE ProfessorName = 'dinno123';





