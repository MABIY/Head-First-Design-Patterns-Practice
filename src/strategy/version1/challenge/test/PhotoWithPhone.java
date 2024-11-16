package strategy.version1.challenge.test;

import strategy.version1.challenge.app.PhoneCameraApp;
import strategy.version1.challenge.app.Social;
import strategy.version1.challenge.app.Txt;
import strategy.version1.challenge.app.impl.BasicCameraApp;
import strategy.version1.challenge.app.sharestrategy.Email;

import java.util.Scanner;

/**
 * @author lh
 */
public class PhotoWithPhone {
    public static void main(String[] args) {
        PhoneCameraApp cameraApp = new BasicCameraApp();
        String share = getSharing();
        switch (share) {
            case "t" :
                cameraApp.setShareStrategy(new Txt());
                break;
            case "e":
                cameraApp.setShareStrategy(new Email());
                break;
            case "s":
                cameraApp.setShareStrategy(new Social());
                break;
            default:
                cameraApp.setShareStrategy(new Txt());
        }

        cameraApp.take();
        cameraApp.edit();
        cameraApp.save();
        cameraApp.share();
    }

    public static String getSharing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt (t), email (e), or social media (s)?");
        String appName = scanner.next();
        scanner.close();
        return appName;
    }
}
