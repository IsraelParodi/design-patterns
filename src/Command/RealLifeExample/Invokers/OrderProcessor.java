package Command.RealLifeExample.Invokers;

import Command.RealLifeExample.Command.Command;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private final List<Command> commands = new ArrayList<>();
    private final List<Command> executedCommands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void processOrder() throws Exception {
        for (Command command : commands) {
            command.execute();
            executedCommands.add(command);  // Track executed commands for undo
        }
    }

    public void undo() {
        // Undo commands in reverse order
        for (int i = executedCommands.size() - 1; i >= 0; i--) {
            try {
                executedCommands.get(i).undo();
            } catch (Exception e) {
                System.out.println("Error undoing command: " + e.getMessage());
            }
        }
    }
}