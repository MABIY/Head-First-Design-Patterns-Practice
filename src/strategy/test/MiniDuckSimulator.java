package strategy.test;

import strategy.behavior.fly.FlyRocketPowered;
import strategy.duck.Duck;
import strategy.duck.impl.MallardDuck;
import strategy.duck.impl.ModelDuck;

/**
 * @author lh
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
