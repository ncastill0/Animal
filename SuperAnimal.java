/**
 * Animal 
 * Norah Castillo
 * December 9, 2025
 * This is a class that contains the attributes and actions of super animals to create super animal objects. It also inherits the traits of the Animal class.
 */
package defaultpackage;

public class SuperAnimal extends Animal {
	
	//creating wings and teleportation variables
	private boolean wings;
	private boolean canTeleport;
	private boolean immortal;

	//defining an explicit constructor for Animal attributes 
	public SuperAnimal(String defaultName, String defaultFamily, String defaultClassification, String defaultSleeping, int defaultAge, String defaultDiet, int defaultLegs, boolean defaultWings, boolean defaultTeleport, boolean defaultImmortal) {
		//calling the Animal constructor 
		super(defaultName, defaultFamily, defaultClassification, defaultSleeping, defaultAge, defaultDiet, defaultLegs);
		wings = defaultWings;
		canTeleport = defaultTeleport;
		immortal = defaultImmortal;
	}
	
	//getter methods
	public boolean getWings() {
		return wings;
	}
	
	public boolean getTeleport() {
		return canTeleport;
	}
	
	public boolean getImmortal() {
		return immortal;
	}
	
	//setter methods 
	public void setWings(boolean newWings) {
		wings = newWings;
	}
	
	public void setTeleport(boolean newTeleport) {
		canTeleport = newTeleport;
	}
	
	public void setImmortal(boolean newImmortal) {
		immortal = newImmortal;
	}
	
	//action methods 
	//this method provides information on whether the super animal can fly
	public String fly() {
		String flying = getName() + " is flying!\n";
		String cantFly = getName() + " cannot fly without wings.\n";
		if (wings == true) {
			return flying;
		}
		else {
			return cantFly;
		}
	}
	
	//this method provides information on whether the super animal can teleport
	public String teleport(String toPlace) {
		String teleport = getName() + " is teleporting to " + toPlace + "!\n";
		String cantTeleport =  getName() + " cannot teleport.\n";
		if (canTeleport == true) {
			return teleport;
		}
		else {
			return cantTeleport;
		}
	}
	
	//this method provides information on whether the super animal is immortal
	public String immortal() {
		System.out.print("Oh no! " + getName() + " has died! ");
		String revived =  "But it's okay, " + getName() + " has revived as they are immortal!\n";
		String dead = "There is no coming back from this.\n";
		if (immortal == true) {
			return revived;
		}
		else {
			setAge(0);
			return dead;
		}
	}
}
