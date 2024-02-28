package command.remote;


import command.remote.appliances.GarageDoor;

/**
 * @author lh
 */
public class GarageDoorDownCommand implements Command{
    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    private GarageDoor  garageDoor;
    @Override
    public void execute() {
        garageDoor.down();
    }
}
