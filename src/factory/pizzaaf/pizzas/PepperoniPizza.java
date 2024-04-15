package factory.pizzaaf.pizzas;

import factory.pizzaaf.pizzas.ingredient.facotry.PizzaIngredientFactory;

/**
 * @author lh
 */
public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies  = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();

    }
}
