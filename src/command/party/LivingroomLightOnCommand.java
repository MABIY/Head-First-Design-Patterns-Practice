package command.party;

/**
 * @author lh
 */
public class LivingroomLightOnCommand implements Command {
    private Light light;
    private int prevLevel;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
