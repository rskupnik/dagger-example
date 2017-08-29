package com.github.rskupnik.components.implementations;

import com.github.rskupnik.components.interfaces.Printer;

public class PrinterImpl implements Printer {

    public void print(String s) {
        System.out.println("~~~ " + s + " ~~~");
    }
}
