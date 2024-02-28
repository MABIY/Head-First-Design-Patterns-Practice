package command.diner;

/**
 * @author lh
 */
public class Customer {
    private Waitress waitress;
    private Order order;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    public void createOrder(Order order) {
        this.order = order;
    }

    public void hungry() {
        waitress.takeOrder(order);
    }
}
