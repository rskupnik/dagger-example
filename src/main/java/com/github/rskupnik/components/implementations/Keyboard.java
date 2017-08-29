package com.github.rskupnik.components.implementations;

import javax.inject.Inject;
import java.util.Scanner;

public class Keyboard {

    private Scanner scanner = new Scanner(System.in);

    @Inject
    public Keyboard() {

    }

    public String use() {
        return scanner.nextLine();
    }
}
