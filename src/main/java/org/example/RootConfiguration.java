package org.example;

import org.example.calculator.dao.ReportDao;
import org.example.calculator.dao.ReportInMemoryDao;
import org.example.calculator.entity.operations.CalcOperation;
import org.example.calculator.services.CalcService;
import org.example.calculator.services.OperationService;
import org.example.calculator.services.ReportService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "org.example.calculator")
public class RootConfiguration {

    @Bean
    public ReportDao dao(){
        return new ReportInMemoryDao();
    }

    @Bean
    public ReportService reportService(ReportDao dao){
        return new ReportService(dao);
    }

    @Bean
    public OperationService operationService( CalcOperation sumOperation, CalcOperation subOperation, CalcOperation mulOperation, CalcOperation divOperation){
        Map<String, CalcOperation> operations = new HashMap<>();
        operations.put(sumOperation.getName(), sumOperation);
        operations.put(subOperation.getName(), subOperation);
        operations.put(mulOperation.getName(), mulOperation);
        operations.put(divOperation.getName(), divOperation);
        return new OperationService(operations);
    }

    @Bean
    public CalcService calcService(){
        return new  CalcService();
    }
}
