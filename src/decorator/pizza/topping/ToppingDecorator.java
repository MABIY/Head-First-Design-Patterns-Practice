package decorator.pizza.topping;

import decorator.pizza.Pizza;

/**
 * @author lh
 */
public abstract class ToppingDecorator extends Pizza {
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    Pizza pizza;

    @Override
    public abstract String getDescription();
}
