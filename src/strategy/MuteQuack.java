package strategy;

public class MuteQuack implements QuackBehvior {

	@Override
	public void quack() {
		System.out.println("<<silent>>");
	}
}
