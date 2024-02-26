package factory.pizzas;

/**
 * @author lh
 */
public class CheesePizza extends Pizza{

    public CheesePizza() {
        name = "Chesse Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
