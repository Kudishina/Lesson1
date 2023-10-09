package practice;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        int first = input.nextInt();
        System.out.println("Введите знак операции");
        char operation = input.next().charAt(0);
        System.out.println("Введите второе число");
        int second = input.nextInt();
        difference(first, second, operation);
        multyply(first, second, operation);
        division(first, second, operation);
        calc(first, second, operation);

    }

    private static void sum(int first, int second) {

            System.out.println(first + second);
        }


    private static void difference(int first, int second, char operation) {
        if (operation == '-') {
            System.out.println(first - second);
        }
    }

    private static void multyply(int first, int second, char operation) {
        if (operation == '*') {
            System.out.println(first * second);
        }
    }

    private static void division(int first, int second, char operation) {
        if (operation == '/') {
            System.out.println(first / second);
        }
    }

    private static void calc(int first, int second, char operation) {
        if (operation == '+') {
            sum(first, second);
        } else if (operation == '-') {
            System.out.println(difference(first, second));
        } else if (operation == '*') {
            System.out.println(multyply(first, second));
        } else if (operation == '/') {
            System.out.println(division(first, second));
        } else {
            System.out.println("невозможно определить знак операции");
        }
    }

    private static String getSum(int first, int second) {
        return String.valueOf(first + second);
    }

    private static String difference(int first, int second) {
        return String.valueOf(first - second);

    }

    private static String multyply(int first, int second) {
        return String.valueOf(first * second);

    }

    private static String division(int first, int second) {
        return String.valueOf(first / second);
    }

}
