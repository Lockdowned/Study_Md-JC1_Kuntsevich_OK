package DZ1Vol1;

public class PriorityOperator {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(5 + 2 / a); // 5
        System.out.println((5 + 2) / a ); // 0
//        System.out.println((5 + 2++) / a); // fail ++ no available with numeral
//        System.out.println((5 + 2++) / --a); // fail ++ no available with numeral
//        System.out.println((5 * 2 >> 2++) / --a); // fail ++ no available with numeral
//        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --a); // fail ++ no available with numeral
//        System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --a); // fail ++ no available with numeral
//        System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2) / --a); // fail 68 >= 68 no comparable] - boolean in ternary operator
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> 2) / --a); // 1
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); // false
        System.out.println(true && false); // false
        int b = 5;
        System.out.println(++b * 2);
        b = 5;
        System.out.println(b + 3 > b + 2);
        System.out.println();
        System.out.println();




    }

}
