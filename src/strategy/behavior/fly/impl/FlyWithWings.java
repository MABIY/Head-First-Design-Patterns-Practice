package strategy.behavior.fly.impl;

import strategy.behavior.fly.FlyBehavior;

/**
 * @author lh
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
