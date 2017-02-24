package strategy;

public class Quack implements QuackBehvior {

	@Override
	public void quack() {
		System.out.println("quacking.");
	}
}
