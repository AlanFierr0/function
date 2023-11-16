package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.visitors.FunctionVisitor;

public class Literal implements Function{

    private final double value;

    public Literal(double value) {
        this.value = value;
    }

    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitLiteral(this);
    }

    public double getValue() {
        return value;
    }
}
