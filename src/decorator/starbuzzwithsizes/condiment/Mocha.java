package decorator.starbuzzwithsizes.condiment;

import decorator.starbuzzwithsizes.Beverage;

/**
 * @author lh
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
