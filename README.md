# Pet Adoption System

A simple Java console application demonstrating Object Oriented Programming
concepts from Module 3 — UML Diagrams & Inheritance.

## How to Compile and Run

### Quick Command (Recommended)
Open a terminal in the project folder and simply run:

```
pet
```

### Manual Commands
```
javac -d out src/pets/*.java src/adopter/*.java src/main/*.java
java -cp out main.Main
```

## Project Structure

```
PetAdoptionSystem/
├── src/
│   ├── pets/
│   │   ├── Pet.java       (Parent class)
│   │   ├── Dog.java       (Child class - Land)
│   │   ├── Cat.java       (Child class - Land)
│   │   ├── Fish.java      (Child class - Water)
│   │   └── Bird.java      (Child class - Air)
│   ├── adopter/
│   │   └── Adopter.java   (Customer class with auto-ID & adoption date/time)
│   └── main/
│       └── Main.java      (Interactive driver class with repeat-adoption loop)
├── pet.bat                (One-step compile and run script)
└── README.md
```

## OOP Concepts Demonstrated

1. Encapsulation (private fields, getters/setters)
2. Inheritance using extends
3. IS-A relationship (Dog IS-A Pet, Cat IS-A Pet, etc.)
4. Constructor chaining using super()
5. Method overriding with @Override
6. Reusing parent methods using super.displayDetails()
7. Static variable for auto-generating customer IDs (1001, 1002...)
8. Arrays of objects for storing multiple pets
9. Scanner for interactive user input
10. While loop for repeat adoption and AVAILABLE/TAKEN status validation
