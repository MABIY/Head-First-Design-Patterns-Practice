package strategy.behavior.quack.imp;

import strategy.behavior.quack.QuackBehavior;

/**
 * @author lh
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
