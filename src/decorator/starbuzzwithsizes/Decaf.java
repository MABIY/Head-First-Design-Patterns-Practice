package decorator.starbuzzwithsizes;


/**
 * @author lh
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
