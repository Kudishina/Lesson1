package practice;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите число x");
        int x = input.nextInt();
        System.out.println("введите число y");
        int y = input.nextInt();
        if (x > y) {
            System.out.println(x - y);
        } else if (y > x) {
            System.out.println(y + x);
        } else {
            System.out.println("Числа равны");
        }
    }
}
