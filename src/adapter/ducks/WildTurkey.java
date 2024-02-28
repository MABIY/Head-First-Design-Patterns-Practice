package adapter.ducks;

/**
 * @author lh
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobbel");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
