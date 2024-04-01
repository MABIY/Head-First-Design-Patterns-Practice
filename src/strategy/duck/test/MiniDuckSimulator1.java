package strategy.duck.test;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;
import strategy.duck.behavior.fly.FlyRocketPowered;

/**
 * @author lh
 */
public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        Duck mallard  = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
