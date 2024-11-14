package strategy.version2.duck;


import strategy.version2.behavior.fly.FlyBehavior;
import strategy.version2.behavior.quack.QuackBehavior;

import java.util.Objects;

/**
 * @author lh
 */
public abstract class Duck implements FlyBehavior, QuackBehavior {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    public abstract void display();

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        Objects.requireNonNull(flyBehavior);
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        Objects.requireNonNull(quackBehavior);
        this.quackBehavior = quackBehavior;
    }
}

