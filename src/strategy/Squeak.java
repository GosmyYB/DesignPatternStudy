package strategy;

public class Squeak implements QuackBehvior {

	@Override
	public void quack() {
		System.out.println("squeaking.");
	}
}
