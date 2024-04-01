package strategy.challenge.strategy;

/**
 * @author lh
 */
public class Txt implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I'm txting the photo");
    }
}
