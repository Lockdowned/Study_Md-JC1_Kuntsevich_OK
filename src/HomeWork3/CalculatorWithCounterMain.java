package HomeWork3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc = new CalculatorWithCounter(new CalculatorWithMathCopy());

        System.out.println("Ответ: " + calc.addition(calc.addition(4.1,calc.multiply(15,7)),
                calc.exponentiation(calc.division(28,5),2))); // (4.1 + (15 * 7)) + ((28 /  5) ^ 2)
        System.out.println("Использований калькулятора: " + calc.getCounter());
    }
}