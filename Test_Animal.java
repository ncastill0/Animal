/**
 * Test_Animal 
 * Norah Castillo
 * December 3, 2025
 * This is a class that creates the animal objects based off of the Animal class and tests them.
 */
package defaultpackage;
public class Test_Animal {

	public static void main(String[] args) {
		//creating 2 animal objects 
		
//		Animal cat = new Animal("cat", "felidae", "mammalia", "nocturnal", 5, "carnivore", 4);
//		
//		Animal chickadee = new Animal("chickadee", "paridae", "aves", "diurnal", 1, "omnivore", 2);
//		
//		System.out.println("Initial attributes of 'cat': ");
//		printing(cat);
//		
//		System.out.println("Initial attributes of 'chickadee': ");
//		printing(chickadee);
//		
//		//changing 'cat' attribute 
//		cat.setAge(12);
//		
//		System.out.println("Age of 'cat' was changed. Final attributes of 'cat': ");
//		printing(cat);
//		
//		System.out.print("The cat is eating: ");
//		String food = cat.eating(cat);
//		System.out.println(food);
//		
//		System.out.print("The chickadee is eating: ");
//		food = chickadee.eating(chickadee);
//		System.out.println(food);
//		
//		System.out.print("It is nighttime! That means that the cat is ");
//		if (cat.getSleeping() == "nocturnal") {
//			System.out.print("awake");
//		}
//		else {
//			System.out.print("sleeping");
//		}
//		System.out.print(" and the chickadee is ");
//		if (chickadee.getSleeping() == "nocturnal") {
//			System.out.print("awake.");
//		}
//		else {
//			System.out.print("sleeping.");
//		}
//		
//		System.out.print("\nThe chickadee had kids! It had ");
//		int kids = chickadee.children(chickadee);
//		System.out.println(kids + " kids.");
	}
	
	public static void printing(SuperAnimal animal) {
		System.out.println("Name: " + animal.getName());
		System.out.println("Family: " + animal.getFamily());
		System.out.println("Classification: " + animal.getClassification());
		System.out.println("Sleeping Pattern: " + animal.getSleeping());
		System.out.println("Age: " + animal.getAge());
		System.out.println("Diet: " + animal.getDiet());
		System.out.println("# of Legs: " + animal.getLegs());
		System.out.println("Wings: " + animal.getWings());
		System.out.println("Can Teleport: " + animal.getTeleport() + "\n");
	}
}
