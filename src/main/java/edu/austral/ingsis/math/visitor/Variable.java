package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.visitors.FunctionVisitor;

public class Variable implements Function{
    private final String name;
    private final long value;

    public Variable(String name, long value){
        this.name = name;
        this.value = value;
    }
    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitVariable(this);
    }

    public String getName(){
        return name;
    }

    public long getValue(){
        return value;
    }
}
