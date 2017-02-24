package strategy;

public abstract class Duck {
	
	protected FlyBehvior flyBehavior;
	protected QuackBehvior quackBehavior;
	
	public void swim() {
		System.out.println("swimming.");
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
}
