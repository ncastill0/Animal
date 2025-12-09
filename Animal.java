/**
 * Animal 
 * Norah Castillo
 * December 3, 2025
 * This is a class that contains the attributes and actions of animals to create animal objects.
 */
package defaultpackage;
import java.util.Random;
public class Animal {
	
	static Random random = new Random();
	
	//beginnng to set up all attributes
	private String name; //ex. cat
	private String family; //ex. felidae
	private String classification; //ex. mammalia
	private String sleeping; //ex. nocturnal
	private int age; //ex. 5
	private String diet; //ex. carnivore
	private int legs; //ex. 4
	
	
	//constructor 
	public Animal (String defaultName, String defaultFamily, String defaultClassification, String defaultSleeping, int defaultAge, String defaultDiet, int defaultLegs) {
		name = defaultName;
		family = defaultFamily;
		classification = defaultClassification;
		sleeping = defaultSleeping;
		age = defaultAge;
		diet = defaultDiet;
		legs = defaultLegs;
	}
	
	//getter methods for each attribute (species, family, name, age, diet, classification, and legs)
	public String getName() {
		return name;
	}
	
	public String getFamily() {
		return family;
	}
	
	public String getSleeping() {
		return sleeping;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDiet() {
		return diet;
	}
	
	public String getClassification() {
		return classification;
	}
	
	public int getLegs() {
		return legs;
	}
	
	//setter methods for each attribute (species, family, name, age, diet, classification, and legs)
	public void setName(String newName) {
		name = newName;
	}
	
	public void setFamily(String newFamily) {
		family = newFamily;
	}
	
	public void setSleeping(String newSleeping) {
		sleeping = newSleeping;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public void setDiet(String newDiet) {
		diet = newDiet;
	}
	
	public void setClassification(String newClassification) {
		classification = newClassification;
	}
	
	public void setLegs(int newLegs) {
		legs = newLegs;
	}
	
	//all the action methods 
	public String eating(Animal animal) {
		if (animal.getDiet() == "carnivore") {
			return "meat";
		}
		else if (animal.getDiet() == "herbivore") {
			return "vegetables";
		}
		else {
			return "meat and vegetables";
		}
	}
	
	public String moving(Animal animal) {
		if (animal.getLegs() == 4) {
			return "running";
		}
		else if (animal.getClassification() == "aves"){
			return "flying";
		}
		else { 
			return "swimming";
		}
	}
	
	public String noise(Animal animal) {
		if (animal.getClassification() == "mammalia") {
			return "calling";
		}
		else if (animal.getClassification() == "aves") {
			return "hooting";
		}
		else { //classification = pisces (fish)
			return "bubbling";
		}
	}
	
	public int socializing(Animal animal) {
		int friends = random.nextInt(10) + 1;
		return friends;
	}
	
	public String foraging(Animal animal) {
		if (animal.getDiet() == "carnivore") {
			return "hunting";
		}
		else if (animal.getDiet() == "herbivore") {
			return "gardening";
		}
		else {
			return "eating";
		}
	}
	
	public int children(Animal animal) {
		int children;
		if (animal.getClassification() == "mammalia") {
			children = random.nextInt(5) + 1;
		}
		else if (animal.getClassification() == "aves") {
			children = random.nextInt(4) + 2;
		}
		else { //classification = pisces (fish)
			children = random.nextInt(100) + 1;
		}
		return children;
	}
}
