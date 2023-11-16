package edu.austral.ingsis.math.composite.expressions;

import edu.austral.ingsis.math.composite.Function;

public class Divide extends MathExpression{
    public Divide(Function left, Function right) {
        super(left, right);
    }

    @Override
    public double resolution() {
        return getLeft().resolution() / getRight().resolution();
    }
    @Override
    String getOperator() {
        return "div";
    }
}
