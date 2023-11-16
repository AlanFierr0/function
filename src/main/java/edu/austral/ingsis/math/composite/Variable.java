package edu.austral.ingsis.math.composite;

import java.util.Collections;
import java.util.List;

public class Variable implements Function{

    private final long value;
    private final String name;

    public Variable(long value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public List<String> listVariables() {
        return Collections.singletonList(name);
    }

    @Override
    public String print() {
        return this.name;
    }

    @Override
    public double resolution() {
        return this.value;
    }
}
