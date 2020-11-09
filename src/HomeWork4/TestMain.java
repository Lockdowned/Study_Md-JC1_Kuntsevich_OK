package HomeWork4;

import java.util.Arrays;


public class TestMain {
    public static void main(String[] args) {


        Integer[] ss = new Integer[]{1, 2, 3, null, null, null};
        DataContainer<Integer> ok = new DataContainer<>(ss);
        System.out.println("\nstart Arr : " + Arrays.toString(ok.getItems()));
        System.out.println("Test Override toString : " + ok.toString());
        System.out.println("add 777 return: " + ok.add(777));
        System.out.println("add null return: " + ok.add(null));

        DataContainer<Integer> ok2 = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        System.out.println("\nstart Arr : " + Arrays.toString(ok2.getItems()));
        System.out.println("add 777 return: " + ok2.add(777));
        System.out.println(Arrays.toString(ok2.getItems()));

        DataContainer<Integer> ok3 = new DataContainer<>(new Integer[]{1, 2, 3});
        System.out.println("\nstart Arr : " + Arrays.toString(ok3.getItems()));
        System.out.println("add 777 return: " + ok3.add(777));
        System.out.println(Arrays.toString(ok3.getItems()));

        DataContainer<Integer> ok4 = new DataContainer<>(new Integer[]{});
        System.out.println("\nstart Arr : " + Arrays.toString(ok4.getItems()));
        System.out.println("add 777 return: " + ok4.add(9999));
        System.out.println("get 0 return: " + ok4.get(0));

        DataContainer<Integer> ok5 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        System.out.println("\nstart Arr : " + Arrays.toString(ok5.getItems()));
        System.out.println("delete 3: " + ok5.delete(3));
        System.out.println(Arrays.toString(ok5.getItems()));
        System.out.println("delete 9: " + ok5.delete(9));
        System.out.println("delete 9: " + ok5.delete(1));
        System.out.println(Arrays.toString(ok5.getItems()));

        DataContainer<Integer> ok6 = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        System.out.println("\nstart Arr : " + Arrays.toString(ok6.getItems()));
        Integer a = 777;
        System.out.println("delete item 777: " + ok6.delete(a));
        System.out.println(Arrays.toString(ok6.getItems()));
        Integer b = 111;
        System.out.println("delete item 111: " + ok6.delete(b));
        System.out.println(Arrays.toString(ok6.getItems()));

        DataContainer<Integer> ok7 = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        System.out.println("\nstart Arr : " + Arrays.toString(ok7.getItems()));
        Integer c = 3;
        System.out.println("delete item 3: " + ok7.delete(c));
        System.out.println(Arrays.toString(ok7.getItems()));















    }
}
