package strategy.version1.behavior.quack.imp;

import strategy.version1.behavior.quack.QuackBehavior;

/**
 * @author lh
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
