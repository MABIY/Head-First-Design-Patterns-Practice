package decorator.starbuzz.coffee;

import decorator.starbuzz.Beverage;

/**
 * @author lh
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description="House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
