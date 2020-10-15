package HomeWork2;

import java.util.Scanner;

public class Arrays2_3 {
    public static void main(String[] args) {
        Scanner IN = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = IN.nextInt();
        System.out.println();
        int[] arr = new int[size];
        System.out.print("\n\nВводим цифры для массива: ");
        int c = 0;
        for (int number:arr) {   // как-то можно улчучшить
            arr[c] = IN.nextInt();
            System.out.println("Индекс в массиве: " + c++);
        }


        System.out.println("do....while");
        int i = arr.length - 1;
        do{
            System.out.print(arr[i--] + " ");
            if (i == -1) break;
        }while (i < arr.length);


        System.out.println("\n\nwhile");
        i = arr.length - 1;
        while(i < arr.length){
            System.out.print(arr[i--] + " ");
            if (i == -1) break;
        }


        System.out.println("\n\nfor");
        for (int j = arr.length - 1; j >= 0 ; j--) {
            System.out.print(arr[j] + " ");
        }


        System.out.println("\n\nforeach ");
        String result = "";
        for (int h : arr) {
            result = h + " " + result;
        }
        System.out.println(result);


        System.out.println("Вводим цифры для массива foreach: ");
        c = size;
        for (int number:arr) {
            arr[c -= 1] = IN.nextInt();
            System.out.println("Индекс в массиве для foreach: " + c);
        }
        System.out.println("\n\nforeach");
        for (int print: arr) {
            System.out.print(print + " ");
        }

    }
}
