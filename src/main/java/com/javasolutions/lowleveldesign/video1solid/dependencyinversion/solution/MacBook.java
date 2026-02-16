package com.javasolutions.lowleveldesign.video1solid.dependencyinversion.solution;

import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.Keyboard;
import com.javasolutions.lowleveldesign.video1solid.dependencyinversion.utility.Mouse;

// Following DIP
// High-level module uses abstraction
public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    // Abstraction - defines contract
    // Dependency injection through constructor
    public MacBook(Mouse mouse, Keyboard keyboard) {
        this.keyboard = keyboard; // Works with any kind of keyboard and mouse
        this.mouse = mouse;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
}