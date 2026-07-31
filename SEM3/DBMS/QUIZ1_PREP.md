# DBMS Quiz 1 Prep
A DBMS avoids storing the same information multiple times, so it uses less storage space
> **Module 1: Introduction & Architecture (Unit 1)**

---

# DBMS vs File Processing System

A **DBMS (Database Management System)** is software that stores, manages, and retrieves data efficiently, whereas a **File Processing System** stores data in separate files without centralized management.

## Drawbacks of File Processing System

### 1. Data Redundancy and Inconsistency
- Same data is stored in multiple files.
- If one copy is updated and another isn't, inconsistent data occurs.

**Example:**
- Student phone number exists in both the Library file and Exam file.
- Updating only one file results in different phone numbers.

---

### 2. Difficulty in Accessing Data
- Every new query requires writing a separate program.
- No flexible querying like SQL.

---

### 3. Data Isolation
- Data is scattered across different files.
- Files may use different formats.
- Combining information becomes difficult.

---

### 4. Integrity Problems
- Rules (constraints) are difficult to enforce.

**Example:**
- Bank balance should never become negative.
- In a file system, this rule must be implemented separately in every program.

---

### 5. Atomicity Problems
A transaction should either:

- Complete fully, or
- Not happen at all.

**Example:**

Transfer ₹1000

Account A → -1000

Account B → +1000

If power fails after deducting from A but before adding to B, money is lost.

DBMS prevents this using **Atomicity**.

---

### 6. Concurrent Access Anomalies
Multiple users accessing the same data simultaneously can produce incorrect results.

**Example**

Person A withdraws ₹500.

Person B withdraws ₹300.

Without proper control, the final balance becomes incorrect.

---

### 7. Security Problems
Different users should have different permissions.

Example:

- Student → View marks only
- Faculty → Update marks
- Admin → Full access

File systems cannot enforce this efficiently.

---

# Database Languages

---

# 1. DDL (Data Definition Language)

Used for defining the **structure (schema)** of the database.

Used to create:

- Tables
- Schemas
- Indexes
- Constraints

## Commands

### CREATE

Creates database objects.

```sql
CREATE TABLE Students(
    ID INT,
    Name VARCHAR(50)
);
```

---

### ALTER

Modifies an existing table.

```sql
ALTER TABLE Students
ADD GPA DECIMAL(3,2);
```

---

### DROP

Deletes the entire table.

```sql
DROP TABLE Students;
```

---

### TRUNCATE

Deletes **all rows** but keeps the table structure.

```sql
TRUNCATE TABLE Students;
```

**Difference**

- DELETE → Removes selected rows.
- TRUNCATE → Removes all rows quickly.
- DROP → Removes entire table.

---

### Note

The **DDL Compiler** generates table definitions that are stored in the **Data Dictionary**.

---

# 2. DML (Data Manipulation Language)

Used to **insert, retrieve, update, and delete data**.

## Commands

### SELECT

Retrieves data.

```sql
SELECT Name, Major
FROM Students
WHERE ID = 101;
```

---

### INSERT

Adds new records.

```sql
INSERT INTO Students
VALUES(101,'Kavya','CSE');
```

---

### UPDATE

Modifies existing data.

```sql
UPDATE Students
SET Major='CSE'
WHERE ID=101;
```

---

### DELETE

Deletes records.

```sql
DELETE FROM Students
WHERE ID=101;
```

---

# 3. DCL (Data Control Language)

Controls user permissions.

## Commands

### GRANT

Gives access.

```sql
GRANT SELECT
ON Students
TO user1;
```

---

### REVOKE

Removes access.

```sql
REVOKE SELECT
ON Students
FROM user1;
```

---

# 4. TCL (Transaction Control Language)

Controls transactions.

Used after DML operations.

## Commands

### COMMIT

Permanently saves changes.

```sql
COMMIT;
```

---

### ROLLBACK

Undoes changes since the last COMMIT.

```sql
ROLLBACK;
```

---

# Primary Key

A **Primary Key** is one **Candidate Key** selected to uniquely identify every row in a table.

## Properties

- Unique
- Cannot be NULL
- One Primary Key per table

### Example

| Reg No | Student Name |
|---------|--------------|
| 101 | Rahul |
| 102 | Rahul |

Names can repeat.

Registration numbers cannot.

Examples:

- Aadhaar Number
- PAN Number
- Employee ID
- Roll Number

---

# Candidate Key

A **Candidate Key** is any attribute (or combination of attributes) that can uniquely identify every row.

Multiple candidate keys may exist.

