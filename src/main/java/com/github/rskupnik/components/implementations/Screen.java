package com.github.rskupnik.components.implementations;

import javax.inject.Inject;

public class Screen {

    @Inject
    public Screen() {

    }

    public void print(String s) {
        System.out.println(s);
    }
}
