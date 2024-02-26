package decorator.starbuzz;

import decorator.starbuzz.coffee.Beverage;

/**
 * @author lh
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    @Override
    public abstract String getDescription();

}
