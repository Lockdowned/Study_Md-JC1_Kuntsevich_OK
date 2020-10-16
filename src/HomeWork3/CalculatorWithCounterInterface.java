package HomeWork3;

public class CalculatorWithCounterInterface {

    private long counter;
    private ICalculator calculator1;
    private ICalculator calculator2;
    private ICalculator calculator3;

    CalculatorWithCounterInterface(ICalculator calc){
        this.calculator1 = calc;
    }


    double division(double dividend, double divider) { //метод деления
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.division(dividend, divider);
        }else if (this.calculator2 != null){
            return calculator2.division(dividend, divider);
        }else {
            return calculator3.division(dividend, divider);
        }

    }

    double multiply(int multiplierFirst, int multiplierSecond) {   //метод умножения
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.multiply(multiplierFirst, multiplierSecond);
        }else if (this.calculator2 != null){
            return calculator2.multiply(multiplierFirst, multiplierSecond);
        }else {
            return calculator3.multiply(multiplierFirst, multiplierSecond);
        }
    }

    double subtraction(double minusFirst,double minusSecond) {  //метод вычитания
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.subtraction(minusFirst, minusSecond);
        }else if (this.calculator2 != null){
            return calculator2.subtraction(minusFirst, minusSecond);
        }else {
            return calculator3.subtraction(minusFirst, minusSecond);
        }
    }

    double addition(double addFirst,double addSecond) { // метод сложения
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.addition(addFirst, addSecond);
        }else if (this.calculator2 != null){
            return calculator2.addition(addFirst, addSecond);
        }else {
            return calculator3.addition(addFirst, addSecond);
        }
    }

    double exponentiation(double number, int rate) { // метод степени
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.exponentiation(number, rate);
        }else if (this.calculator2 != null){
            return calculator2.exponentiation(number, rate);
        }else {
            return calculator3.exponentiation(number, rate);
        }
    }

    double modulation(double number) { // метод модуля
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.modulation(number);
        }else if (this.calculator2 != null){
            return calculator2.modulation(number);
        }else {
            return calculator3.modulation(number);
        }
    }

    double rootOFnumber(double number, int rate) {   // метод корня
        this.counter++;
        if (this.calculator1 != null) {
            return calculator1.rootOFnumber(number, rate);
        } else if (this.calculator2 != null) {
            return calculator2.rootOFnumber(number, rate);
        } else {
            return calculator3.rootOFnumber(number, rate);
        }
    }

    public long getCounter() {
        return this.counter;
    }

}
