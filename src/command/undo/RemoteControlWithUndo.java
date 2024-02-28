package command.undo;

/**
 * @author lh
 */
public class RemoteControlWithUndo {
   private Command[] onCommands;

    private Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] =noCommand;;
            offCommands[i] =noCommand;;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        Command command = onCommands[slot];
        command.execute();
        undoCommand = command;
    }

    public void offButtonWasPushed(int slot) {
        Command command = offCommands[slot];
        command.execute();
        undoCommand = command;
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    +"    " + offCommands[i].getClass().getName() + "\n"
            );
        }
        stringBuilder.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuilder.toString();
    }

}
