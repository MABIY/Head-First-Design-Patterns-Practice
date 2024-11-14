package strategy.version1.duck.impl;

import strategy.version1.behavior.fly.impl.FlyWithWings;
import strategy.version1.behavior.quack.imp.Quack;
import strategy.version1.duck.Duck;

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
