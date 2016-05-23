package factorymethod.pizzastore;

import factorymethod.pizza.Pizza;

public abstract class PizzaStore {
	
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// 将创建对象延迟到子类实现
	protected abstract Pizza createPizza(String type);
	
}
	
