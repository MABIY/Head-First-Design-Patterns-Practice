package strategy.version2.duck.impl;

import strategy.version2.behavior.fly.impl.FlyWithWings;
import strategy.version2.behavior.quack.impl.Quack;
import strategy.version2.duck.Duck;

/**
 * @author lh
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
