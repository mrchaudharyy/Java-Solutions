package com.javasolutions.lowleveldesign.behavioralpatterns.command.solution;

// Command interface
public interface ICommand {
    void execute();

    void undo();
}
