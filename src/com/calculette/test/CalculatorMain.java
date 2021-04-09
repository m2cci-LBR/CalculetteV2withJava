package com.calculette.test;

import java.util.Scanner;

public class CalculatorMain {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        AbstractCalculator calculator = new Calculator();

        System.out.println("Saisir le premier nombre");
        int number1 = scanner.nextInt();
        calculator.setNombre(String.valueOf(number1));
        scanner.nextLine();
        System.out.println("Saisir l'operateur");
        char op = scanner.nextLine().charAt(0);
        calculator.setOperateur(String.valueOf(op));

        System.out.println("Saisir le second nombre");
        int number2 = scanner.nextInt();
        calculator.setNombre(String.valueOf(number2));

        calculator.calcul();
    }
}