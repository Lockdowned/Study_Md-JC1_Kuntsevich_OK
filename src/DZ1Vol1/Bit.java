package DZ1Vol1;

public class Bit {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c;
        System.out.println(Integer.toBinaryString(a)); // нулей слева не хватает т.к. в байте 8 ячеек не видно значит не заняты
        System.out.println(Integer.toBinaryString(b));

        /*
        a = 0b00101010
        b = 0b00001111
        -a = 0b11010101
        -b = 0b11110000
         */


        c = a & b; // оба бита 1
         /*
        a = ob00101010
        b = 0b00001111
        c = 0b00001010
          */
        System.out.println("Bit And& +example " + c);
        c = -a & -b;
        System.out.println("Bit And& -example " + c + "\n ----");
        c = a | b; // любой бит 1
         /*
        a = 0b00101010
        b = 0b00001111
        c = 0b00101111
          */
        System.out.println("Bit Or| +example " + c);
        c = -a | -b;
        System.out.println("Bit Or| -example " + c + "\n ----");
        c = a ^ b; // только один бит 1
         /*
        a = 0b00101010
        b = 0b00001111
        c = 0b00100101
          */
        System.out.println("Bit Xor^ -example " + c);
        c = -a ^ -b;
        System.out.println("Bit Xor^ -example " + c + "\n ----");
        c = ~a; // инвертирует все биты - тоесть делает число отрицательным
         /*
        a = ob00101010
        c = 0b11010101
          */
        System.out.println("Bit Not~ example " + c);
        c = ~b;
        c = ~-a;
        c = ~-b; // чтобы получить изначальное число нужно добавлять +1
        System.out.println("Bit Not~ -example " + c + "\n -----");



        c = a << 2; // сдвигается влево на 2 нуля
         /*
        a = 0b00101010
        c = 0b0010101000
          */
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c);
        c = 0b0010101000; //OK
        System.out.println(Integer.toBinaryString(c));
        System.out.println(c + "   Сдвиг влево" + "\n ----");
        c = b << 3;
        c = a << 1;
        c = -a << 2;

        c = a >> b;
        System.out.println(c + "  Zero" );

        c = a >> -2;
        System.out.println(c + "  Zero-" );

        c = a >> 2;  // сдвигает вправо на 2 крайних знака
        /*
        a = 0b00101010
        c = 0b00001010
          */
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
        System.out.println();
        System.out.println();
        c = b >> 3;
        c = -a >> 4; // сдвигает вправо на 4 крайних знака
         /*
        -a = 0b11010101
         c = 0b11111101
          */
        c = -b >> 2;


        c = a >>> 2; // сдвигается вправо только на ноль
        /*
        a = 0b00101010
        c = 0b00001010
          */
        c = b >>> 3;
        c = a >>> 1;
        c = -a >>> 2; // сдвигается вправо только на ноль
        /*
        a = 0b11010101
        c = 0b00001010
          */

        a &= b; // a = a & b
        System.out.println(a);
        a |= b; // a = a | b
        a ^= a ^ b; // a = a ^ b
        a >>= b; // a = a >> b;
        a <<= b; // a = a << b;
        a >>>= b; // a = a >>> b;

//        double l = 42.5;
////        l >>= 2; //cannot


    }
}