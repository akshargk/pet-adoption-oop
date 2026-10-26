package pets;

// Parent class (Superclass) for all pets
public class Pet {

    // Fields are private — proper encapsulation
    // Child classes use getName() to access name
    private int petId;
    private String name;
    private int age;
    private boolean adopted;

    // Parameterized constructor — child classes will call this using super()
    public Pet(int petId, String name, int age) {
        this.petId = petId;
        this.name = name;
        this.age = age;
        this.adopted = false; // new pets start as not adopted
    }

    // Displays common pet details
    // Child classes call super.displayDetails() to reuse this
    public void displayDetails() {
        System.out.println("Pet ID  : " + petId);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age + " years");
        if (adopted) {
            System.out.println("Status  : TAKEN");
        } else {
            System.out.println("Status  : AVAILABLE");
        }
    }


    // Getter — needed by child classes and Adopter
    public String getName() {
        return name;
    }

    // Getter — needed by Adopter to check adoption status
    public boolean isAdopted() {
        return adopted;
    }

    // Setter — needed by Adopter to mark pet as adopted
    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
}
