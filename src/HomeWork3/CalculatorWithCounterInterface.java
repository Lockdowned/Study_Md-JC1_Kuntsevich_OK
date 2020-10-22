package HomeWork3;

public class CalculatorWithCounterInterface {

    private long counter;
    private ICalculator calculator;

    CalculatorWithCounterInterface(ICalculator calc){ //можно многое убрать
        this.calculator = calc;
    }


    double division(double dividend, double divider) { //метод деления
        this.counter++;
        return calculator.division(dividend, divider);
    }

    double multiply(double multiplierFirst, double multiplierSecond) {   //метод умножения
        this.counter++;
        return calculator.multiply(multiplierFirst, multiplierSecond);
    }

    double subtraction(double minusFirst,double minusSecond) {  //метод вычитания
        this.counter++;
        return calculator.subtraction(minusFirst, minusSecond);
    }

    double addition(double addFirst,double addSecond) { // метод сложения
        this.counter++;
        return calculator.addition(addFirst, addSecond);
    }

    double exponentiation(double number, int rate) { // метод степени
        this.counter++;
        return calculator.exponentiation(number, rate);
    }

    double modulation(double number) { // метод модуля
        this.counter++;
        return calculator.modulation(number);
    }

    double rootOFnumber(double number, int rate) {   // метод корня
        this.counter++;
        return calculator.rootOFnumber(number, rate);
    }

    public long getCounter() {
        return this.counter;
    }

}
