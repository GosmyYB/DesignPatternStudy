package factorymethod.pizzastore;

import factorymethod.pizza.NYStyleCheesePizza;
import factorymethod.pizza.NYStyleClamPizza;
import factorymethod.pizza.NYStylePepperoniPizza;
import factorymethod.pizza.NYStyleVeggiePizza;
import factorymethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else {
			return null;
		}
	}

}
