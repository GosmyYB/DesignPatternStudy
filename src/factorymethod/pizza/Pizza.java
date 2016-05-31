/**
 * 
 */
package factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

import factorymethod.pizzaingredient.Cheese;
import factorymethod.pizzaingredient.Clams;
import factorymethod.pizzaingredient.Dough;
import factorymethod.pizzaingredient.Pepperoni;
import factorymethod.pizzaingredient.Sauce;
import factorymethod.pizzaingredient.Veggies;

/**
 * @author wyb
 */
public abstract class Pizza {
	
	String name;
	Dough dough; //生面团
	Sauce sauce; //酱汁
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	public abstract void prepare();
	
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Pizza";
	}
}
