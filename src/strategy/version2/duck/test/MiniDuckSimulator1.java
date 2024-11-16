package strategy.version2.duck.test;

import strategy.version2.duck.Duck;
import strategy.version2.duck.behavior.fly.impl.FlyRocketPowered;
import strategy.version2.duck.impl.MallardDuck;
import strategy.version2.duck.impl.ModelDuck;

/**
 * 针对超编程类型编程
 *
 * @author lh
 */
public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        Duck mallar = new MallardDuck();
        mallar.quack();
        mallar.fly();

        Duck model = new ModelDuck();
        model.fly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();
    }
}
