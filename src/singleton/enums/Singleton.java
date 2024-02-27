package singleton.enums;

/**
 * @author lh
 */
public enum Singleton {
    UNIQUE_INSTANCE;


    public String getDescription() {
        return "I'm a thread safe safe Singleton!";
    }
}
