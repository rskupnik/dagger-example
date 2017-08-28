package com.github.rskupnik.components;

import com.github.rskupnik.ComputerInjector;
import com.github.rskupnik.DaggerComputerInjector;

public class Main {

    public static void main(String[] args) throws Exception {
        ComputerInjector injector = DaggerComputerInjector.create();
        injector.computer().use();
    }
}
