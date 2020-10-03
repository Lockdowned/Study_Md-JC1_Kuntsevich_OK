package HomeWork2;
/*
ИНТЕРЕСНО КАК БЕЗ ПОВТОРЕНИЯ FOR РЕАЛИЗОВАТЬ
 */
public class Cycles1_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println();
            for (int j = 2; j <= 5 ; j++) {
                int multi;
                multi = i * j;
                System.out.print(j + " x " + i + " = " + multi + "\t\t");
            }
        }
        System.out.print("\n------------------------------------------------------------");
        for (int i = 1; i <= 10 ; i++) {
            System.out.println();
            for (int j = 6; j <= 9 ; j++) {
                int multi;
                multi = i * j;
                System.out.print(j + " x " + i + " = " + multi + "\t\t");
            }
        }





    }

}
