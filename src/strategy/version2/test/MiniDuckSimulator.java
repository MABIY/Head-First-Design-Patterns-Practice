package strategy.version2.test;

import strategy.version2.behavior.fly.FlyBehavior;
import strategy.version2.behavior.fly.impl.FlyRocketPowered;
import strategy.version2.behavior.quack.QuackBehavior;
import strategy.version2.duck.Duck;
import strategy.version2.duck.impl.MallardDuck;
import strategy.version2.duck.impl.ModelDuck;

/**
 * @author lh
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.quack();
        mallard.fly();

        performFly(mallard);
        performQuack(mallard);


        Duck modelDuck = new ModelDuck();

        modelDuck.fly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.fly();

        performFly(modelDuck);
        performQuack(modelDuck);
    }

    public static void performFly(FlyBehavior flyBehavior) {
        flyBehavior.fly();
    }

    public static void performQuack(QuackBehavior quackBehavior) {
        quackBehavior.quack();
    }
}
