package strategy.version2.duck;


import strategy.version2.behavior.fly.FlyBehavior;
import strategy.version2.behavior.quack.QuackBehavior;

/**
 * @author lh
 */
public abstract class Duck implements FlyBehavior, QuackBehavior {
    protected  FlyBehavior flyBehavior;
    protected  QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
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
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

