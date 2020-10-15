package HomeWork2;

import java.util.Scanner;

public class Arrays2_1 {
    public static void main(String[] args) {
        Scanner consol = new Scanner(System.in);
        System.out.print("Размер массива : ");
        int size = consol.nextInt();
        int arr[] = new int[size];
        System.out.print("\nВводим элементы массива :");
        for (int i = 0; i < arr.length ; i++) { //этот блок можно написать foreach
            arr[i] = consol.nextInt();
        }
        int i = 0;
        System.out.println("do....while");
        do{
            System.out.print(arr[i++] + " ");
        }while (i < arr.length);
        System.out.println("\n\nwhile");
        i = 0;
        while(i < arr.length){
            System.out.print(arr[i++] + " ");
        }
        System.out.println("\n\nfor");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("\n\nforeach");
        for (int print: arr) {
            System.out.print(print + " ");
        }
    }
}
