import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    // lists of animals in system
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // list of monkey species allowed for intake, list is built in initializeMonkeyList()
    private static List<String> allowedSpecies = new ArrayList<>();


    public static void main(String[] args) {
        
        String userInput = "";
        initializeDogList();
        initializeMonkeyList();

        // loops until user explicitly exits by inputting "q"
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                displayMenu();
                userInput = scanner.nextLine().trim().toLowerCase();
                // calls appropriate function based on user input
                switch (userInput) {
                    case "q" -> System.out.println("Goodbye!");
                    case "1" -> intakeNewDog(scanner);
                    case "2" -> intakeNewMonkey(scanner);
                    case "3" -> reserveAnimal(scanner);
                    case "4" -> printAnimals("dogs");
                    case "5" -> printAnimals("monkeys");
                    case "6" -> printAnimals("in service");
                    default -> System.out.println("Please enter a valid option.");
                }
            } while (!userInput.equals("q"));
        }
    }
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", 1, 25.6, "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", 3, 35.2, "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", 4, 25.6, "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Bobo", "male", 7, 15.5, "06-24-2023", "Argentina", "in service", true, "USA", 15.0, 15.0, 15.0, "capuchin");
        Monkey monkey2 = new Monkey("Bongo", "male", 5, 15.4, "07-22-2019", "Japan", "Phase I", false, "Japan", 18.0, 22.0, 24.0, "Macaque");
        Monkey monkey3 = new Monkey("Zara", "female", 2, 4.1, "11-01-2022", "Colombia", "intake", false, "Colombia", 10.0, 11.0, 13.0, "Squirrel Monkey");
    
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);

        // allowed species list construction
        allowedSpecies.add("capuchin");
        allowedSpecies.add("guenon");
        allowedSpecies.add("macaque");
        allowedSpecies.add("marmoset");
        allowedSpecies.add("squirrel monkey");
        allowedSpecies.add("tamarin");
    }


    // intakeNewDog, for option 1 on main menu
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine().trim();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        // collects variables to be passed to Dog class constructor
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine().trim();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine().trim();
        System.out.println("What is the dog's age?");
        int age = scanner.nextInt();
        System.out.println("What is the dog's weight?");
        Double weight = scanner.nextDouble();
        scanner.nextLine(); // flush \n
        System.out.println("When was the dog acquired?");
        String acquisitionDate = scanner.nextLine().trim();
        System.out.println("Where is the dog from?");
        String acquisitionCountry = scanner.nextLine().trim();
        
        // instantiate dog
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, "intake", false, null);

        // add the new dog to list
        dogList.add(newDog);
        System.out.println(name + " has been added to the system.");
    }

    // adds a new monkey to the system
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine().trim();
        // checks if monkey is already in system
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
        // collects variables to be passed to Monkey class constructor
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine().trim();
        if (!allowedSpecies.contains(species)) {
            System.out.println("\n\nThis monkey is not of an approved species.");
            return; //returns to menu
        }
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine().trim();
        System.out.println("What is the monkey's age?");
        int age = scanner.nextInt();
        System.out.println("What is the monkey's weight?");
        Double weight = scanner.nextDouble();
        scanner.nextLine(); // flush \n
        System.out.println("When was the monkey acquired?");
        String acquisitionDate = scanner.nextLine().trim();
        System.out.println("Where is the monkey from?");
        String acquisitionCountry = scanner.nextLine().trim();
        // trainingStatus = "intake"
        // reserved = false
        // inServiceCountry = null
        System.out.println("What is the monkey's tail length?");
        Double tailLength = scanner.nextDouble();
        System.out.println("What is the monkey's height?");
        Double height = scanner.nextDouble();
        System.out.println("What is the monkey's body length?");
        Double bodyLength = scanner.nextDouble();
        scanner.nextLine(); // flush \n

        // instantiate monkey
        Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate,
                acquisitionCountry, "intake", false, null, tailLength,
                height, bodyLength, species);

        // add the new monkey to list
        monkeyList.add(newMonkey);
        System.out.println(name + " has been added to the system.");
    }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("The method reserveAnimal needs to be implemented");

    }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	    // Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
        // Remember that you only have to fully implement ONE of these lists. 
	    // The other lists can have a print statement saying "This option needs to be implemented".
	    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(String listType) {
        System.out.println("The method printAnimals needs to be implemented");

    }
}

