package org.example;


import org.example.calculator.CalculatorApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfiguration.class);
        context.getBean("calculatorApplication", CalculatorApplication.class).run();
    }
}
