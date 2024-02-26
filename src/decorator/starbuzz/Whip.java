package decorator.starbuzz;

import decorator.starbuzz.coffee.Beverage;

/**
 * @author lh
 */
public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage  = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
