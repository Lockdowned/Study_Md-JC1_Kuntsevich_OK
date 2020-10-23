package HomeWork3;
/*
ЕЩЁ РАЗБИРАТЬСЯ С ДЕКОРАТОРАМИ
 */
public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        System.out.println("Ответ: " + calc.addition(calc.addition(4.1,calc.multiply(15,7)),
                calc.exponentiation(calc.division(28,5),2))); // (4.1 + (15 * 7)) + ((28 /  5) ^ 2)

    }
}
