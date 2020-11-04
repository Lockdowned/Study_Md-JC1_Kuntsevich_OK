package HomeWork3;

public class CalculatorWithMemory{
    private final ICalculator calculator;
    private double lastNumberChanged;
    private double saveNumber;

    CalculatorWithMemory(ICalculator calc){
        this.calculator = calc;
    }

    public double saveLastNumber(){
        this.saveNumber = this.lastNumberChanged;
        return this.saveNumber;
    }

    public double getSaveNumber() {
        double cash = this.saveNumber;
        this.saveNumber = 0.0;
        return cash;
    }

    public double division(double dividend, double divider) { //метод деления
        this.lastNumberChanged = calculator.division(dividend, divider);
        return this.lastNumberChanged;
    }

    public double multiply(double multiplierFirst, double multiplierSecond) {   //метод умножения
        this.lastNumberChanged = calculator.multiply(multiplierFirst, multiplierSecond);
        return this.lastNumberChanged;
    }

    public double subtraction(double minusFirst,double minusSecond) {  //метод вычитания
        this.lastNumberChanged = calculator.subtraction(minusFirst, minusSecond);
        return this.lastNumberChanged;
    }

    public double addition(double addFirst,double addSecond) { // метод сложения
        this.lastNumberChanged = calculator.addition(addFirst, addSecond);
        return this.lastNumberChanged;
    }

    public double exponentiation(double number, int rate) { // метод степени
        this.lastNumberChanged = calculator.exponentiation(number, rate);
        return this.lastNumberChanged;
    }

    public double modulation(double number) { // метод модуля
        this.lastNumberChanged = calculator.modulation(number);
        return this.lastNumberChanged;
    }

    public double rootOFnumber(double number, int rate) {   // метод корня
        this.lastNumberChanged = calculator.rootOFnumber(number, rate);
        return this.lastNumberChanged;
    }

}
