package HomeWork2;
/*
УСЛОВИЕ ВЫПОЛНЯЕТСЯ
ВОЗМОЖНО ВСЁ НАДО ДЕЛАТЬ ИСКЛЮЧЕНИЯМИ
 */
import java.util.Scanner;

public class Cycles1_3 {
    public static void main(String[] args) {
        System.out.print("Возводимое число и степень:  ");
        Scanner number = new Scanner(System.in);
        double numberIn = number.nextDouble();
        int gradeIn = number.nextInt();
        double sqrt = numberIn;
        if (gradeIn < 0){
            System.out.println("Неверное значение степени");
        }else if (gradeIn == 0){
            sqrt =1;
            System.out.println(sqrt);
        }else {
            for (int i = 1; i < gradeIn ; i++) {
                sqrt *= numberIn;
            }
            System.out.println(sqrt);
        }
    }
}
