package command.undo;

/**
 * @author lh
 */
public class LightOnCommand implements Command{
    private Light light;
    private int preLevel;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        preLevel = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(preLevel);
    }
}
