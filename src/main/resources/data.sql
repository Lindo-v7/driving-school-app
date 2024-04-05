-- Table: Student
CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    UserID INT UNIQUE,
    Name VARCHAR(255),
    ContactInformation VARCHAR(255),
    Address VARCHAR(255),
    DateOfBirth DATE,
    Gender VARCHAR(10),
    LicenseInformation VARCHAR(255),
    FOREIGN KEY (UserID) REFERENCES UserAccount(UserID)
);

-- Table: Course
CREATE TABLE Course (
    CourseID INT PRIMARY KEY,
    CourseName VARCHAR(255),
    Description TEXT,
    Duration INT, -- Duration in hours
    Fee DECIMAL(10, 2),
    Prerequisites TEXT
);

-- Table: Enrollment
CREATE TABLE Enrollment (
    EnrollmentID INT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    EnrollmentStatus VARCHAR(50),
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)
);

-- Table: Instructor
CREATE TABLE Instructor (
    InstructorID INT PRIMARY KEY,
    UserID INT UNIQUE,
    Name VARCHAR(255),
    ContactInformation VARCHAR(255),
    InstructorType VARCHAR(50),
    HireDate DATE,
    FOREIGN KEY (UserID) REFERENCES UserAccount(UserID)
);

-- Table: CourseInstructor
CREATE TABLE CourseInstructor (
    CourseInstructorID INT PRIMARY KEY,
    CourseID INT,
    InstructorID INT,
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
    FOREIGN KEY (InstructorID) REFERENCES Instructor(InstructorID)
);

-- Table: Session
CREATE TABLE Session (
    SessionID INT PRIMARY KEY,
    Date DATE,
    Time TIME,
    Duration INT, -- Duration in minutes
    Location VARCHAR(255)
);

-- Table: ClassroomSession
CREATE TABLE ClassroomSession (
    ClassroomSessionID INT PRIMARY KEY,
    SessionID INT,
    CourseID INT,
    CourseInstructorID INT,
    FOREIGN KEY (SessionID) REFERENCES Session(SessionID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID),
    FOREIGN KEY (CourseInstructorID) REFERENCES CourseInstructor(CourseInstructorID)
);

-- Table: DrivingSession
CREATE TABLE DrivingSession (
    DrivingSessionID INT PRIMARY KEY,
    SessionID INT,
    StudentID INT,
    CourseInstructorID INT,
    VehicleID INT,
    FOREIGN KEY (SessionID) REFERENCES Session(SessionID),
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseInstructorID) REFERENCES CourseInstructor(CourseInstructorID)
);

-- Table: Test
CREATE TABLE Test (
    TestID INT PRIMARY KEY,
    SessionID INT,
    StudentID INT,
    InstructorID INT,
    Type VARCHAR(20), -- Theory/Practical
    Result VARCHAR(50),
    FOREIGN KEY (SessionID) REFERENCES Session(SessionID),
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (InstructorID) REFERENCES Instructor(InstructorID)
);

-- Table: Report
CREATE TABLE Report (
    ReportID INT PRIMARY KEY,
    Type VARCHAR(50),
    Date DATE,
    Content TEXT
);

-- Table: Schedule
CREATE TABLE Schedule (
    ScheduleID INT PRIMARY KEY,
    EventType VARCHAR(50), -- Classroom Session, Driving Session, Test
    EventID INT,
    FOREIGN KEY (EventID) REFERENCES Session(SessionID)
);

-- Table: Admin
CREATE TABLE Admin (
    AdminID INT PRIMARY KEY,
    UserID INT,
    FOREIGN KEY (UserID) REFERENCES UserAccount(UserID)
);
-- Table: UserAccount
CREATE TABLE UserAccount (
    UserID INT PRIMARY KEY,
    Username VARCHAR(50) UNIQUE,
    Password VARCHAR(255),
    RoleID INT,
    FOREIGN KEY (RoleID) REFERENCES Role(RoleID)
);

CREATE TABLE Role (
    RoleID INT PRIMARY KEY,
    RoleName VARCHAR(20) UNIQUE
);

-- Table: Test
CREATE TABLE Test (
    test_id INT PRIMARY KEY IDENTITY,
    test_type VARCHAR(50) NOT NULL,
    description TEXT,
    date_conducted DATE NOT NULL DEFAULT GETDATE()
);

-- Table: StudentTest
CREATE TABLE StudentTest (
    student_id INT,
    test_id INT,
    score DECIMAL(5,2),
    date_taken DATE NOT NULL DEFAULT GETDATE(),
    FOREIGN KEY (student_id) REFERENCES Student(student_id),
    FOREIGN KEY (test_id) REFERENCES Test(test_id)
);

-- Table: MCQQuestion
CREATE TABLE MCQQuestion (
    question_id INT PRIMARY KEY IDENTITY,
    question_text TEXT NOT NULL,
    option1 VARCHAR(255) NOT NULL,
    option2 VARCHAR(255) NOT NULL,
    option3 VARCHAR(255) NOT NULL,
    option4 VARCHAR(255) NOT NULL,
    correct_option INT NOT NULL
);

