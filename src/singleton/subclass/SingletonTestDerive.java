package singleton.subclass;

/**
 * @author lh
 */
public class SingletonTestDerive {
    public static void main(String[] args) {
        Singleton foo =  CoolerSingleton.getInstance();
        Singleton bar = HotterSingleton.getInstance();
        System.out.println(foo);
        System.out.println(bar);
    }
}
