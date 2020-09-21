package org.example.calculator.services;

import org.example.calculator.entity.operations.CalcOperation;
import org.example.calculator.exceptions.DivisionByZeroException;

import java.util.Scanner;

public class CalcService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public double calc(CalcOperation operation) throws DivisionByZeroException {
        value1 = getValue("Введите 1-ое число:");
        value2 = getValue("Введите 2-ое число:");
        try {
            return operation.calc(value1, value2);
        }catch (ArithmeticException e) {
            throw new DivisionByZeroException(e);
        }
    }

    private double getValue(String massage) {
        System.err.println(massage);
        if (SCANNER.hasNextInt()) {
            return SCANNER.nextInt();
        }
        System.out.println("Введенное значение не является числом!");
        SCANNER.next();
        return getValue(massage);
    }
}
