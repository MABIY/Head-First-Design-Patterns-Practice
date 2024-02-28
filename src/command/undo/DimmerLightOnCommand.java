package command.undo;

/**
 * @author lh
 */
public class DimmerLightOnCommand implements Command{
    private Light light;
    private int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        prevLevel = light.getLevel();
        light.dim(75);

    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
