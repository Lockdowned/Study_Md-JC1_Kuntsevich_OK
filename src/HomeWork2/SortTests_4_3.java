package HomeWork2;

public class SortTests_4_3 {
    public static void main(String[] args) {

        System.out.println("Пузырьковая сортировка");

        BublSort_4 Test_4_3 = new BublSort_4();


        Test_4_3.setArr(new int[] {1,2,3,4,5,6});
        Test_4_3.arraysForBubbles();


        Test_4_3.setArr(new int[] {1,1,1,1});
        Test_4_3.arraysForBubbles();

        Test_4_3.setArr(new int[] {9,1,5,99,9,9});
        Test_4_3.arraysForBubbles();

        Test_4_3.setArr(new int[] {});
        Test_4_3.arraysForBubbles();


        System.out.println("Шейкерная сортировка");


        ShakerSort_4_2 Test_4_3_2 = new ShakerSort_4_2();


        Test_4_3_2.setArr(new int[] {1,2,3,4,5,6});
        Test_4_3_2.arraysForShaker();

        Test_4_3_2.setArr(new int[] {1,1,1,1});
        Test_4_3_2.arraysForShaker();

        Test_4_3_2.setArr(new int[] {9,1,5,99,9,9});
        Test_4_3_2.arraysForShaker();

        Test_4_3_2.setArr(new int[] {});
        Test_4_3_2.arraysForShaker();

        System.out.println("Рандомный массив");
        SortTestRandom_4_4 RandomARR = new SortTestRandom_4_4();
        RandomARR.randomTest();

        System.out.println("Вводим массив");
        ConsoleArray_4_5 Input = new ConsoleArray_4_5();
        Input.consoleInput();




    }
}
