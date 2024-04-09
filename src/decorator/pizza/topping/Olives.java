package decorator.pizza.topping;

import decorator.pizza.Pizza;

/**
 * @author lh
 */
public class Olives extends ToppingDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double cost() {
        return pizza.cost() +.30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() +", Olives";
    }
}
