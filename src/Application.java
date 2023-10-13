import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        while (!a.equals("exit")){
            System.out.println("Привет " + a);
        }
        System.out.println("Конец программы");
    }
}
