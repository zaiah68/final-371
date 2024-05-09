package src;

public class Dog extends Animal {
	
	boolean slober;
	
	public Dog(String name, boolean slober) {
		super(4, name, true);
		this.slober = slober;
		if(slober)
			System.out.println("the dog is slobery");
	}

	@Override
	public void isLand() {
		// TODO Auto-generated method stub
		System.out.println("the dog walks on land");
	}

	@Override
	public void speaks() {
		// TODO Auto-generated method stub
		System.out.println("woof woof");
	}
}
