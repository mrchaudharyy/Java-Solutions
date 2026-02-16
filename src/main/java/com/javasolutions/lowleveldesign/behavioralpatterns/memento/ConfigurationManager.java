package com.javasolutions.lowleveldesign.behavioralpatterns.memento;

import java.util.Stack;

// Caretaker class - manages mementos
public class ConfigurationManager {
    private final Stack<ConfigurationMemento> history = new Stack<>();

    public void saveState(ApplicationConfiguration appConfig) {
        ConfigurationMemento configurationMemento = appConfig.save(); // creates a memento with current state
        history.push(configurationMemento); // stores the memento in the history
        System.out.println("[+] State saved. History size: " + history.size());
        System.out.println(history.size() == 1 ? "[+] Default State: " + configurationMemento : "[+] Current State: " + configurationMemento);
    }

    public void undo(ApplicationConfiguration appConfig) {
        if (history.size() > 1) {
            history.pop(); // removes and returns the last saved state
            ConfigurationMemento mementoToBeRestored = history.peek(); // returns the previous state to be restored
            appConfig.restore(mementoToBeRestored); // restores the application configuration to the previous saved state
            System.out.println("[+] Undo performed. History size: " + history.size());
            System.out.println(history.size() == 1 ? "[+] Default State: " + mementoToBeRestored : "[+] Current State: " + mementoToBeRestored);
        } else {
            System.out.println("[+] No more states to undo!");
            System.out.println("[+] Default State: " + history.peek());
        }
    }
}
