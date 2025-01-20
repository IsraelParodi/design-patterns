package Command.BookExample.Invokers;

import Command.BookExample.Commands.Command;

public class NoCommand implements Command {
    public void execute() { }

    @Override
    public void undo() {

    }
}
