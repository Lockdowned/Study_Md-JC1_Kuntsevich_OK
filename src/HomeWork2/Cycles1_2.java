package HomeWork2;


public class Cycles1_2 {
    public static void main(String[] args) {
        multiplication(Integer.parseInt(args[0]));
    }
    static void multiplication(int nums){
        int sum = 1;
        String cash = "";
        while (nums > 0){
            int b = nums % 10;
            nums /= 10;
            sum *= b;
            if (nums == 0){
                cash = b + cash;
            }else {
                cash = " * " + b + cash;
            }

        }
        System.out.print(cash);
        System.out.print(" = " + sum);
    }
}
