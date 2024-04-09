package decorator.starbuzzwithsizes.condiment;

import decorator.starbuzzwithsizes.Beverage;

/**
 * @author lh
 */
public abstract class CondimentDecorator extends Beverage {
    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    Beverage beverage;

    @Override
    public  abstract  String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
