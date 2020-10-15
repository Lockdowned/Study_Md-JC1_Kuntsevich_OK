package HomeWork3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {

        /*
        проверка того как понимаю принимать обьект класса
        скорее всего неправильно понял задачу
         */
        CalculatorWithCounter calc = new CalculatorWithCounter("MathExtends");
        calc.CalculatorWithMathExtends.multiply(15,7); // 15 * 7
        calc.CalculatorWithMathExtends.division(28,5);  // 28 / 5
        calc.CalculatorWithMathExtends.exponentiation(calc.CalculatorWithMathExtends.divEnd,2);  // (28 /  5) ^ 2
        calc.CalculatorWithMathExtends.addition(4.1,calc.CalculatorWithMathExtends.multipEnd); // 4.1 + (15 * 7)
        calc.CalculatorWithMathExtends.addition(calc.CalculatorWithMathExtends.sumEnd, calc.CalculatorWithMathExtends.exponentEnd); // (4.1 + (15 * 7)) + ((28 /  5) ^ 2)
        System.out.println(calc.CalculatorWithMathExtends.sumEnd);









    }
}
