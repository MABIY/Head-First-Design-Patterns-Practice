package decorator.starbuzzwithsizes.coffee;

import decorator.starbuzzwithsizes.Beverage;

/**
 * @author lh
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
