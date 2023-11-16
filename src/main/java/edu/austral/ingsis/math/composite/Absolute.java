package edu.austral.ingsis.math.composite;

import java.util.List;

public class Absolute implements Function {

    private final Function argument;

    public Absolute(Function argument) {
        this.argument = argument;
    }

    @Override
    public List<String> listVariables() {
        return argument.listVariables();
    }

    @Override
    public String print() {
        return "|" + argument.print() + "|";
    }

    @Override
    public double resolution() {
        return Math.abs(argument.resolution());
    }
}
