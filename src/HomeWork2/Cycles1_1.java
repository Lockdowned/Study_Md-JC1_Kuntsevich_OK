package HomeWork2;
/*
КОД НЕОБХОДИМО УЛУЧШАТЬ
 */
public class Cycles1_1 {
    public static void main(String[] args) {
        multiplication(5);
    }
    static void multiplication(int nums){
        int result = 1;
        for (int i = 1; i <= nums; i++) {
            result *= i;
            if (i < nums){
                System.out.print(i + " * ");
            }else {
                System.out.print(i);
            }
        }
        System.out.print(" = "  + result);
    }

}
