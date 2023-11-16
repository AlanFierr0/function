package edu.austral.ingsis.math.visitor.expressions;

import edu.austral.ingsis.math.visitor.Function;
import edu.austral.ingsis.math.visitor.visitors.FunctionVisitor;

public class Power extends MathExpression{
    public Power(Function left, Function right) {
        super(left, right);
    }

    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitPower(this);
    }

    @Override
    String getOperator() {
        return "^";
    }
}
