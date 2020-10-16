package HomeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        calc.multiply(15,7); // 15 * 7
        calc.division(28,5);  // 28 / 5
        calc.exponentiation(calc.getDivEnd(),2);  // (28 /  5) ^ 2
        calc.addition(4.1,calc.getMultipEnd()); // 4.1 + (15 * 7)
        calc.addition(calc.getSumEnd(), calc.getExponentEnd()); // (4.1 + (15 * 7)) + ((28 /  5) ^ 2)
        System.out.println(calc.getSumEnd());
    }
}
