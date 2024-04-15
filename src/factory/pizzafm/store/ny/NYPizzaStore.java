package factory.pizzafm.store.ny;

import factory.pizzafm.pizzas.Pizza;
import factory.pizzafm.pizzas.ny.NYStyleCheesePizza;
import factory.pizzafm.pizzas.ny.NYStyleClamPizza;
import factory.pizzafm.pizzas.ny.NYStylePepperoniPizza;
import factory.pizzafm.pizzas.ny.NYStyleVeggiePizza;
import factory.pizzafm.store.PizzaStore;

/**
 * @author lh
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if(type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if(type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if(type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
