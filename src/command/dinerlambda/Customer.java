package command.dinerlambda;

/**
 * @author lh
 */
public class Customer {
    private Waitress waitress;
    private Order order;
    private Cook cook;

    public Customer(Waitress waitress,Cook cook) {
        this.waitress = waitress;
        this.cook = cook;
    }

    public void createOrder() {
        this.order = () -> {cook.makeBurger();cook.makeFires();};
    }

    public void hungry() {
        waitress.takeOrder(order);
    }
}
