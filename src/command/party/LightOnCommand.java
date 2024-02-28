package command.party;

/**
 * @author lh
 */
public class LightOnCommand implements Command {
    private Light light;
    private int prevLevel;

    public LightOnCommand(Light light) {
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
