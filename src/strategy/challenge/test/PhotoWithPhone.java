package strategy.challenge.test;

import strategy.challenge.BasicCameraApp;
import strategy.challenge.PhoneCameraApp;
import strategy.challenge.strategy.Email;
import strategy.challenge.strategy.Social;
import strategy.challenge.strategy.Txt;

import java.util.Scanner;

/**
 * @author lh
 */
public class PhotoWithPhone {
    public static void main(String[] args) {
        PhoneCameraApp cameraApp = new BasicCameraApp();
        String share = getSharing();
        switch (share) {
            case "t" : cameraApp.setShareStrategy(new Txt()); break;
            case "e" : cameraApp.setShareStrategy(new Email()); break;
            case "s" : cameraApp.setShareStrategy(new Social()); break;
            default: cameraApp.setShareStrategy(new Txt());
        }

        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.share();
    }

    public static String getSharing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt (t), email (e), or social meida (s)?");
        String appName = scanner.next();
        scanner.close();
        return appName;
    }
}
