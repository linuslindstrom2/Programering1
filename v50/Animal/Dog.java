package Animal;

public abstract class Dog extends Animal{

	@Override
	public void move() {
		System.out.println("Dog is moving!");
	}

	@Override
	public void eat() {
		System.out.println("Dog is chowing!");
	}

}