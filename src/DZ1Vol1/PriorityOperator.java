package DZ1Vol1;

public class PriorityOperator {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(5 + 2 / a); // 5
        System.out.println((5 + 2) / a ); // 0
//        System.out.println((5 + 2++) / a); // fail ++ no available with numeral
//        System.out.println((5 + 2++) / --a); // fail ++ no available with numeral
//        System.out.println((5 * 2 >> 2++) / --a); // fail ++ no available with numeral
        System.out.println((5 * 2 >> 2) / --a); //  first --a then 5 * 2 then >>     5 * 2 = 10 to bin 1010>>2 = 0010,  2 / 7 = 0
        a = 8;
//        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --a); // fail ++ no available with numeral
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> 2) / --a); // --a = 7     22 * 2 = 44 = 101100 >> 2 = 1100 = 12 / 7 = 1
        a = 8;
//        System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --a); // fail ++ no available with numeral
//        System.out.println((5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2) / --a); // fail 68 >= 68 no comparable] - boolean in ternary operator
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> 2) / --a); // 1
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119); // false
        /*
        6 - 2 = 4 > 3 (true)
        12 * 12 = 144 <= 119 (false)
         */
        System.out.println(true && false); // false
        System.out.println(false && true); // false        second true no calculate





    }

}
