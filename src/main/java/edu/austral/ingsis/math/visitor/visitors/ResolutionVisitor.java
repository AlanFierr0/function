package edu.austral.ingsis.math.visitor.visitors;

import edu.austral.ingsis.math.visitor.Absolute;
import edu.austral.ingsis.math.visitor.Literal;
import edu.austral.ingsis.math.visitor.Variable;
import edu.austral.ingsis.math.visitor.expressions.*;

public class ResolutionVisitor implements FunctionVisitor{
    private double result = 0;
    @Override
    public void visitLiteral(Literal literal) {
        result = literal.getValue();
    }

    @Override
    public void visitVariable(Variable variable) {
        result = variable.getValue();
    }

    @Override
    public void visitAdd(Add addition) {
        addition.getLeftOperand().accept(this);
        double left = result;
        addition.getRightOperand().accept(this);
        double right = result;
        result = left + right;
    }

    @Override
    public void visitDel(Del subtraction) {
        subtraction.getLeftOperand().accept(this);
        double left = result;
        subtraction.getRightOperand().accept(this);
        double right = result;
        result = left - right;
    }

    @Override
    public void visitMultiply(Multiply multiplication) {
        multiplication.getLeftOperand().accept(this);
        double left = result;
        multiplication.getRightOperand().accept(this);
        double right = result;
        result = left * right;
    }

    @Override
    public void visitDivide(Divide division) {
        division.getLeftOperand().accept(this);
        double left = result;
        division.getRightOperand().accept(this);
        double right = result;
        result = left / right;
    }

    @Override
    public void visitPower(Power power) {
        power.getLeftOperand().accept(this);
        double left = result;
        power.getRightOperand().accept(this);
        double right = result;
        result = Math.pow(left, right);
    }

    @Override
    public void visitAbsolute(Absolute module) {
        module.getArgument().accept(this);
        result = Math.abs(result);
    }

    public double getResult() {
        return result;
    }
}
