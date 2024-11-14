package strategy.version1.duck.impl;

import strategy.version1.behavior.fly.impl.FlyNoWay;
import strategy.version1.behavior.quack.imp.Quack;
import strategy.version1.duck.Duck;

/**
 * @author lh
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
