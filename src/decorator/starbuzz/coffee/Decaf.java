package decorator.starbuzz.coffee;

import decorator.starbuzz.Beverage;

/**
 * @author lh
 */
public class Decaf extends Beverage {
    public Decaf() {
        description ="Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
