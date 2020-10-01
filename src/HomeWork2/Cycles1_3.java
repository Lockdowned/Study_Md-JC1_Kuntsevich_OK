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
        Scanner grade = new Scanner(System.in);
        double numberIn = number.nextDouble();
        int gradeIn = grade.nextInt();
        double sqrt = numberIn;
        if (gradeIn == 0){
            sqrt = 0;
        }
        for (int i = 2; i <= gradeIn ; i++) {
            sqrt *= numberIn;
        }
        System.out.println(sqrt);


    }
}
