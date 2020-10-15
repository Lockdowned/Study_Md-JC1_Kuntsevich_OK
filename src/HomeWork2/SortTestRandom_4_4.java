package HomeWork2;

import java.util.Arrays;
import java.util.Random;

public class SortTestRandom_4_4 {
    public void randomTest(){

        Random g = new Random();
        int size = g.nextInt(30);
        int[] arr = new int[size];
        Random e = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = e.nextInt(50);
        }
        System.out.println(Arrays.toString(arr));

    }
}
