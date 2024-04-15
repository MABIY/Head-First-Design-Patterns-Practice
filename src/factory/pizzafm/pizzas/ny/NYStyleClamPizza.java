package factory.pizzafm.pizzas.ny;

import factory.pizzafm.pizzas.Pizza;

/**
 * @author lh
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce ="Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
