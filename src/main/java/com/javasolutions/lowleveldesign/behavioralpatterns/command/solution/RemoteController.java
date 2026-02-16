package com.javasolutions.lowleveldesign.behavioralpatterns.command.solution;

import java.util.Stack;

// Invoker - with undo functionality
public class RemoteController {
    ICommand command; // Holds reference to the command
    Stack<ICommand> commandHistory = new Stack<>();

    RemoteController() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}