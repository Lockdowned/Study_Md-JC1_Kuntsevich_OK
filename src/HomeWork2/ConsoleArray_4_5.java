package HomeWork2;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleArray_4_5 {
    public void ConsoleInput(){
        Scanner consol = new Scanner(System.in);
        System.out.print("Размер массива : ");
        int size = consol.nextInt();
        int arr[] = new int[size];
        System.out.print("\nВводим элементы массива :");

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = consol.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
