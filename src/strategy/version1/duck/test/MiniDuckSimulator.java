package strategy.version1.duck.test;

import strategy.version1.duck.behavior.fly.FlyBehavior;
import strategy.version1.duck.behavior.fly.impl.FlyRocketPowered;
import strategy.version1.duck.Duck;
import strategy.version1.duck.behavior.quack.QuackBehavior;
import strategy.version1.duck.impl.DecoyDuck;
import strategy.version1.duck.impl.MallardDuck;
import strategy.version1.duck.impl.ModelDuck;
import strategy.version1.duck.impl.RubberDuck;

/**
 * @author lh
 */
public class MiniDuckSimulator {
    public MiniDuckSimulator() {
    }

    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        // other define fly way
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoyDuck = new DecoyDuck();
        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoyDuck.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
