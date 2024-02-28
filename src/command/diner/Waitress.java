package command.diner;

/**
 * @author lh
 */
public class Waitress {
    private Order order;

    public void takeOrder(Order order) {
        this.order  = order;
        order.oderUp();
    }
}
