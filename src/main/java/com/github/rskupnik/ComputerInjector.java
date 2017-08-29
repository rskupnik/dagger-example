package com.github.rskupnik;

import com.github.rskupnik.components.SomeModule;
import com.github.rskupnik.components.implementations.Computer;
import dagger.Component;

@Component(modules = SomeModule.class)
public interface ComputerInjector {
    Computer computer();
}
