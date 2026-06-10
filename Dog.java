
public class Dog extends RescueAnimal {

    // Instance variable
    private String breed;

    // Constructor
    public Dog(
            String name, 
            String breed, 
            String gender, 
            int age, 
            Double weight,
            String acquisitionDate, 
            String acquisitionCountry, 
            String trainingStatus,
	        boolean reserved, 
            String inServiceCountry) {

        super(name, "dog", gender, age, weight, acquisitionDate, acquisitionCountry,
                trainingStatus, reserved, inServiceCountry);
        // dog-specific field
        this.breed = breed;
    }

    // Accessor Method
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
