package com.javasolutions.lowleveldesign.behavioralpatterns.memento;

// Demo Usage
public class MementoDemo {
    public static void main(String[] args) {
        System.out.println("\n###### Memento Design Pattern ######");

        // Create Originator Object
        ApplicationConfiguration appConfig = new ApplicationConfiguration(
                "Light", 12, true, "English"
        );

        // Create Caretaker Object
        ConfigurationManager configurationManager = new ConfigurationManager();

        // Default State
        System.out.println("\n===> State 1: ");
        configurationManager.saveState(appConfig); // Default State

        // State 2
        appConfig.setTheme("Dark");
        appConfig.setFontSize(14);
        System.out.println("\n===> State 2: ");
        configurationManager.saveState(appConfig); // Creates a memento and stores it in history

        // State 3
        appConfig.setTheme("Midnight Blue");
        appConfig.setFontSize(16);
        appConfig.setLanguage("Spanish");
        System.out.println("\n===> State 3: ");
        configurationManager.saveState(appConfig); // Creates a memento and stores it in history

        // Undo 1
        System.out.println("\n===> Undo 1 ");
        configurationManager.undo(appConfig); // Restores the application configuration to the previous saved state

        // Undo 2
        System.out.println("\n===> Undo 2: ");
        configurationManager.undo(appConfig); // Restores the application configuration to the previous saved state

        // Undo 3: Try to undo when no history
        System.out.println("\n===> Undo 3: ");
        configurationManager.undo(appConfig); // Default State
    }
}
