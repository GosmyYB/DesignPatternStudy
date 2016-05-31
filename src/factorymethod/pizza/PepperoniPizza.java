/**
 * 
 */
package factorymethod.pizza;

import factorymethod.pizzaingredient.PizzaIngredientFactory;

/**
 * @author wyb
 *
 */
public class PepperoniPizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;
	
	public PepperoniPizza(PizzaIngredientFactory ingredinetFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
