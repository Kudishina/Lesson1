package practice;

import java.util.Scanner;

public class BooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int a = input.nextInt();
        System.out.println("Введите число");
        int b = input.nextInt();
        if (a > 0 && a % 2 == 0) {
            System.out.println(a + b);
        } else if (a < 0 || b != 0) {
            System.out.println(a * b);
        } else {
            System.out.println("нет подходящих условий");
        }
    }
}

