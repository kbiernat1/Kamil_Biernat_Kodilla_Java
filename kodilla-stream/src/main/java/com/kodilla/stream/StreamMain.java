package com.kodilla.stream;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        //I. Podejście funkcyjne – wyrażenia lambda
        //         Processor processor = new Processor();

        //opcja 1: ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        //         processor.execute(executeSaySomething);
        //opcja 2: Executor task = () -> System.out.println("task to execute");
        //opcja 3: processor.execute(() -> System.out.println("task to ex"));



        //II. Wyrażenie lambda a metody z argumentami
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        /* expressionExecutor.executeExpression(3, 5 ,(a, b) -> a + b);
        expressionExecutor.executeExpression(3, 5 ,(a, b) -> a - b);
        expressionExecutor.executeExpression(3, 5 ,(a, b) -> a * b);
        expressionExecutor.executeExpression(3, 5 ,(a, b) -> a / b); */



        //III. Referencje do metod
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
    }
}
