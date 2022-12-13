package org.example;

import java.util.*;

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
            try{
if("c".contains(token)){
    System.out.println("calculator off");
    Calculator.setRunning(false);
}
          else  if ("+-/*^".contains(token)) {
                operatorList.add(token);
            }
          else  {
                operandList.add(Double.valueOf(token));
            }

        }catch(NumberFormatException e){
            System.out.println("Please type numbers only ");
        }}

    if (operandList.size()>1) {

        double firstNumber =  userInput.startsWith("-")  ? -operandList.get(0): operandList.get(0);


        String operator =    userInput.startsWith("-") ? operatorList.get(1)  :operatorList.get(0);



        double secondNumber = operatorList.lastIndexOf("-")>1 && userInput.startsWith("-") || operatorList.lastIndexOf("-")>0 && !userInput.startsWith("-") ? -operandList.get(1): operandList.get(1);
        double result = calculate(firstNumber, secondNumber, operator);


        System.out.println("result of calculation : " + result);
        setPreviousResult(result);

        return result;
    }
    if (operandList.size()==1){
//
                double firstNumber = HandleInput.getPreviousResult();
                double secondNumber = operatorList.lastIndexOf("-")>0 ? -operandList.get(0):operandList.get(0);
               double result = calculate(firstNumber, secondNumber, operatorList.get(0));
        System.out.println("result of calculation : " + result);
                setPreviousResult(result);
                return result;
            }

        return 0;
    }
}
