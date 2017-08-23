package com.github.rskupnik.components.implementations;

import com.github.rskupnik.ComputerInjector;
import com.github.rskupnik.components.interfaces.Computer;

import javax.inject.Inject;

public final class ComputerImpl implements Computer {

    @Inject Keyboard keyboard;
    @Inject Screen screen;

    public void use() {
        keyboard.use();
        screen.print("Hello world!");
    }

    public static void main(String[] args) {
        ComputerInjector injector = DaggerComputerInjector.create();
        ComputerImpl computer = injector.computer();
        computer.use();
    }
}
