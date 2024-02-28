package command.remote;

import command.remote.appliances.CeilingFan;

/**
 * @author lh
 */
public class CeilingFanOffCommand implements Command{
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
