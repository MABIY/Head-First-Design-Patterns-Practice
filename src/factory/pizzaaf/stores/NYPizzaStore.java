package factory.pizzaaf.stores;

import factory.pizzaaf.pizzas.*;
import factory.pizzaaf.pizzas.ingredient.facotry.PizzaIngredientFactory;
import factory.pizzaaf.pizzas.ingredient.facotry.ny.NYPizzaIngredientFactory;

/**
 * @author lh
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style veggie Pizza");

        } else if (type.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style clam Pizza");
        } else if (type.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
