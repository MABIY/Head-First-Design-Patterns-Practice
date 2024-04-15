package factory.pizzas.test;

import factory.pizzas.PizzaStore;
import factory.pizzas.factory.SimplePizzaFactory;
import factory.pizzas.pizza.Pizza;

/**
 * @author lh
 */
public class PizzaTestDerive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
