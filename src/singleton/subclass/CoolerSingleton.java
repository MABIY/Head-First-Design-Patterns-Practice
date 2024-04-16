package singleton.subclass;

/**
 * @author lh
 */
public class CoolerSingleton extends Singleton{
    // useful instance variables here
    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
    }
}
