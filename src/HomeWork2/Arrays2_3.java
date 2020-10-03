package HomeWork2;

import java.util.Scanner;

public class Arrays2_3 {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = IN.nextInt();
        System.out.println();
        int[] arr = new int[size];
        int c = 0;
        for (int number:arr) {   // как-то можно улчучшить
            arr[c] = IN.nextInt();
            System.out.println("Индекс в массиве: " + c++);
        }
        int i = arr.length - 1 ;
        System.out.println("do....while");
        do{
            System.out.print(arr[i--] + " ");
            if (i == -1) break;
        }while (i < arr.length);
//        System.out.println("\n\nwhile");
//        i = 0;
//        while(i < arr.length){
//            System.out.print(arr[i++] + " ");
//        }
//        System.out.println("\n\nfor");
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + " ");
//        }
//        System.out.println("\n\nforeach");
//        for (int print: arr) {
//            System.out.print(print + " ");
//        }






    }
}
