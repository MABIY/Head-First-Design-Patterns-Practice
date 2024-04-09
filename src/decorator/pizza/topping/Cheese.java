package decorator.pizza.topping;

import decorator.pizza.Pizza;

/**
 * @author lh
 */
public class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return pizza.cost() ; // cheese is free
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() +", Cheese";
    }
}
