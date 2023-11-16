package edu.austral.ingsis.math.composite.expressions;

import edu.austral.ingsis.math.composite.Function;

import java.util.List;

public abstract class MathExpression implements Function {
    private final Function left;
    private final Function right;

    public MathExpression(Function left, Function right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public List<String> listVariables() {
        List<String> firstVariables = left.listVariables();
        List<String> secondVariables = right.listVariables();

        if (!firstVariables.isEmpty()) {
            if (!secondVariables.isEmpty()) {
                List<String> variableList = firstVariables;
                variableList.addAll(secondVariables);
                return variableList;
            }
            return firstVariables;
        }
        return secondVariables;
    }

    @Override
    public String print() {
        return "(" + left.print() + " " + getOperator() + " " + right.print() + ")";
    }

    @Override
    public double resolution() {
        return 0;
    }

    public Function getLeft() {
        return left;
    }

    public Function getRight() {
        return right;
    }

    abstract String getOperator();
}
