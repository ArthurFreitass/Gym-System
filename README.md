# **Gym Management System (Java Console Application)**

This project is a complete console-based management system for a small gym.  
It was developed with the goal of practicing **arrays, loops, conditional structures, menus, CRUD-like operations**, and BMI classification logic.

The system allows the user to register students, list all registered students, search by name, calculate BMI categories, and view basic statistics.

---

## 📌 **Features**

### **1. Register Students**
You can register **up to 15 students**.  
For each student, the system collects:
- Name  
- Age  
- Weight  
- Height  

All data is stored using **parallel arrays**.

---

### **2. List All Students**
Displays each registered student with:
- Name  
- Age  
- Weight  
- Height  
- Calculated BMI  
- BMI Category  

---

### **3. Search for a Student**
- Search by **name** (case-insensitive).  
- Displays all details of the selected student.

---

### **4. BMI Calculation**
BMI is calculated using:


---

### **5. BMI Categories**
The system assigns students into the following BMI ranges:

| BMI Range      | Category               |
|----------------|------------------------|
| < 18.5         | Underweight            |
| 18.5–24.9      | Normal weight          |
| 25–29.9        | Overweight             |
| 30–34.9        | Obesity I              |
| 35–39.9        | Obesity II             |
| ≥ 40           | Obesity III (Severe)   |

All categories are assigned automatically.

---

### **6. Statistics**
Shows:
- Total number of registered students  
- Average BMI  
- Number of students in each BMI category  

---

### **7. Exit Option**
Ends the program safely.

---

## 🧠 **Learning Objectives**

This project reinforces:

### ✔ **Conditionals**
Used for:
- Menu navigation  
- BMI category classification  
- Avoiding array overflow  

### ✔ **Loops**
Used for:
- Listing students  
- Searching students  
- Continuous menu navigation  

### ✔ **Arrays**
Parallel arrays store:
- Names  
- Ages  
- Weights  
- Heights  

### ✔ **Input Validation**
Ensures that the program behaves consistently and safely.

---

## 📂 **Project Structure**

Gym-System/
 ├─ src/
 │   └─ Main.java
 ├─ README.md
 └─ .gitignore

 ## 🚀 How to Run

Install Java (JDK 8+ recommended).
Clone the repository:

git clone https://github.com/ArthurFreitass/Gym-System.git
cd Gym-System/src
javac Main.java
java Main

📜 License

This project is for educational purposes. Feel free to modify, improve, and use it in your portfolio.
