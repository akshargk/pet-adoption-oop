@echo off
javac -d out src/pets/*.java src/adopter/*.java src/main/*.java
if %errorlevel% equ 0 (
    java -cp out main.Main
)
