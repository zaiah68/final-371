package src;

public abstract class Animal {
	int legs;
	String name;
	boolean land;
	
	public Animal(int legs, String name, boolean land) {
		this.legs = legs;
		this.name = name;
		this.land = land;
		
		printAnimal();
	
	}
	
	void printAnimal() {
		System.out.println("name: " + this.name);
		System.out.println("legs: " + this.legs);
		System.out.println("land: " + this.land);
		
	}
	
	public abstract void isLand();
	public abstract void speaks();
}
