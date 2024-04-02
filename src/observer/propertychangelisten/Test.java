package observer.propertychangelisten;

import java.util.Objects;

/**
 * @author lh
 */
public class Test {
    public static void main(String[] args) {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);
        observable.setNews("news");
        if(!Objects.equals(observer.getName(), "news")){
            throw new RuntimeException("observable observer not together work");
        }
        System.out.println("work togeter");
    }
}
