package command.party;

/**
 * @author lh
 */
public class HottubOnCommand implements Command{
    private Hottub hottub;
    private boolean prevOn;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        prevOn = hottub.isOn();
        hottub.on();
        hottub.setTemperature(104);
        hottub.circulate();
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
