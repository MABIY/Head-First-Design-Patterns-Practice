package factory.pizzaaf.stores;

import factory.pizzaaf.pizzas.*;
import factory.pizzaaf.pizzas.Pizza;
import factory.pizzaaf.pizzas.ingredient.facotry.PizzaIngredientFactory;
import factory.pizzaaf.pizzas.ingredient.facotry.chicago.ChicagoPizzaIngredientFactory;
import factory.pizzaaf.pizzas.ingredient.facotry.ny.NYPizzaIngredientFactory;

/**
 * @author lh
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style veggie Pizza");

        } else if (type.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style clam Pizza");
        } else if (type.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
