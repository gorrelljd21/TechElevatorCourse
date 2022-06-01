package com.techelevator.farm;

import java.math.BigDecimal;

public class OldMacdonald {
	public static void main(String[] args) {

		Chicken chicken = new Chicken();
//		playVerse(chicken.getName(), chicken.getSound());
//
		Cow cow = new Cow();
//		playVerse(cow.getName(), cow.getSound());

		Dog dog = new Dog();
//		playVerse(dog.getName(), dog.getSound());

		Tractor tractor = new Tractor();
		Egg egg = new Egg();

		Singable[] singers = {chicken, cow, dog, tractor};
		for (Singable singer : singers){
			playVerse(singer.getName(), singer.getSound());
		}

		Sellable[] sellables = {chicken, cow, egg};
		for (Sellable sellable : sellables) {
				System.out.printf("%s is for sale at $%.2f \n", sellable.getName(), sellable.getPrice());
			}
		}


	public static void playVerse(String name, String sound) {
			System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
			System.out.println("And on his farm he had a " + name + ", ee, ay, ee, ay, oh!");
			System.out.println("With a " + sound + " " + sound + " here");
			System.out.println("And a " + sound + " " + sound + " there");
			System.out.println("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
			System.out.println();
	}
}