public class Monkey extends RescueAnimal {
    
    // Instance variables
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;

    // Constructor
    public Monkey(String name, String gender, String age,
        String weight, String acquisitionDate, String acquisitionCountry,
        String trainingStatus, boolean reserved, String inServiceCountry,
        String tailLength, String height, String bodyLength, String species) {
        // Wouldn't super() be cleaner? investigate feasability of implementation later
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        // Monkey-sepcific fields
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
        setAnimalType("monkey");
    }

    // Getters
    public String getTailLength() {
        return tailLength;
    }
    public String getHeight() {
        return height;
    }
    public String getBodyLength() {
        return bodyLength;
    }
    public String getSpecies() {
        return species;
    }

    // Setters
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;   
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
}
