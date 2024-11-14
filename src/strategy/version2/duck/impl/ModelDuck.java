package strategy.version2.duck.impl;

import strategy.version2.behavior.fly.impl.FlyNoWay;
import strategy.version2.behavior.quack.impl.Quack;
import strategy.version2.duck.Duck;

/**
 * @author lh
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm  a model duck");
    }
}
