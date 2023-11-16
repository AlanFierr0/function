package edu.austral.ingsis.math.composite.expressions;

import edu.austral.ingsis.math.composite.Function;

public class Del extends MathExpression{
    public Del(Function left, Function right) {
        super(left, right);
    }

    public double resolution() {
        return getLeft().resolution() - getRight().resolution();
    }

    @Override
    String getOperator() {
        return "-";
    }
}
