package strategy.duck.behavior.quack;

/**
 * @author lh
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
