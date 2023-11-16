package edu.austral.ingsis.math.visitor.expressions;

import edu.austral.ingsis.math.visitor.Function;
import edu.austral.ingsis.math.visitor.visitors.FunctionVisitor;

public class Multiply extends MathExpression{
    public Multiply(Function left, Function right) {
        super(left, right);
    }

    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitMultiply(this);
    }

    @Override
    String getOperator() {
        return "*";
    }
}
