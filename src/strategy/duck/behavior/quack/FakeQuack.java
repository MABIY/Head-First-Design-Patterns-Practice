package strategy.duck.behavior.quack;

/**
 * @author lh
 */
public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
