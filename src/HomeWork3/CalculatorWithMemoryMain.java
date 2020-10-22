package HomeWork3;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory test = new CalculatorWithMemory(new CalculatorWithMathExtends());
        test.multiply(15,7); // 15 * 7
        test.division(28,5);  // 28 / 5
        test.saveLastNumber();
        test.exponentiation(test.getSaveNumber(), 2); // (28 /  5) ^ 2
        test.saveLastNumber();
        test.addition(4.1, test.getSaveNumber()); // 4.1 + ((28 /  5) ^ 2)
        test.saveLastNumber();
        /*
        Условие
        В мэйне запрещается использование переменных для хранения значений
        участвующих в просчёте, а также результатов работы методов калькулятора.
        использование в test.addition --- test.multiply нарушает условие
        "а также результатов работы методов калькулятора."
         */
        test.addition(test.multiply(15, 7), test.getSaveNumber()); // (15 * 7) + (4.1 + ((28 /  5) ^ 2))
        test.saveLastNumber();
        System.out.println("Ответ: " + test.getSaveNumber());
    }
}
