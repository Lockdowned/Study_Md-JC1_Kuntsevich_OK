package HomeWork3;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calcul2 = new CalculatorWithCounter(new CalculatorWithMathCopy());
        
        calcul2.multiply(15,7); // 15 * 7
        calcul2.division(28,5);  // 28 / 5
        calcul2.exponentiation(calcul2.getDivEnd(),2);  // (28 /  5) ^ 2
        calcul2.addition(4.1,calcul2.getMultipEnd()); // 4.1 + (15 * 7)
        calcul2.addition(calcul2.getSumEnd(), calcul2.getExponentEnd()); // (4.1 + (15 * 7)) + ((28 /  5) ^ 2)
        System.out.println("Ответ: " +calcul2.getSumEnd());
        System.out.println("Использований калькулятора: " + calcul2.getCounter());
    }
}