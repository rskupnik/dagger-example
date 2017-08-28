package com.github.rskupnik;

import com.github.rskupnik.components.SomeModule;
import com.github.rskupnik.components.implementations.ComputerImpl;
import dagger.Component;

import javax.inject.Singleton;

@Component(modules = SomeModule.class)
public interface ComputerInjector {
    ComputerImpl computer();
}
