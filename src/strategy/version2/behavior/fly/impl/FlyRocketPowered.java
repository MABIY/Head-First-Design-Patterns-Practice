package strategy.version2.behavior.fly.impl;

import strategy.version2.behavior.fly.FlyBehavior;

/**
 * @author lh
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
