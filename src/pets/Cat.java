package pets;

// Cat IS-A Pet (Inheritance)
public class Cat extends Pet {

    private String color;

    // Constructor calls super() — Constructor Chaining
    public Cat(int petId, String name, int age, String color) {
        super(petId, name, age); // Pet constructor runs first
        this.color = color;
    }


    // Overriding displayDetails() — adds color after parent details
    @Override
    public void displayDetails() {
        super.displayDetails(); // reuse parent method
        System.out.println("Type    : Cat");
        System.out.println("Color   : " + color);
    }
}
