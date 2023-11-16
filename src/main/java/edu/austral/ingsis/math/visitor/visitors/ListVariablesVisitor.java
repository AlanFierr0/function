package edu.austral.ingsis.math.visitor.visitors;

import edu.austral.ingsis.math.visitor.Absolute;
import edu.austral.ingsis.math.visitor.Literal;
import edu.austral.ingsis.math.visitor.Variable;
import edu.austral.ingsis.math.visitor.expressions.*;

import java.util.ArrayList;
import java.util.List;

public class ListVariablesVisitor implements FunctionVisitor{
    private final List<String> result = new ArrayList<>();

    @Override
    public void visitLiteral(Literal literal) {

    }

    @Override
    public void visitVariable(Variable variable) {
        result.add(variable.getName());
    }

    public void visitMathExpression(MathExpression mathExpression) {
        mathExpression.getLeftOperand().accept(this);
        mathExpression.getRightOperand().accept(this);
    }

    @Override
    public void visitAdd(Add addition) {
        visitMathExpression(addition);
    }

    @Override
    public void visitDel(Del subtraction) {
        visitMathExpression(subtraction);
    }

    @Override
    public void visitMultiply(Multiply multiplication) {
        visitMathExpression(multiplication);
    }

    @Override
    public void visitDivide(Divide division) {
        visitMathExpression(division);
    }

    @Override
    public void visitPower(Power power) {
        visitMathExpression(power);
    }

    @Override
    public void visitAbsolute(Absolute module) {
        module.getArgument().accept(this);
    }

    public List<String> getResult() {
        return result;
    }
}
