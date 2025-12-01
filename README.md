# Gym Management System (Java Console Application)

This project is a complete console-based management system for a small gym.
It was developed with the goal of practicing arrays, loops, conditional structures, menus, CRUD-like operations, and IMC (BMI) classification logic.

The system allows the user to register students, list all registered students, search by name, calculate BMI categories, and view basic statistics.

📌 Features
1. Register Students

You can register up to 15 students.
For each student, the system collects:

Name

Age

Weight

Height

The data is stored in parallel arrays.

2. List All Students

Shows all registered students with:

Name

Age

Weight

Height

Calculated BMI

BMI Category

3. Search for a Student

Allows searching by name (case-insensitive).
Displays all information related to that student.

4. BMI Calculation

For each student, BMI is calculated using:

BMI = weight / (height * height)

5. BMI Categories

The system classifies each student into standardized BMI ranges:

BMI Range	Category
< 18.5	Underweight
18.5–24.9	Normal weight
25–29.9	Overweight
30–34.9	Obesity I
35–39.9	Obesity II
≥ 40	Obesity III (Severe)

These categories are automatically assigned every time BMI is calculated.

6. Statistics

The system provides:

Total number of students

Average BMI

Number of students in each BMI category

7. Exit Option

Ends the program safely.

🧠 Learning Objectives

This project was created with the purpose of reinforcing:

✔ Conditionals

Used for:

Menu navigation

BMI category classification

Preventing overflow when the array is full

✔ Loops

Used for:

Listing students

Searching

Navigating menu continuously

✔ Arrays

Parallel arrays hold:

Names

Ages

Weights

Heights

✔ Input Validation

Ensuring correct navigation and data handling.

📂 Project Structure
GymManagement/
 ├─ src/
 │   └─ Main.java
 ├─ README.md
 └─ .gitignore

🚀 How to Run

Install Java (JDK 8+ recommended)

Clone the repository:

git clone https://github.com/ArthurFreitass/Gym-System.git


Navigate to the project folder:

cd Gym-System/src


Compile:

javac Main.java


Run:

java Main

📈 Future Improvements (Optional Ideas)

These are features you can implement later to push your skills:

Replace arrays with ArrayList

Create a Student class and store objects

Add data persistence (save/load using files)

Add editing/removal of students

Improve search (partial match, multiple results)

Create an interface using JavaFX or Swing

📜 License

This project is for educational purposes.
Feel free to modify, improve, and use it in your portfolio.
