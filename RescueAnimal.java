

import java.lang.String;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String animalType;
    private String gender;
    private int age;
    private Double weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;


    // Constructor
    public RescueAnimal(
            String name, 
            String animalType, 
            String gender, 
            int age,
            Double weight, 
            String acquisitionDate, 
            String acquisitionCountry,
            String trainingStatus, 
            boolean reserved, 
            String inServiceCountry) {
        this.name = name;
        this.animalType = animalType;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.acquisitionDate = acquisitionDate;
        this.acquisitionCountry = acquisitionCountry;
        this.trainingStatus = trainingStatus;
        this.reserved = reserved;
        this.inServiceCountry = inServiceCountry;
    }

    // animal name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    // animal type
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

    // gender
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

    // age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

    // weight
	public Double getWeight() {
		return weight;
    }
	public void setWeight(Double weight) {
		this.weight = weight;
	}

    // date animal was acquired
	public String getAcquisitionDate() {
		return acquisitionDate;
	}
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

    // country animal came from
	public String getAcquisitionCountry() {
		return acquisitionCountry;
	}
	public void setAcquisitionCountry(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}

    // is the animal reserved?
	public boolean getReserved() {
		return reserved;
	}
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

    // country the animal is in service in
	public String getInServiceCountry() {
		return inServiceCountry;
	}
	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}

    // training status
	public String getTrainingStatus() {
		return trainingStatus;
	}
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
