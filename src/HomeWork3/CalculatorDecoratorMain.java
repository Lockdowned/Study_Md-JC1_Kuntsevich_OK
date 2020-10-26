package HomeWork3;
/*
Как правильно Вывести количество использований калькулятора. Вывести последнее сохранённое значение в памяти.?
То есть как коректно вызывать методы подсчёта использований калькулятора и последнее сохранённое число.
 */
public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        System.out.println("Ответ: " + calc.addition(calc.addition(4.1,calc.multiply(15,7)),
                calc.exponentiation(calc.division(28,5),2))); // (4.1 + (15 * 7)) + ((28 /  5) ^ 2)

        CalculatorWithCounterDecorator counterDecorator = (CalculatorWithCounterDecorator) calc;
        System.out.println("Количество использований калькулятора: " +
                ((CalculatorWithCounterDecorator) calc).getCounter());

        CalculatorWithMemoryDecorator memoryDecorator = (CalculatorWithMemoryDecorator) counterDecorator.getCalculator();
        memoryDecorator.saveLastNumber();
        System.out.println("Последнее сохранённое число:" + memoryDecorator.getSaveNumber());
    }
}
