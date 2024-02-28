package command.remote;

import command.remote.appliances.Light;

/**
 * @author lh
 */
public class LivingroomLightOnCommand implements Command{
    private Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
