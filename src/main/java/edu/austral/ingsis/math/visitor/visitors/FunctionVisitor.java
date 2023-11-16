package edu.austral.ingsis.math.visitor.visitors;

import edu.austral.ingsis.math.visitor.Absolute;
import edu.austral.ingsis.math.visitor.Literal;
import edu.austral.ingsis.math.visitor.Variable;
import edu.austral.ingsis.math.visitor.expressions.*;

public interface FunctionVisitor {
    void visitLiteral(Literal literal);
    void visitVariable(Variable variable);
    void visitAdd(Add addition);
    void visitDel(Del subtraction);
    void visitMultiply(Multiply multiplication);
    void visitDivide(Divide division);
    void visitPower(Power power);
    void visitAbsolute(Absolute module);
}
