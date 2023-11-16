package edu.austral.ingsis.math.composite.expressions;

import edu.austral.ingsis.math.composite.Function;

public class Multiply extends MathExpression{
    public Multiply(Function left, Function right) {
        super(left, right);
    }

    @Override
    public double resolution() {
        return getLeft().resolution() * getRight().resolution();
    }

    String getOperator() {
        return "*";
    }
}
