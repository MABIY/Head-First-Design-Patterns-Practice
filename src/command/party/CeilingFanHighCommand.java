package command.party;

/**
 * @author lh
 */
public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH -> ceilingFan.high();
            case CeilingFan.OFF -> ceilingFan.off();
            case CeilingFan.LOW -> ceilingFan.low();
            case CeilingFan.MEDIUM -> ceilingFan.medium();
        }
    }
}
