package strategy.duck;

import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.fly.FlyNoWay;
import strategy.duck.behavior.quack.QuackBehavior;

/**
 * @author lh
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior  = new FlyNoWay();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
