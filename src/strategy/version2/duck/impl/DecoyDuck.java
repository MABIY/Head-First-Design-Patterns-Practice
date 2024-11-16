package strategy.version2.duck.impl;

import strategy.version2.duck.Duck;
import strategy.version2.duck.behavior.fly.FlyBehavior;
import strategy.version2.duck.behavior.fly.impl.FlyNoWay;
import strategy.version2.duck.behavior.quack.QuackBehavior;
import strategy.version2.duck.behavior.quack.impl.MuteQuack;

/**
 * @author lh
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
