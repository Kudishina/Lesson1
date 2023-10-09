package practice;

import java.util.Scanner;

public class BooleanOperators2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 0;
        if (a == -10 ^ a > b) {
            System.out.println("ok");
        } else {
            System.out.println("Это число меньше 1 или  равно 10");
        }

    }
}
