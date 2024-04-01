package strategy.duck;

import strategy.duck.behavior.fly.FlyNoWay;
import strategy.duck.behavior.fly.FlyWithWings;
import strategy.duck.behavior.quack.Quack;

/**
 * @author lh
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
