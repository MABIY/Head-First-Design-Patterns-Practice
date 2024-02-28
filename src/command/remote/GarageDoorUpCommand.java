package command.remote;


import command.remote.appliances.GarageDoor;

/**
 * @author lh
 */
public class GarageDoorUpCommand implements Command{
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    private GarageDoor  garageDoor;
    @Override
    public void execute() {
        garageDoor.up();
    }
}
