package strategy.version2.duck.test;

import strategy.version2.duck.behavior.fly.FlyBehavior;
import strategy.version2.duck.behavior.fly.impl.FlyRocketPowered;
import strategy.version2.duck.behavior.quack.QuackBehavior;
import strategy.version2.duck.Duck;
import strategy.version2.duck.impl.DecoyDuck;
import strategy.version2.duck.impl.MallardDuck;
import strategy.version2.duck.impl.ModelDuck;
import strategy.version2.duck.impl.RubberDuck;

/**
 * @author lh
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        // other define fly way
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoyDuck = new DecoyDuck();
        Duck model = new ModelDuck();

        mallard.quack();
        rubberDuckie.quack();
        decoyDuck.quack();

        model.fly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.fly();

        //by accept interface method
        System.out.println("perform by accept interface method");
        performFly(mallard);
        performQuack(mallard);
        performFly(rubberDuckie);
        performQuack(rubberDuckie);
        performFly(decoyDuck);
        performQuack(decoyDuck);
        performFly(model);
        performQuack(model);
    }

    public static void performFly(FlyBehavior flyBehavior) {
        flyBehavior.fly();
    }

    public static void performQuack(QuackBehavior quackBehavior) {
        quackBehavior.quack();
    }
}
