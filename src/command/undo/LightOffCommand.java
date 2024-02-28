package command.undo;

/**
 * @author lh
 */
public class LightOffCommand implements Command{
    private Light light;
    private int preLevel;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        preLevel = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(preLevel);
    }
}
