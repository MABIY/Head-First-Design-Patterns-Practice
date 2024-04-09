package decorator.pizza.test;

import decorator.pizza.topping.Cheese;
import decorator.pizza.topping.Olives;
import decorator.pizza.Pizza;
import decorator.pizza.concretepizza.ThincrustPizza;

/**
 * @author lh
 */
public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThincrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(cheesePizza);

        System.out.println(greekPizza.getDescription() +" $" + greekPizza.cost());
    }
}
