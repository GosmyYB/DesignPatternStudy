package factorymethod;

import factorymethod.pizza.Pizza;
import factorymethod.pizzastore.ChicagoPizzaStore;
import factorymethod.pizzastore.NYPizzaStore;
import factorymethod.pizzastore.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizzaA = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizzaA.getName());
		
		Pizza pizzaB = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizzaB.getName());
	}

}
