package strategy.duck.impl;

import strategy.behavior.fly.impl.FlyNoWay;
import strategy.behavior.quack.imp.Quack;
import strategy.duck.Duck;

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
