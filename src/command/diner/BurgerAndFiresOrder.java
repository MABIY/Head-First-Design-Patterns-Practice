package command.diner;

/**
 * @author lh
 */
public class BurgerAndFiresOrder implements Order {
    private Cook cook;
    public BurgerAndFiresOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void oderUp() {
        cook.makeBurger();
        cook.makeFires();
    }
}
