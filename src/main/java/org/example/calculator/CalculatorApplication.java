package org.example.calculator;

import org.example.calculator.entity.operations.CalcOperation;
import org.example.calculator.exceptions.DestroyApplicationException;
import org.example.calculator.exceptions.DivisionByZeroException;
import org.example.calculator.services.CalcService;
import org.example.calculator.services.OperationService;
import org.example.calculator.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorApplication {
    private OperationService operationService;
    private CalcService calcService;
    private ReportService reportService;

    @Autowired
    public CalculatorApplication(OperationService operationService, CalcService calcService, ReportService reportService) {
        this.operationService = operationService;
        this.calcService = calcService;
        this.reportService = reportService;
    }

    public CalculatorApplication() { }



    public void run() {
        while (true) {
            try {
                CalcOperation operation = operationService.getOperation();

                double result = calcService.calc(operation);
                double value1 = calcService.getValue1();
                double value2 = calcService.getValue2();
                reportService.addLine(value1, value2, operation, result);
                System.out.println("result = " + result);
            }catch (DestroyApplicationException e){
                break;
            }catch (DivisionByZeroException e){
//                e.printStackTrace();
                System.out.println("You can not division by zero! ... ");
            }
        }
        reportService.show();
    }
}
