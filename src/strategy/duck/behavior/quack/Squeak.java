package strategy.duck.behavior.quack;

/**
 * @author lh
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
