package command.undo;

/**
 * @author lh
 */
public interface Command {
    public void execute();
    public void undo();
}
