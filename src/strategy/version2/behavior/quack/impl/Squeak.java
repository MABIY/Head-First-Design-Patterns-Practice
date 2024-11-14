package strategy.version2.behavior.quack.impl;

import strategy.version2.behavior.quack.QuackBehavior;

/**
 * @author lh
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
