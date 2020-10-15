package HomeWork2;

import java.util.Scanner;

public class Arrays2_2 {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = IN.nextInt();
        System.out.println();
        int[] arr = new int[size];
        int c = size;
        for (int number:arr) {
            System.out.println("Ввести ещё: " + c-- + " числа");
            arr[c] = IN.nextInt();
        }
        int b;
        System.out.print("Каждый второй элемент массива: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            b = i;
            if ((b %= 2) == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
