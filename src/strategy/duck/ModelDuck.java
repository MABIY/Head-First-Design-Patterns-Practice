package strategy.duck;

import strategy.duck.behavior.fly.FlyNoWay;
import strategy.duck.behavior.quack.Quack;

/**
 * @author lh
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
