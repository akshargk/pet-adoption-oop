package pets;

// Fish IS-A Pet (Inheritance)
public class Fish extends Pet {

    private String waterType;

    // Constructor calls super() — Constructor Chaining
    public Fish(int petId, String name, int age, String waterType) {
        super(petId, name, age); // Pet constructor runs first
        this.waterType = waterType;
    }


    // Overriding displayDetails() — adds water type after parent details
    @Override
    public void displayDetails() {
        super.displayDetails(); // reuse parent method
        System.out.println("Type    : Fish");
        System.out.println("Water   : " + waterType);
    }
}
