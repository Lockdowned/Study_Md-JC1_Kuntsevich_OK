package HomeWork2;

import java.util.Arrays;

public class BublSort_4 {
    private int[] arr;

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void arraysForBubbles(){
        System.out.println("Изначальный массив: " + Arrays.toString(arr));

        boolean completedSort = false;
        int cash;
        while (!completedSort) {
            completedSort = true;
            for (int i = 0; i < arr.length -1; i++) { // подсмотрено в инете, придумать самому
                if (arr[i] > arr[i + 1]) {
                    completedSort = false;
                    cash = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = cash;
                }
            }
        }
        System.out.println("После сортировки: " + Arrays.toString(arr));

    }

}
