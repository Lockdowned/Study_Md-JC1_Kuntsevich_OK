package HomeWork2;

import java.util.Arrays;

public class Arrays2_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 8, 0, 0, 5, 5, 5, 3, 5, 3, 5};
        int[] arr2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b;
        for (int i = 0; i <= arr.length - 1; i++) {
            b = i;
            if ((b %= 2) == 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("\n");
        for (int i = 0; i <= arr2.length - 1; i++) {
            b = i;
            if ((b %= 2) == 0){
                System.out.print(arr2[i] + " ");
            }
        }
    }
}
