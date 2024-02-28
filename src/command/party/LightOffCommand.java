package command.party;

/**
 * @author lh
 */
public class LightOffCommand implements Command {
    private Light light;
    private int prevLevel;

    public LightOffCommand(Light light) {
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
