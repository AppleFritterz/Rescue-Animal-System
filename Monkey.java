public class Monkey extends RescueAnimal {
    
    // Instance variables
    private Double tailLength;
    private Double height;
    private Double bodyLength;
    private String species;

    // Constructor
    public Monkey(
            String name, 
            String gender, 
            int age, 
            Double weight,
            String acquisitionDate, 
            String acquisitionCountry, 
            String trainingStatus,
            boolean reserved, 
            String inServiceCountry,
            Double tailLength, 
            Double height, 
            Double bodyLength, 
            String species) {
        super(name, "monkey",  gender, age, weight, acquisitionDate, acquisitionCountry,
                trainingStatus, reserved, inServiceCountry);
        // Monkey-specific fields
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
        this.species = species;
    }

    // tail length 
    public Double getTailLength() {
        return tailLength;
    }
    public void setTailLength(Double tailLength) {
        this.tailLength = tailLength;   
    }
    // height
    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    // body length
    public Double getBodyLength() {
        return bodyLength;
    }
    public void setBodyLength(Double bodyLength) {
        this.bodyLength = bodyLength;
    }
    // species
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
}
