package pets;

// Dog IS-A Pet (Inheritance)
public class Dog extends Pet {

    private String breed;

    // Constructor calls super() — Constructor Chaining
    public Dog(int petId, String name, int age, String breed) {
        super(petId, name, age); // Pet constructor runs first
        this.breed = breed;
    }


    // Overriding displayDetails() — adds breed after parent details
    @Override
    public void displayDetails() {
        super.displayDetails(); // reuse parent method
        System.out.println("Type    : Dog");
        System.out.println("Breed   : " + breed);
    }
}
