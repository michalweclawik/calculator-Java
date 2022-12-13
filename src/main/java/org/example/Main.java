package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc= new Calculator();

      Scanner scan =new Scanner(System.in);
        System.out.println("Welcome to Java calculator");
        System.out.println("Use + to add");
        System.out.println("Use - to subtract");
        System.out.println("Use * to multiply ");
        System.out.println("Use / to divide ");
        System.out.println("Use ^ to square ");
        System.out.println("Type C  exit");

      while (calc.isRunning()){
        HandleInput.calc( scan );
    }
}}