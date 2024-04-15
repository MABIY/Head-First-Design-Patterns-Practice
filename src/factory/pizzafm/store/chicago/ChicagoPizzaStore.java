package factory.pizzafm.store.chicago;

import factory.pizzafm.pizzas.Pizza;
import factory.pizzafm.pizzas.chicago.ChicagoStyleCheesePizza;
import factory.pizzafm.pizzas.chicago.ChicagoStyleClamPizza;
import factory.pizzafm.pizzas.chicago.ChicagoStylePepperoniPizza;
import factory.pizzafm.pizzas.chicago.ChicagoStyleVeggiePizza;
import factory.pizzafm.store.PizzaStore;

/**
 * @author lh
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if(type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if(type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if(type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
