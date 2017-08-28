package com.github.rskupnik.components.implementations;

import com.github.rskupnik.components.interfaces.Computer;

import javax.inject.Inject;

public class ComputerImpl implements Computer {

    @Inject Keyboard keyboard;
    @Inject Screen screen;

    @Inject
    public ComputerImpl() {

    }

    public void use() {
        keyboard.use();
        screen.print("Hello world!");
    }
}
