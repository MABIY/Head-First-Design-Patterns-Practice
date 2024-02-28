package command.remote;

import command.remote.appliances.Hottub;

/**
 * @author lh
 */
public class HottubOffCommand implements Command{
    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.cool();
        hottub.off();
    }
}
