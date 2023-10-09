package practice;

public class Arithmetic {
    public static void main(String[] args) {

    byte x = 0b00100011;
    byte y = 0b01010100;

    boolean equality = (x == y);
        System.out.println(equality);

    int sum = x + y;
        System.out.println(sum);

    int difference = Math.abs(y - x);
        System.out.println(difference);

    int multiply = x * y;
        System.out.println(multiply);

    int division = x / y;
        System.out.println(division);

    int remainerOfDivision = (y % x);
        System.out.println(remainerOfDivision);

    char z = '\u00a9';
        System.out.println(z);


    }
}
