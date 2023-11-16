package edu.austral.ingsis.math.visitor.expressions;

import edu.austral.ingsis.math.visitor.Function;

public abstract class MathExpression implements Function{
    private final Function leftOperand;
    private final Function rightOperand;


    public MathExpression(Function leftOperand, Function rightOperand){
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public Function getLeftOperand() {
        return leftOperand;
    }

    public Function getRightOperand() {
        return rightOperand;
    }

    abstract String getOperator();
}
