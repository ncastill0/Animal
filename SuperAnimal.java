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
		if (wings == true) {
			return getName() + " is flying!\n";
		}
		else {
			return getName() + " cannot fly without wings.\n";
		}
	}

	//this method provides information on whether the super animal can teleport
	public String teleport(String toPlace) {
		if (canTeleport == true) {
			return getName() + " is teleporting to " + toPlace + "!\n";
		}
		else {
			return getName() + " cannot teleport.\n";
		}
	}

	//this method provides information on whether the super animal is immortal
	public String immortal() {
		System.out.print("Oh no! " + getName() + " has died! ");
		if (immortal == true) {
			return "But it's okay, " + getName() + " has revived as they are immortal!\n";
		}
		else {
			setAge(0);
			return "There is no coming back from this.\n";
		}
	}
}
