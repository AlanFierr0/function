package edu.austral.ingsis.math.composite.expressions;

import edu.austral.ingsis.math.composite.Function;

public class Add extends MathExpression {
    public Add(Function left, Function right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "+";
    }

    @Override
    public double resolution() {
        return getLeft().resolution() + getRight().resolution();
    }
}
