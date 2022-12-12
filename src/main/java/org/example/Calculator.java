package org.example;

public class Calculator {

static boolean  running =true;

    public boolean isRunning() {
        return running;
    }

    public static void setRunning(boolean running) {
        Calculator.running = running;
    }

    public static  double calculate(double firstNumber, double secondNumber, String operator){
        double result=0;
        switch (operator){
            case "-":
                result=firstNumber - secondNumber;
                break;
            case "+":
                result=firstNumber + secondNumber;
                break;
            case "/":
                result=firstNumber / secondNumber;
                break;
            case "*":
                result=firstNumber * secondNumber;
                break;
            case  "^":
                result=Math.pow(firstNumber,secondNumber);
                break;

            default:
                result=0;
        }
        return result;

    }
}
