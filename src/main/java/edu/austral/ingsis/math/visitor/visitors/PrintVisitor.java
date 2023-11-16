package edu.austral.ingsis.math.visitor.visitors;

import edu.austral.ingsis.math.visitor.Absolute;
import edu.austral.ingsis.math.visitor.Literal;
import edu.austral.ingsis.math.visitor.Variable;
import edu.austral.ingsis.math.visitor.expressions.*;

public class PrintVisitor implements FunctionVisitor{
    private String result;

    @Override
    public void visitLiteral(Literal literal) {
        if (literal.getValue() == (long) literal.getValue())
            result =  Integer.toString((int) literal.getValue());
        else result = Double.toString(literal.getValue());
    }
    @Override
    public void visitVariable(Variable variable) {
        result = variable.getName();
    }

    private void MatchExpressionVisitor(String operator, MathExpression mathExpression){
        mathExpression.getLeftOperand().accept(this);
        String left = result;
        mathExpression.getRightOperand().accept(this);
        String right = result;
        result = "( " + left + " " + operator + " " + right + " )";
    }
    @Override
    public void visitAdd(Add sum) {
        MatchExpressionVisitor("+", sum);
    }
    @Override
    public void visitDel(Del subtraction) {
        MatchExpressionVisitor("-", subtraction);
    }
    @Override
    public void visitMultiply(Multiply multiplication) {
        MatchExpressionVisitor("*", multiplication);
    }
    @Override
    public void visitDivide(Divide division) {
        MatchExpressionVisitor("div", division);
    }
    @Override
    public void visitPower(Power power) {
        MatchExpressionVisitor("^", power);
    }
    @Override
    public void visitAbsolute(Absolute module) {
        module.getArgument().accept(this);
        result = "|" + result + "|";
    }

    public String getResult(){
        return result;
    }
}
