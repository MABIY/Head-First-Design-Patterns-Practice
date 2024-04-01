package strategy.duck;

import strategy.duck.behavior.fly.FlyWithWings;
import strategy.duck.behavior.quack.Quack;

/**
 * @author lh
 */
public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior  = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
