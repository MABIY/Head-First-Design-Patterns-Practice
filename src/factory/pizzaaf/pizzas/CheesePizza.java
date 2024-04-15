package factory.pizzaaf.pizzas;

import factory.pizzaaf.pizzas.ingredient.facotry.PizzaIngredientFactory;

import java.util.NavigableMap;

/**
 * @author lh
 */
public class CheesePizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
