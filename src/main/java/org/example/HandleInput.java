package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import static org.example.Calculator.calculate;

public class HandleInput {
    private static double previousResult;

    public static double getPreviousResult() {
        return previousResult;
    }

    public static void setPreviousResult(double previousResult) {
        HandleInput.previousResult = previousResult;
    }

    public static  double calc (Scanner scan) {

        String userInput = scan.nextLine();

        List<String> operatorList = new ArrayList<String>();
        List<Double> operandList = new ArrayList<Double>();
        double prevoiusResult= 0;
        StringTokenizer st = new StringTokenizer(userInput, "+-*/^", true);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
if("c".contains(token)){
    System.out.println("calculator off");
    Calculator.setRunning(false);
}
          else  if ("+-/*^".contains(token)) {
                operatorList.add(token);
            }
          else if ("1234567890".contains(token)) {
                operandList.add(Double.valueOf(token));
            }
          else{
    System.out.println("invalid input please use numbers");
          }
        }
        System.out.println("Operators:" + operatorList);
        System.out.println("Operands:" + operandList);

    if (operandList.size()>1) {
        double firstNumber = operandList.get(0);
        double secondNumber = operandList.get(1);
        double result = calculate(firstNumber, secondNumber, operatorList.get(0));
        System.out.println(result);
        setPreviousResult(result);
        System.out.println("prev   " + prevoiusResult);
        return result;
    }
    if (operandList.size()==1){
        System.out.println("here are :" + HandleInput.getPreviousResult());
                double firstNumber = HandleInput.getPreviousResult();
                double secondNumber = operandList.get(0);
               double result = calculate(firstNumber, secondNumber, operatorList.get(0));
                System.out.println(result);
                setPreviousResult(result);
                return result;
            }

        return 0;
    }
}
