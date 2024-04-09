package decorator.starbuzzwithsizes.coffee;

import decorator.starbuzzwithsizes.Beverage;

/**
 * @author lh
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description="Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
