package decorator.starbuzz.coffee;

import decorator.starbuzz.Beverage;

/**
 * @author lh
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
