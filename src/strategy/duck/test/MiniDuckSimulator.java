package strategy.duck.test;

import strategy.duck.*;
import strategy.duck.behavior.fly.FlyBehavior;
import strategy.duck.behavior.fly.FlyRocketPowered;
import strategy.duck.behavior.quack.QuackBehavior;

/**
 * @author lh
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        FlyBehavior cantFly = () -> System.out.println("I canot fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly,squeak);

        DecoyDuck decoy  = new DecoyDuck();

        Duck model = new ModelDuck();


        Duck mallard  = new MallardDuck();
        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        mallard.performFly();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
