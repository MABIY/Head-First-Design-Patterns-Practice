package singleton.subclass;

/**
 * @author lh
 */
public class CoolerSingleton extends Singleton {

    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
    }
}
