package command.party;

/**
 * @author lh
 */
public class HottubOffCommand implements Command{
    private Hottub hottub;
    private boolean prevOn;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        prevOn = hottub.isOn();
        hottub.setTemperature(98);
        hottub.off();
    }

    @Override
    public void undo() {
        if (prevOn) {
            hottub.on();
        } else {
            hottub.off();
        }
    }
}
