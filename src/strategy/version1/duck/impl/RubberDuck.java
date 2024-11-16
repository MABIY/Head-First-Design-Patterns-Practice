package strategy.version1.duck.impl;

import strategy.version1.duck.Duck;
import strategy.version1.duck.behavior.fly.FlyBehavior;
import strategy.version1.duck.behavior.fly.impl.FlyNoWay;
import strategy.version1.duck.behavior.quack.QuackBehavior;
import strategy.version1.duck.behavior.quack.impl.Squeak;

/**
 * @author lh
 */
public class RubberDuck extends Duck {
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public RubberDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
