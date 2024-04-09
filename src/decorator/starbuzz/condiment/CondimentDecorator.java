package decorator.starbuzz.condiment;

import decorator.starbuzz.Beverage;

/**
 * @author lh
 */
public abstract class CondimentDecorator extends Beverage {

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;

    @Override
    public abstract String getDescription();
}
