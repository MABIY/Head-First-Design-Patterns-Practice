package strategy.version1.duck.impl;

import strategy.version1.duck.Duck;
import strategy.version1.duck.behavior.fly.FlyBehavior;
import strategy.version1.duck.behavior.fly.impl.FlyWithWings;
import strategy.version1.duck.behavior.quack.QuackBehavior;
import strategy.version1.duck.behavior.quack.impl.Quack;

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
