package factory.pizzafm.pizzas;

import java.util.ArrayList;

/**
 * @author lh
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding scauce...");
        System.out.println("Adding toppings: ");
        for (String s : toppings) {
            System.out.println("    " + s);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official pizzaStore box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer dispaly = new StringBuffer();
        dispaly.append("---- " + name + "----\n");
        dispaly.append(dough + "\n");
        dispaly.append(sauce + "\n");
        for (String topping : toppings) {
            dispaly.append(topping + "\n");
        }
        return dispaly.toString();
    }
}
