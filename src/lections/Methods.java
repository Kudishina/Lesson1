package lections;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = input.nextInt();
        System.out.println("Введите знак операции");
        char operation = input.next().charAt(0);
        System.out.println("Введите второе число");
        int secondNumber = input.nextInt();
        printSum(firstNumber, secondNumber, operation);


    }

    private static void printSum(int firstNumber, int secondNumber, char operation) {
        if (operation == '+') {
            System.out.println(getSum(firstNumber, secondNumber));
        }
    }

    private static String getSum(int firstNumber, int secondNumber) {

        return String.valueOf(firstNumber + secondNumber);
    }


}


