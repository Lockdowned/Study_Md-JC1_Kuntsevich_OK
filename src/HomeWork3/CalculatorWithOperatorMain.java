package HomeWork3;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator start = new CalculatorWithOperator();
        start.multiply(15,7); // 15 * 7
        start.division(28,5);  // 28 / 5
        start.exponentiation(start.divEnd,2);  // (28 /  5) ^ 2
        start.addition(4.1,start.multipEnd); // 4.1 + (15 * 7)
        start.addition(start.sumEnd, start.exponentEnd); // (4.1 + (15 * 7)) + ((28 /  5) ^ 2)
        System.out.println(start.sumEnd);

    }
}
