package lections;

public class EasyTypes {
    public static void main(String[] args) {
        boolean a = true;

        System.out.println(a);

        byte b = 127;
        System.out.println(b);

        short c = 32767;
        System.out.println(c);

        int d = 2_147_483_647;
        System.out.println(d);

        long e = 9_223_372_036_854_775_807L;
        System.out.println(e);

        float f = 5.0000010F;
        System.out.println(f);

        double g = 5.00000000010;
        System.out.println(g);

        char h = 'h';
        System.out.println(h);

        char i = '\u0000';
        System.out.println(i);

        char l = '⇸';
        System.out.println(l);


        double x = 0.1;
        double x10 = x * 10;
        System.out.println(x10);

        double y = 0.1;
        double y10 = y + y + y + y + y + y + y + y + y + y;
        System.out.println(y10);

        double errorRate = 0.00001;

        double rate = y10 - x10;

        boolean result = Math.abs(rate) <= errorRate;
        System.out.println(result);

        System.out.println(x10 == y10);


        byte z = 0b01111111;
        System.out.println(z);

        byte r = (byte)0b10000001;
        System.out.println(r);





    }
}
