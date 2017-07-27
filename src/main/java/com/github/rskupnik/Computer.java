package com.github.rskupnik;

import javax.inject.Inject;

public final class Computer {

    @Inject Keyboard keyboard;

    public void use() {
        keyboard.use();
    }

    public static void main(String[] args) {
        MyInjector injector = DaggerMyInjector.create();
        Computer computer = injector.computer();
        computer.use();
    }
}
