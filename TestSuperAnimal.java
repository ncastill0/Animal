/**
 * TestSuperAnimal 
 * Norah Castillo
 * December 9, 2025
 * This is a class that creates the super animal objects based off of the Super Animal class and tests them.
 */
package defaultpackage;
public class TestSuperAnimal {

	public static void main(String[] args) {
		//creating 2 animal objects where one of them can fly but cannot teleport and the other cannot fly but can teleport
		SuperAnimal dragon = new SuperAnimal("dragon", "varanidae", "reptilia", "nocturnal", 50, "carnivore", 4, true, false, false);
		SuperAnimal unicorn = new SuperAnimal("unicorn", "equidae", "mammalia", "diurnal", 1000, "herbivore", 4, false, true, true);
		
		//displaying initial attributes 
		System.out.println("Initial attributes of 'dragon': ");
		printing(dragon);
		System.out.println("Initial attributes of 'unicorn': ");
		printing(unicorn);
		
		//printing all three methods for dragon
		String fly = dragon.fly();
		System.out.println(fly);
		String teleport = dragon.teleport("toronto");
		System.out.println(teleport);
		String immortal = dragon.immortal();
		System.out.println(immortal);
		
		//printing all three methods for unicorn
		fly = unicorn.fly();
		System.out.println(fly);
		teleport = unicorn.teleport("markham");
		System.out.println(teleport);
		immortal = unicorn.immortal();
		System.out.println(immortal);
		
		//displaying final attributes 
		System.out.println("Initial attributes of 'dragon': ");
		printing(dragon);
		System.out.println("Initial attributes of 'unicorn': ");
		printing(unicorn);
	}
	
	/**
	 * printing
	 * @param animal
	 * This method is intended to output all the characteristics of the super animal object
	 */
	public static void printing(SuperAnimal animal) {
		System.out.println("Name: " + animal.getName());
		System.out.println("Family: " + animal.getFamily());
		System.out.println("Classification: " + animal.getClassification());
		System.out.println("Sleeping Pattern: " + animal.getSleeping());
		System.out.println("Age: " + animal.getAge());
		System.out.println("Diet: " + animal.getDiet());
		System.out.println("# of Legs: " + animal.getLegs());
		System.out.println("Wings: " + animal.getWings());
		System.out.println("Can Teleport: " + animal.getTeleport());
		System.out.println("Is immortal: " + animal.getImmortal() + "\n");
	}
}
