package HomeWork2;

public class SortTests_4_3 {
    public static void main(String[] args) {

        System.out.println("Пузырьковая сортировка");

        BublSort_4 Test_4_3 = new BublSort_4();


        Test_4_3.arr = new int[] {1,2,3,4,5,6};
        Test_4_3.ArraysForBubbles();


        Test_4_3.arr = new int[] {1,1,1,1};
        Test_4_3.ArraysForBubbles();

        Test_4_3.arr = new int[] {9,1,5,99,9,9};
        Test_4_3.ArraysForBubbles();

        Test_4_3.arr = new int[] {};
        Test_4_3.ArraysForBubbles();


        System.out.println("Шейкерная сортировка");


        ShakerSort_4_2 Test_4_3_2 = new ShakerSort_4_2();


        Test_4_3_2.arr = new int[] {1,2,3,4,5,6};
        Test_4_3_2.ArraysForShaker();

        Test_4_3_2.arr = new int[] {1,1,1,1};
        Test_4_3_2.ArraysForShaker();

        Test_4_3_2.arr = new int[] {9,1,5,99,9,9};
        Test_4_3_2.ArraysForShaker();

        Test_4_3_2.arr = new int[] {};
        Test_4_3_2.ArraysForShaker();

        System.out.println("Рандомный массив");
        SortTestRandom_4_4 RandomARR = new SortTestRandom_4_4();
        RandomARR.RandomTest();

        System.out.println("Вводим массив");
        ConsoleArray_4_5 Input = new ConsoleArray_4_5();
        Input.ConsoleInput();




    }
}
