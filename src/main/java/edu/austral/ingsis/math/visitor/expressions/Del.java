package edu.austral.ingsis.math.visitor.expressions;

import edu.austral.ingsis.math.visitor.Function;
import edu.austral.ingsis.math.visitor.visitors.FunctionVisitor;

public class Del extends MathExpression{

    public Del(Function left, Function right) {
        super(left, right);
    }
    @Override
    public void accept(FunctionVisitor visitor) {
        visitor.visitDel(this);
    }

    @Override
    String getOperator() {
        return "-";
    }
}
