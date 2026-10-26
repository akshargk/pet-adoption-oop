# 🐾 Pet Adoption System

A simple console-based **Pet Adoption System** developed using Java as part of the Object-Oriented Programming (OOP) micro-project at Alliance University, Bengaluru.

The application allows users to browse different pet categories, view pet details, adopt pets, track adoption status, and prevent duplicate adoptions. It demonstrates core Java OOP concepts from **Module 3 — UML Diagrams & Inheritance**.

## 🔗 GitHub Repository

**Repository:** [akshargk/pet-adoption-oop](https://github.com/akshargk/pet-adoption-oop)

Clone the project:

```bash
git clone https://github.com/akshargk/pet-adoption-oop.git
cd pet-adoption-oop
```

[![GitHub Repository](https://img.shields.io/badge/GitHub-pet--adoption--oop-181717?logo=github)](https://github.com/akshargk/pet-adoption-oop)

## ✨ Features

- **Multiple Pet Categories:** Supports Dogs, Cats, Fish, and Birds.
- **Pet Details:** Displays pet IDs, names, ages, and category-specific information.
- **Availability Tracking:** Shows whether a pet is `AVAILABLE` or `TAKEN`.
- **Adoption Management:** Allows users to select and adopt available pets.
- **Duplicate Adoption Prevention:** Prevents adoption of pets that have already been adopted.
- **Automatic Customer IDs:** Generates sequential customer IDs starting from `1001`.
- **Adoption Date and Time:** Records the date and time of successful adoptions.
- **Repeat Adoption Sessions:** Allows multiple customers to use the application during one execution.
- **Interactive Console:** Accepts user input through Java's `Scanner` class.
- **Batch Automation:** Uses `pet.bat` to compile and launch the application.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Java Development Kit:** JDK 25
- **User Input:** `Scanner`
- **Date and Time:** `java.time.LocalDate` and `java.time.LocalTime`
- **Date Formatting:** `DateTimeFormatter`
- **Compilation:** Java compiler (`javac`)
- **Execution:** Windows batch script

## 📁 Project Structure

```text
PetAdoptionSystem/
├── src/
│   ├── pets/
│   │   ├── Pet.java
│   │   ├── Dog.java
│   │   ├── Cat.java
│   │   ├── Fish.java
│   │   └── Bird.java
│   ├── adopter/
│   │   └── Adopter.java
│   └── main/
│       └── Main.java
├── out/                 # Compiled class files (generated)
├── pet.bat              # Compile and run script
└── README.md
```

### Class Overview

| Class          | Description                                                          |
| -------------- | -------------------------------------------------------------------- |
| `Pet.java`     | Parent class containing common pet attributes and methods.           |
| `Dog.java`     | Child class representing dogs, with breed information.               |
| `Cat.java`     | Child class representing cats.                                       |
| `Fish.java`    | Child class representing fish, with water-type information.          |
| `Bird.java`    | Child class representing birds.                                      |
| `Adopter.java` | Manages adopter information, automatic IDs, and adoption processing. |
| `Main.java`    | Creates pet objects and controls the interactive adoption workflow.  |
| `pet.bat`      | Compiles the Java source files and launches the application.         |

## ⚙️ Requirements

Before running the project, ensure you have:

- Java Development Kit (JDK) installed.
- Windows for the provided `.bat` script.
- PowerShell or Command Prompt.

Verify your Java installation:

```bash
java -version
javac -version
```

## ▶️ How to Compile and Run

### Method 1: Quick Command (Recommended)

1. Clone the repository and open the project folder.
2. Open PowerShell in the project root.
3. Run the batch script:

```powershell
.\pet.bat
```

The script compiles the Java source files into the `out` directory and starts the application if compilation succeeds.

### Method 2: Manual Compilation

Compile all Java source files:

```bash
javac -d out src/pets/*.java src/adopter/*.java src/main/*.java
```

Run the application:

```bash
java -cp out main.Main
```

**Note:** Run these commands from the project root directory. The `out` directory is generated during compilation.

## 🧠 OOP Concepts Demonstrated

### 1. Encapsulation

Private fields protect internal data, while public getters and setters provide controlled access.

### 2. Inheritance

The `Dog`, `Cat`, `Fish`, and `Bird` classes extend the `Pet` superclass using the `extends` keyword.

### 3. IS-A Relationship

Each specialized pet class represents a type of `Pet`. For example, a `Dog` IS-A `Pet`.

### 4. Constructor Chaining

Child-class constructors use `super()` to initialize parent-class properties.

### 5. Method Overriding

Each subclass overrides `displayDetails()` using the `@Override` annotation to display specialized information.

### 6. Parent Method Reuse

The subclasses call `super.displayDetails()` to reuse the common pet-detail display logic.

### 7. Static Variables

A static counter in `Adopter` generates sequential customer IDs, such as `1001`, `1002`, and so on.

### 8. Arrays of Objects

Arrays store and manage multiple pet objects belonging to different categories.

### 9. User Input with Scanner

The `Scanner` class accepts customer details, category selections, and adoption choices through the console.

### 10. Loops and Validation

While loops support repeat adoption sessions, while adoption-status checks prevent duplicate adoptions of pets marked as `TAKEN`.

## 🧪 Example Workflow

1. Enter customer details.
2. Select a pet category.
3. View the pets and their availability.
4. Choose a pet to adopt.
5. Confirm the adoption.
6. View the adoption result and date/time.
7. Continue with another adoption or exit.

If a selected pet has already been adopted, the system informs the user and prevents the duplicate adoption.

## 🔮 Future Enhancements

- **Data Persistence:** Save pet and adopter records using file handling or a database.
- **Search and Filtering:** Search pets by name, age, breed, or category.
- **Graphical User Interface:** Develop a desktop interface using Java Swing or JavaFX.
- **Medical Records:** Maintain vaccination and medical information for pets.
- **Adoption History:** Store and display previous adoption records.

## 👨‍💻 Author

**Akshar G K**

B.Tech — Computer Science and Engineering  
Alliance University, Bengaluru

## 🎓 Academic Project

Developed as part of the **Object-Oriented Programming (OOP) Micro Project**, focusing on UML diagrams, inheritance, and core Java programming concepts.

## 📄 License

This project was created for academic and educational purposes.
