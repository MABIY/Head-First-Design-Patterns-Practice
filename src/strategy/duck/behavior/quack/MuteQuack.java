package strategy.duck.behavior.quack;

/**
 * @author lh
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Siloence >>");
    }
}
