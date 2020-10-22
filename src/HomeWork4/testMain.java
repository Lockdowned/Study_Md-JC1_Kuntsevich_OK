package HomeWork4;

import java.util.Arrays;


public class testMain {
    public static void main(String[] args) {
        DataContainerTest<Integer> lel = new DataContainerTest<>();
        lel.setItem(213);
        DataContainerTest lel2 = new DataContainerTest<>();
        lel2.setItem("Objects extends whatever");
        System.out.println(lel2.getItem());

        DataContainerTest2 lel3 = new DataContainerTest2();
        lel3.setItem(23534); // extends only Numeral
        lel3.setItem(new Integer(32525));
        lel3.setItem(Long.valueOf(911)); //more correct
        System.out.println(lel3.getItem());


        DataContainer ok = new DataContainer();
//        ok.data = new Object[] {1, null, 3, null, null, null};
        ok.data = new Object[3];
//        ok.data = new Object[0];
        ok.add("kik");
        ok.add(null);
        ok.add("moi");
        ok.add(" 1224");
        ok.add(" 1111");
        ok.add("Obamka");
        ok.add(null);

//        System.out.println(ok.add(null));
        System.out.println(ok.add(55));
        System.out.println(Arrays.toString(ok.data));
        System.out.println(Arrays.toString(ok.dataCopy));
        System.out.println(ok.get(34));
        System.out.println(Arrays.toString(ok.getItems()));






    }
}
