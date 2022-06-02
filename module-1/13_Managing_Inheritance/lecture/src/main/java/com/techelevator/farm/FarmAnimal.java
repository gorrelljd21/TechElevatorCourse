package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isSleeping = false;

//	public static - you can't have a static method in an abstract class

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	public final String getSound( ) { //telling compiler: don't let any subclass override this method
		if (isSleeping){
			return "zzzzzz";
		}
		return sound;
	}

	public void sleep() {
		isSleeping = true;
	}

	public void wakeUp() {
		isSleeping = false;
	}

//	public String eat() { //if method is abstract in abstract class, I don't know behavior, but I know anyone who derives must provide
//	}

}
