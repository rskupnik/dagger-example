package com.github.rskupnik;

import com.github.rskupnik.components.ProvidersModule;
import com.github.rskupnik.components.implementations.Computer;
import dagger.Component;

@Component(modules = ProvidersModule.class)
public interface ComputerInjector {
    Computer computer();
}
