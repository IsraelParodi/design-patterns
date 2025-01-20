package Command.Invokers;

import Command.Commands.Command;

public class NoCommand implements Command {
    public void execute() { }

    @Override
    public void undo() {

    }
}
