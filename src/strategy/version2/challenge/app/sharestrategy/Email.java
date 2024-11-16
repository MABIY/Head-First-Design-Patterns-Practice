package strategy.version2.challenge.app.sharestrategy;

import strategy.version2.challenge.app.ShareStrategy;

/**
 * @author lh
 */
public class Email implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("I'm emailing the photo");
    }
}
