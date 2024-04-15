package factory.pizzafm.pizzas.chicago;

import factory.pizzafm.pizzas.Pizza;

/**
 * @author lh
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");

    }
}
