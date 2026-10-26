package adopter;

import pets.Pet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Adopter class — represents the customer adopting a pet
public class Adopter {

    // 'static' means this variable belongs to the CLASS, not to any single object.
    // All Adopter objects share this one counter.
    // It starts at 1001 and increases by 1 for every new Adopter created.
    private static int nextId = 1001;

    private int adopterId;
    private String name;
    private String contactNumber;

    // Date and time of adoption — set automatically when adoption succeeds
    private LocalDate adoptionDate;
    private LocalTime adoptionTime;

    // Constructor — ID is auto-assigned from the static counter
    public Adopter(String name, String contactNumber) {
        this.adopterId = nextId; // assign current counter value as this adopter's ID
        nextId++;                // increment counter for the next adopter
        this.name = name;
        this.contactNumber = contactNumber;
    }

    // Adopts a pet
    // Parameter type is Pet — any child (Dog, Cat, Fish, Bird) can be passed
    // This demonstrates IS-A relationship / Substitution
    public void adopt(Pet pet) {
        if (pet.isAdopted()) {
            System.out.println(pet.getName() + " is already adopted.");
        } else {
            pet.setAdopted(true);

            // Capture current date and time at the moment of adoption
            this.adoptionDate = LocalDate.now();
            this.adoptionTime = LocalTime.now();

            System.out.println("Adoption successful!");
        }
    }

    // Displays customer information
    public void displayDetails() {
        System.out.println("Customer ID    : " + adopterId);
        System.out.println("Name           : " + name);
        System.out.println("Contact Number : " + contactNumber);
    }

    // Displays the adoption date and time in a readable format
    public void displayAdoptionDetails() {
        // DateTimeFormatter converts date/time objects into formatted strings
        // "dd-MM-yyyy" means: day-month-year (e.g., 30-09-2026)
        // "hh:mm a" means: hour:minute AM/PM (e.g., 11:24 AM)
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println("Adoption Date  : " + adoptionDate.format(dateFormat));
        System.out.println("Adoption Time  : " + adoptionTime.format(timeFormat));
    }
}
