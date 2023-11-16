package edu.austral.ingsis.math.visitor.expressions;

import edu.austral.ingsis.math.visitor.Function;
import edu.austral.ingsis.math.visitor.visitors.FunctionVisitor;

public class Add extends MathExpression {
    public Add(Function leftOperand, Function rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    String getOperator() {
        return "+";
    }

    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitAdd(this);
    }
}
