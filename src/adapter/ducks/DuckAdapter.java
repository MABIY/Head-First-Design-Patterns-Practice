package adapter.ducks;

import java.util.Random;

/**
 * @author lh
 */
public class DuckAdapter implements Turkey{
    private Random  random;
    @Override
    public void gobble() {
       duck.quack();
       random = new Random();
    }

    @Override
    public void fly() {
        if(random.nextInt(5) == 0)  {
            duck.fly();
        }
    }

    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }
}
