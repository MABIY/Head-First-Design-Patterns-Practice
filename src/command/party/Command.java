package command.party;

/**
 * @author lh
 */
public interface Command {
    public void execute();
    public void undo();
}
