package singleton.dcl;

/**
 * @author lh
 * double-checked locking
 */
public class Singleton {
    private volatile static Singleton  uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(uniqueInstance==null) {
            synchronized (Singleton.class){
                if(uniqueInstance==null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}

