package strategy.version1.duck.test;

import strategy.version1.duck.Duck;
import strategy.version1.duck.behavior.fly.impl.FlyRocketPowered;
import strategy.version1.duck.impl.MallardDuck;
import strategy.version1.duck.impl.ModelDuck;

/**
 * 针对超编程类型编程
 *
 * @author lh
 */
public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        Duck mallar = new MallardDuck();
        mallar.performQuack();
        mallar.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
