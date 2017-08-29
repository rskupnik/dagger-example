package com.github.rskupnik.components.implementations;

import com.github.rskupnik.components.interfaces.Printer;

import javax.inject.Inject;

public class Computer {

    @Inject Keyboard keyboard;
    @Inject Screen screen;
    @Inject Printer printer;

    @Inject
    public Computer() {

    }

    public void use() {
        String input = keyboard.use();
        screen.print(input);
        printer.print(input);
    }
}
