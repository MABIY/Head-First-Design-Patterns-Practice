package strategy.version1.test;

import strategy.version1.behavior.fly.impl.FlyRocketPowered;
import strategy.version1.duck.Duck;
import strategy.version1.duck.impl.MallardDuck;
import strategy.version1.duck.impl.ModelDuck;

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
