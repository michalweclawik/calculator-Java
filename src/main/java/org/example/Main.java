package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc= new Calculator();

      Scanner scan =new Scanner(System.in);
      while (calc.isRunning()){
        HandleInput.calc( scan );
    }
}}