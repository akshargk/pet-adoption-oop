package main;

import pets.Pet;
import pets.Dog;
import pets.Cat;
import pets.Fish;
import pets.Bird;
import adopter.Adopter;
import java.util.Scanner;

// Main class — runs the Pet Adoption System with repeat-adoption loop
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== Pre-create all available pets =====
        // Created ONCE outside the loop so their adoption status persists
        // Each constructor calls super() → demonstrates constructor chaining

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog(1, "Buddy", 3, "Golden Retriever");
        dogs[1] = new Dog(2, "Bruno", 2, "Labrador");
        dogs[2] = new Dog(3, "Max", 4, "Beagle");

        Cat[] cats = new Cat[3];
        cats[0] = new Cat(4, "Whiskers", 2, "Persian");
        cats[1] = new Cat(5, "Milo", 3, "Siamese");
        cats[2] = new Cat(6, "Leo", 1, "British Shorthair");

        Fish[] fishes = new Fish[3];
        fishes[0] = new Fish(7, "Nemo", 1, "Freshwater");
        fishes[1] = new Fish(8, "Bubbles", 2, "Freshwater");
        fishes[2] = new Fish(9, "Fin", 1, "Saltwater");

        Bird[] birds = new Bird[3];
        birds[0] = new Bird(10, "Rio", 2, true);
        birds[1] = new Bird(11, "Sunny", 1, true);
        birds[2] = new Bird(12, "Sky", 2, false);

        // Simple while loop to allow repeated adoptions
        boolean running = true;

        while (running) {

            // ===== Welcome Banner =====
            System.out.println("========================================");
            System.out.println("       PET ADOPTION SYSTEM");
            System.out.println("========================================");
            System.out.println();

            // ===== Step 1: Enter customer details =====
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter Contact Number: ");
            String contactNumber = scanner.nextLine();

            // A new Adopter is created for each adoption
            // The static counter automatically gives a NEW Customer ID (1001, 1002, 1003...)
            Adopter adopter = new Adopter(customerName, contactNumber);
            System.out.println();

            // ===== Step 2: Choose animal category & select an available pet =====
            Pet selectedPet = null;

            while (selectedPet == null) {
                System.out.println("Choose an animal:");
                System.out.println("1. Dog");
                System.out.println("2. Cat");
                System.out.println("3. Fish");
                System.out.println("4. Bird");
                System.out.println();
                System.out.print("Enter your choice: ");
                int categoryChoice = scanner.nextInt();
                System.out.println();

                switch (categoryChoice) {
                    case 1:
                        // Check if all dogs are already taken
                        boolean hasAvailableDogs = false;
                        for (int i = 0; i < dogs.length; i++) {
                            if (!dogs[i].isAdopted()) {
                                hasAvailableDogs = true;
                                break;
                            }
                        }
                        if (!hasAvailableDogs) {
                            System.out.println("All dogs have already been adopted. Please choose another animal.");
                            System.out.println();
                            break;
                        }

                        // Loop within pet selection until an available dog is chosen
                        while (selectedPet == null) {
                            System.out.println("----------------------------------------");
                            System.out.println("Available Dogs");
                            System.out.println("----------------------------------------");
                            System.out.println();
                            for (int i = 0; i < dogs.length; i++) {
                                System.out.println((i + 1) + ".");
                                dogs[i].displayDetails();
                                System.out.println();
                            }
                            System.out.print("Choose a dog (1-" + dogs.length + "): ");
                            int dogChoice = scanner.nextInt();
                            System.out.println();

                            if (dogChoice >= 1 && dogChoice <= dogs.length) {
                                Dog chosenDog = dogs[dogChoice - 1];
                                if (chosenDog.isAdopted()) {
                                    System.out.println("----------------------------------------");
                                    System.out.println("Pet Status");
                                    System.out.println("----------------------------------------");
                                    System.out.println();
                                    System.out.println(chosenDog.getName() + " is already TAKEN.");
                                    System.out.println();
                                    System.out.println("Please choose another pet.");
                                    System.out.println();
                                } else {
                                    selectedPet = chosenDog; // Dog IS-A Pet
                                }
                            } else {
                                System.out.println("Invalid choice. Please choose again.");
                                System.out.println();
                            }
                        }
                        break;

                    case 2:
                        // Check if all cats are already taken
                        boolean hasAvailableCats = false;
                        for (int i = 0; i < cats.length; i++) {
                            if (!cats[i].isAdopted()) {
                                hasAvailableCats = true;
                                break;
                            }
                        }
                        if (!hasAvailableCats) {
                            System.out.println("All cats have already been adopted. Please choose another animal.");
                            System.out.println();
                            break;
                        }

                        // Loop within pet selection until an available cat is chosen
                        while (selectedPet == null) {
                            System.out.println("----------------------------------------");
                            System.out.println("Available Cats");
                            System.out.println("----------------------------------------");
                            System.out.println();
                            for (int i = 0; i < cats.length; i++) {
                                System.out.println((i + 1) + ".");
                                cats[i].displayDetails();
                                System.out.println();
                            }
                            System.out.print("Choose a cat (1-" + cats.length + "): ");
                            int catChoice = scanner.nextInt();
                            System.out.println();

                            if (catChoice >= 1 && catChoice <= cats.length) {
                                Cat chosenCat = cats[catChoice - 1];
                                if (chosenCat.isAdopted()) {
                                    System.out.println("----------------------------------------");
                                    System.out.println("Pet Status");
                                    System.out.println("----------------------------------------");
                                    System.out.println();
                                    System.out.println(chosenCat.getName() + " is already TAKEN.");
                                    System.out.println();
                                    System.out.println("Please choose another pet.");
                                    System.out.println();
                                } else {
                                    selectedPet = chosenCat; // Cat IS-A Pet
                                }
                            } else {
                                System.out.println("Invalid choice. Please choose again.");
                                System.out.println();
                            }
                        }
                        break;

                    case 3:
                        // Check if all fish are already taken
                        boolean hasAvailableFish = false;
                        for (int i = 0; i < fishes.length; i++) {
                            if (!fishes[i].isAdopted()) {
                                hasAvailableFish = true;
                                break;
                            }
                        }
                        if (!hasAvailableFish) {
                            System.out.println("All fish have already been adopted. Please choose another animal.");
                            System.out.println();
                            break;
                        }

                        // Loop within pet selection until an available fish is chosen
                        while (selectedPet == null) {
                            System.out.println("----------------------------------------");
                            System.out.println("Available Fish");
                            System.out.println("----------------------------------------");
                            System.out.println();
                            for (int i = 0; i < fishes.length; i++) {
                                System.out.println((i + 1) + ".");
                                fishes[i].displayDetails();
                                System.out.println();
                            }
                            System.out.print("Choose a fish (1-" + fishes.length + "): ");
                            int fishChoice = scanner.nextInt();
                            System.out.println();

                            if (fishChoice >= 1 && fishChoice <= fishes.length) {
                                Fish chosenFish = fishes[fishChoice - 1];
                                if (chosenFish.isAdopted()) {
                                    System.out.println("----------------------------------------");
                                    System.out.println("Pet Status");
                                    System.out.println("----------------------------------------");
                                    System.out.println();
                                    System.out.println(chosenFish.getName() + " is already TAKEN.");
                                    System.out.println();
                                    System.out.println("Please choose another pet.");
                                    System.out.println();
                                } else {
                                    selectedPet = chosenFish; // Fish IS-A Pet
                                }
                            } else {
                                System.out.println("Invalid choice. Please choose again.");
                                System.out.println();
                            }
                        }
                        break;

                    case 4:
                        // Check if all birds are already taken
                        boolean hasAvailableBirds = false;
                        for (int i = 0; i < birds.length; i++) {
                            if (!birds[i].isAdopted()) {
                                hasAvailableBirds = true;
                                break;
                            }
                        }
                        if (!hasAvailableBirds) {
                            System.out.println("All birds have already been adopted. Please choose another animal.");
                            System.out.println();
                            break;
                        }

                        // Loop within pet selection until an available bird is chosen
                        while (selectedPet == null) {
                            System.out.println("----------------------------------------");
                            System.out.println("Available Birds");
                            System.out.println("----------------------------------------");
                            System.out.println();
                            for (int i = 0; i < birds.length; i++) {
                                System.out.println((i + 1) + ".");
                                birds[i].displayDetails();
                                System.out.println();
                            }
                            System.out.print("Choose a bird (1-" + birds.length + "): ");
                            int birdChoice = scanner.nextInt();
                            System.out.println();

                            if (birdChoice >= 1 && birdChoice <= birds.length) {
                                Bird chosenBird = birds[birdChoice - 1];
                                if (chosenBird.isAdopted()) {
                                    System.out.println("----------------------------------------");
                                    System.out.println("Pet Status");
                                    System.out.println("----------------------------------------");
                                    System.out.println();
                                    System.out.println(chosenBird.getName() + " is already TAKEN.");
                                    System.out.println();
                                    System.out.println("Please choose another pet.");
                                    System.out.println();
                                } else {
                                    selectedPet = chosenBird; // Bird IS-A Pet
                                }
                            } else {
                                System.out.println("Invalid choice. Please choose again.");
                                System.out.println();
                            }
                        }
                        break;

                    default:
                        System.out.println("Invalid category choice. Please choose 1-4.");
                        System.out.println();
                        break;
                }
            }

            // ===== Step 3: Confirm and process adoption =====
            scanner.nextLine(); // consume leftover newline after nextInt()

            String confirm = "";
            while (!confirm.equalsIgnoreCase("yes") && !confirm.equalsIgnoreCase("no")) {
                System.out.print("Do you want to adopt " + selectedPet.getName() + "? (yes/no): ");
                confirm = scanner.nextLine().trim();
                if (!confirm.equalsIgnoreCase("yes") && !confirm.equalsIgnoreCase("no")) {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    System.out.println();
                }
            }

            if (confirm.equalsIgnoreCase("yes")) {
                // adopt() accepts Pet type — any child can be passed (IS-A)
                adopter.adopt(selectedPet);
                System.out.println();

                // ===== Step 4: Display adoption details =====
                System.out.println("========================================");
                System.out.println("       ADOPTION SUCCESSFUL");
                System.out.println("========================================");
                System.out.println();

                System.out.println("CUSTOMER DETAILS");
                System.out.println();
                adopter.displayDetails();
                System.out.println();

                System.out.println("ADOPTED PET DETAILS");
                System.out.println();
                selectedPet.displayDetails(); // calls child's overridden version
                System.out.println();

                System.out.println("ADOPTION DETAILS");
                System.out.println();
                adopter.displayAdoptionDetails(); // shows auto-captured date and time
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Adoption cancelled.");
                System.out.println();
            }

            // ===== Step 5: Ask to adopt another pet =====
            String adoptAnother = "";
            while (!adoptAnother.equalsIgnoreCase("yes") && !adoptAnother.equalsIgnoreCase("no")) {
                System.out.print("Do you want to adopt another pet? (yes/no): ");
                adoptAnother = scanner.nextLine().trim();
                if (!adoptAnother.equalsIgnoreCase("yes") && !adoptAnother.equalsIgnoreCase("no")) {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                    System.out.println();
                }
            }
            System.out.println();

            if (adoptAnother.equalsIgnoreCase("no")) {
                running = false;
                System.out.println("========================================");
                System.out.println("Thank you for using Pet Adoption System!");
                System.out.println("========================================");
            }
        }

        scanner.close();
    }
}
