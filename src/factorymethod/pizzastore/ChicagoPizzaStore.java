package factorymethod.pizzastore;

import factorymethod.pizza.CheesePizza;
import factorymethod.pizza.ClamPizza;
import factorymethod.pizza.Pizza;
import factorymethod.pizzaingredient.ChicagoPizzaIngredientFactory;
import factorymethod.pizzaingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if (type.equals("Clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		}
		return pizza;
	}
}
