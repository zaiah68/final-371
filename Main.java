package src;

public class Main {
	
	public static void main(String[] args) {
		Dog bruce = new Dog("bruce", true);
		System.out.println();
		bruce.isLand();
		bruce.speaks();
		
		
		System.out.println();
		System.out.println();
		
		
		
		Fish darl = new Fish("Darl");
		System.out.println();
		darl.isLand();
		darl.speaks();
	}
}
