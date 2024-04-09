package decorator.starbuzzwithsizes.condiment;

import decorator.starbuzzwithsizes.Beverage;

/**
 * @author lh
 */
public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
