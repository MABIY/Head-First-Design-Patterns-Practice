package decorator.starbuzzwithsizes.condiment;

import decorator.starbuzzwithsizes.Beverage;

/**
 * @author lh
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        double cost =  beverage.cost();
        switch (beverage.getSize()) {
            case TALL -> {
                cost +=.10;
            }
            case GRANDE -> {
                cost += .15;
            }
            case VENTI -> {
                cost +=.20;
            }
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +", Soy";
    }
}