Example:

Student Table

- Roll Number ✅
- Aadhaar Number ✅
- Email ID ✅

All are candidate keys because each uniquely identifies a student.

One of them is chosen as the **Primary Key**.

---

## Primary Key vs Candidate Key

| Primary Key | Candidate Key |
|--------------|---------------|
| Selected from candidate keys | Any attribute that uniquely identifies a row |
| Only one per table | Multiple allowed |
| Cannot be NULL | May be NULL depending on DBMS/design |
| Must be UNIQUE | Must be UNIQUE |

---

# Foreign Key

A **Foreign Key** is an attribute (or group of attributes) that references the **Primary Key** of another table (or sometimes the same table).

It creates a relationship between two tables.

Example:

```
+------------------------+          +---------------------------+
|        Student         |          |         Course            |
+------------------------+          +---------------------------+
| Roll_No (PK)           |◄─────────| Roll_No (FK)              |
| Name                   |          | Course_ID (PK)            |
| Address                |          | Course_Name               |
+------------------------+          +---------------------------+
```

The value of the Foreign Key must match an existing Primary Key value.

---

# Entity Relationship (ER) Model

The ER Model is used to design databases.

It represents:

- Entities
- Attributes
- Relationships

---

# Entity

A real-world object that stores information.

Examples

- Student
- Course
- Employee
- Department

---

# Attribute

Properties of an entity.

Student attributes:

- Roll Number
- Name
- Age
- Address

---

# Relationship

Represents how entities are connected.

Example

```
Student -------- STUDIES -------- Course
```

---

# Types of Attributes

---

## 1. Single-valued vs Multi-valued

### Single-valued

Only one value.

Examples:

- Registration Number
- Date of Birth

---

### Multi-valued

Can have multiple values.

Examples:

- Phone Numbers
- Email IDs
- Addresses

---

## 2. Simple vs Composite

### Simple Attribute

Cannot be divided further.

Examples:

- Age
- Salary

---

### Composite Attribute

Can be divided into smaller parts.

Example

```
Student Name

First Name

Middle Name

Last Name
```

Another example:

```
Address

House No

Street

City

State

PIN Code
```

---

## 3. Stored vs Derived

### Stored Attribute

Actually stored in the database.

Example:

- Date of Birth

---

### Derived Attribute

Calculated from another attribute.

Example:

- Age (derived from Date of Birth)

In ER diagrams, derived attributes are represented using a **dotted (dashed) oval**.

---

## 4. Key vs Non-Key Attribute

### Key Attribute

Uniquely identifies an entity.

Example:

- Roll Number

Represented using **underlining** in ER diagrams.

---

### Non-Key Attribute

Does not uniquely identify records.

Examples:

- Name
- Address
- Age

---

## 5. Required vs Optional Attribute

### Required Attribute

Cannot be left empty.

Example:

- Student Name
- Roll Number

---

### Optional Attribute

May contain NULL values.

Examples:

- Alternate Phone Number
- Middle Name

---

# Degree of Relationship

The number of entities participating in a relationship.

---

## One-to-One (1:1)

One entity is related to only one entity.

Example:

One Person ↔ One Passport

---

## One-to-Many (1:N)

One entity relates to many entities.

Example:

One Teacher → Many Students

---

## Many-to-One (N:1)

Many entities relate to one entity.

Example:

Many Students → One Department

---

## Many-to-Many (M:N)

Many entities relate to many entities.

Example:

Students ↔ Courses

- One student can enroll in many courses.
- One course can have many students.

Usually implemented using a **junction (bridge) table**.

Example:

```
Student
--------
Roll_No (PK)

Course
-------
Course_ID (PK)

Enrollment
-----------
Roll_No (FK)
Course_ID (FK)
```

---

# Quick Revision Table

| Concept | Key Point |
|----------|-----------|
| DBMS | Manages databases efficiently |
| File System | Suffers from redundancy, inconsistency, poor security |
| DDL | Defines database structure |
| DML | Manipulates data |
| DCL | Controls user permissions |
| TCL | Controls transactions |
| Candidate Key | Any unique attribute |
| Primary Key | Selected candidate key |
| Foreign Key | References another table's primary key |
| Entity | Real-world object |
| Attribute | Property of an entity |
| Relationship | Connection between entities |
| Derived Attribute | Calculated from stored data |
| Composite Attribute | Can be divided into smaller attributes |
| One-to-One | One ↔ One |
| One-to-Many | One ↔ Many |
| Many-to-One | Many ↔ One |
| Many-to-Many | Many ↔ Many |
