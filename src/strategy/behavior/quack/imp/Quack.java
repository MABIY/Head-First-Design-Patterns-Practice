package strategy.behavior.quack.imp;

import strategy.behavior.quack.QuackBehavior;

/**
 * @author lh
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
