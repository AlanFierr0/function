package edu.austral.ingsis.math.composite.expressions;

import edu.austral.ingsis.math.composite.Function;

public class Power extends MathExpression{
    public Power(Function left, Function right) {
        super(left, right);
    }

    @Override
    String getOperator() {
        return "^";
    }

    @Override
    public double resolution() {
        return Math.pow(getLeft().resolution(), getRight().resolution());
    }
}
