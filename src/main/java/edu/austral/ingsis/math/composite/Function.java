package edu.austral.ingsis.math.composite;

import java.util.List;

public interface Function {
    List<String> listVariables();
    String print();
    double resolution();
}
