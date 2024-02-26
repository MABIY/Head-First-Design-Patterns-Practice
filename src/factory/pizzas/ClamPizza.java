package factory.pizzas;

/**
 * @author lh
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";

        toppings.add("clams");
        toppings.add("Grated parmesan cheese");
    }
}
