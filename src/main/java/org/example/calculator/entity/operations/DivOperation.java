package org.example.calculator.entity.operations;

import org.example.calculator.exceptions.DivisionByZeroException;
import org.springframework.stereotype.Component;

@Component
public class DivOperation implements CalcOperation {

    @Override
    public double calc(double val1, double val2) throws ArithmeticException {
        if (val2 == 0.0) {
            throw new ArithmeticException();
        }
        return val1 / val2;
    }

    @Override
    public String getName() {
        return "DIV";
    }
}
