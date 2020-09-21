package org.example.calculator.entity.operations;

import org.springframework.stereotype.Component;

@Component
public class MulOperation implements CalcOperation {

    @Override
    public double calc(double val1, double val2) {
        return val1 * val2;
    }

    @Override
    public String getName() {
        return "MUL";
    }
}
