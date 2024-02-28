package command.party;

/**
 * @author lh
 */
public class LivingroomLightOffCommand implements Command {
    private Light light;
    private int prevLevel;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
