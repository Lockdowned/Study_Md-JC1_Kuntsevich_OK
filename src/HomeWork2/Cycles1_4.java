package HomeWork2;

public class Cycles1_4 {
    public static void main(String[] args) {
        long a = 1;
        long d = 1;
        while (a < Long.MAX_VALUE && a > 0){
            d = a;
            a *= 3;
        }
        System.out.println("До переполнения: " + d);
        System.out.println("После переполнения: " + a);
    }
}
