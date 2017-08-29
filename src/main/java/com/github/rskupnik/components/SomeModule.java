package com.github.rskupnik.components;

import com.github.rskupnik.components.implementations.PrinterImpl;
import com.github.rskupnik.components.interfaces.Printer;
import dagger.Module;
import dagger.Provides;

@Module
public class SomeModule {

    @Provides
    Printer printer() {
        return new PrinterImpl();
    }
}
