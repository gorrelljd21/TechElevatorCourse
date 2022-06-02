package com.techelevator.farm;

public class OldMacdonald {
	public static void main(String[] args) {

		Cow cow = new Cow();
		cow.sleep();
		Pig pig = new Pig();
		pig.sleep();
		Cat cat = new Cat();
		cat.sleep();

//		FarmAnimal farmAnimal = new FarmAnimal(); - cannot do this because FarmAnimal class is abstract
		//abstract vs interface:
			// abstract class is still what an obj is and provide functionality, cannot instantiate abstract class
			// interface is just describing behavior that is available.

		Singable[] singables =
				new Singable[] {cow, new Chicken(), pig, new Tractor(), cat};

		for (Singable singable : singables) {
			String name = singable.getName();
			String sound = singable.getSound();
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name
					+ ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound
					+ " everywhere a " + sound + " " + sound);
			System.out.println();
		}

		Sellable[] sellables = new Sellable[] {new Cow(), new Pig(), new Egg()};

		for (Sellable sellable : sellables) {
			System.out.println("Step right up and get your " + sellable.getName());
			System.out.println("Only $" + sellable.getPrice());
		}
	}
}