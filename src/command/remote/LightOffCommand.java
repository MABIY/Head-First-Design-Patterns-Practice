package command.remote;


import command.remote.appliances.Light;

/**
 * @author lh
 */
public class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
