package edu.austral.ingsis.math.visitor;

import edu.austral.ingsis.math.visitor.visitors.FunctionVisitor;

public interface Function {
    void accept(FunctionVisitor visitor);
}
