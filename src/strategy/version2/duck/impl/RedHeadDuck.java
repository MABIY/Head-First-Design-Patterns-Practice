package strategy.version2.duck.impl;

import strategy.version2.duck.Duck;
import strategy.version2.duck.behavior.fly.FlyBehavior;
import strategy.version2.duck.behavior.fly.impl.FlyWithWings;
import strategy.version2.duck.behavior.quack.QuackBehavior;
import strategy.version2.duck.behavior.quack.impl.Quack;

/**
 * @author lh
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
