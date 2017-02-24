package strategy;

public class FlyNoWay implements FlyBehvior {

	@Override
	public void fly() {
		System.out.println("can not fly.");
	}
}
