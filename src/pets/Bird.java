package pets;

// Bird IS-A Pet (Inheritance)
public class Bird extends Pet {

    private boolean canFly;

    // Constructor calls super() — Constructor Chaining
    public Bird(int petId, String name, int age, boolean canFly) {
        super(petId, name, age); // Pet constructor runs first
        this.canFly = canFly;
    }


    // Overriding displayDetails() — adds flight info after parent details
    @Override
    public void displayDetails() {
        super.displayDetails(); // reuse parent method
        System.out.println("Type    : Bird");
        if (canFly) {
            System.out.println("Can Fly : Yes");
        } else {
            System.out.println("Can Fly : No");
        }
    }
}
