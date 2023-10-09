package lections;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите переменную x");
        int x = input.nextInt();
        System.out.println("введите переменную y");
        int y = input.nextInt();
        if(x < y){
            System.out.println("x < y");

        }else if(x == y) {
            System.out.println("x == y");
        }else {
            System.out.println("y < x");
        }
    }
}
