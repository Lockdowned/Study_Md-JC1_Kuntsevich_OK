package HomeWork2;

import java.util.Arrays;

public class ShakerSort_4_2 {
        int[] arr;

        public void ArraysForShaker(){
        System.out.println("Изначальный массив: " + Arrays.toString(arr));

        boolean completedSort = false;
        int left, right, cash;
        left = 0;
        right = arr.length - 1;
        while (!completedSort){
            completedSort = true;
            for (int i = left; i < right ; i++) {
                if (arr[i] > arr[i + 1]) {
                    completedSort = false;
                    cash = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = cash;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i - 1] > arr[i]) {
                    completedSort = false;
                    cash = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = cash;
                }
            }
            left++;
        }

        System.out.println("После сортировки: " + Arrays.toString(arr));
    }
}
