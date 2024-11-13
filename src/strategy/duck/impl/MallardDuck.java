package strategy.duck.impl;

import strategy.behavior.fly.impl.FlyWithWings;
import strategy.behavior.quack.imp.Quack;
import strategy.duck.Duck;

/**
 * @author lh
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");

    }


}
