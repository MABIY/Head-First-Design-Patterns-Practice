package singleton.chocolate;

/**
 * @author lh
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    public ChocolateBoiler() {
        empty = true;
        boiled =false;
    }

    public static ChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instnace of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled= false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled =true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
