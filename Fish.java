package src;

public class Fish extends Animal {

	public Fish(String name) {
		super(0, name, false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void isLand() {
		// TODO Auto-generated method stub
		System.out.println("the fish swims in the sea");
	}

	@Override
	public void speaks() {
		// TODO Auto-generated method stub
		System.out.println("....blub");
	}

}
