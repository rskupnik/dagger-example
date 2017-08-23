package com.github.rskupnik;

import com.github.rskupnik.components.implementations.ComputerImpl;
import dagger.Component;

import javax.inject.Singleton;

@Component
@Singleton
public interface ComputerInjector {
    ComputerImpl computer();
}
