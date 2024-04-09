package decorator.starbuzz.condiment;

import decorator.starbuzz.Beverage;

/**
 * @author lh
 */
public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Milk";
    }
}
