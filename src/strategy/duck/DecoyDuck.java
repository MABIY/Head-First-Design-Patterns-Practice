package strategy.duck;

import strategy.duck.behavior.fly.FlyNoWay;
import strategy.duck.behavior.quack.MuteQuack;

/**
 * @author lh
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
