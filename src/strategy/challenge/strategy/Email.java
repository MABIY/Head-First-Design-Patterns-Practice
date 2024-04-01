package strategy.challenge.strategy;

/**
 * @author lh
 */
public class Email implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I'm emailing the photo");
    }
}
