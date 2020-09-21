package org.example.calculator.entity;

import org.example.calculator.entity.operations.CalcOperation;
import java.util.Date;


public class ReportLine {
    private Date date = new Date();
    private double value1;
    private double Value2;
    private CalcOperation operation;
    private double result;

    public ReportLine(double value1, double value2, CalcOperation operation, double result) {
        this.value1 = value1;
        Value2 = value2;
        this.operation = operation;
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return Value2;
    }

    public void setValue2(double value2) {
        Value2 = value2;
    }

    public CalcOperation getOperation() {
        return operation;
    }

    public void setOperation(CalcOperation operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ReportLine{" +
                "date=" + date +
                ", value1=" + value1 +
                ", Value2=" + Value2 +
                ", operation='" + operation.getName() + '\'' +
                ", result=" + result +
                '}';
    }
}
