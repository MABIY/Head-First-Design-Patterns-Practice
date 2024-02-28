package command.party;

/**
 * @author lh
 */
public class StereoOnWIthCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWIthCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
