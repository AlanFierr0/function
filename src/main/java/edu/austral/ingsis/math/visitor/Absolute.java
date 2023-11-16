package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.visitors.FunctionVisitor;

public class Absolute implements Function {

    private final Function argument;

    public Absolute(Function argument) {
        this.argument = argument;
    }
    public Function getArgument(){
        return argument;
    }

    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitAbsolute(this);
    }
}
