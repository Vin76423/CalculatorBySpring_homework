package org.example.calculator.services;

import org.example.calculator.entity.operations.CalcOperation;
import org.example.calculator.exceptions.DestroyApplicationException;

import java.util.Map;
import java.util.Scanner;

public class OperationService {
    private static final Scanner SCANNER = new Scanner(System.in);
    private Map<String, CalcOperation> operations;

    public OperationService(Map<String, CalcOperation> operations) {
        this.operations = operations;
    }


    public CalcOperation getOperation() throws DestroyApplicationException {
        System.out.println("Введите арифметическую операцию, либо слово 'stop' для завершения работы приложения и вывода отчота об операциях:");
        String operation = SCANNER.nextLine();
        if (operation.equals("stop")) {
            throw new DestroyApplicationException();
        }
        CalcOperation calcOperation = operations.get(operation);
        if (calcOperation != null) {
            return calcOperation;
        }else{
            System.out.println("Нет такой операции!");
            return getOperation();
        }
    }
}
