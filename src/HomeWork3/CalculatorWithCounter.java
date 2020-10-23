package HomeWork3;

public class CalculatorWithCounter {
    private long counter;
    private CalculatorWithOperator calculator1; //писать final чтобы никто не влез с сетерами
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;



    CalculatorWithCounter(CalculatorWithOperator calc){
        this.calculator1 = calc;
    }

    CalculatorWithCounter(CalculatorWithMathCopy calc){
        this.calculator2 = calc;
    }

    CalculatorWithCounter(CalculatorWithMathExtends calc){
        this.calculator3 = calc;
    }


    public double division(double dividend, double divider) { //метод деления
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.division(dividend, divider);
        }else if (this.calculator2 != null){
            return calculator2.division(dividend, divider);
        }else {
            return calculator3.division(dividend, divider);
        }

    }

    public double multiply(double multiplierFirst, double multiplierSecond) {   //метод умножения
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.multiply(multiplierFirst, multiplierSecond);
        }else if (this.calculator2 != null){
            return calculator2.multiply(multiplierFirst, multiplierSecond);
        }else {
            return calculator3.multiply(multiplierFirst, multiplierSecond);
        }
    }

    public double subtraction(double minusFirst,double minusSecond) {  //метод вычитания
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.subtraction(minusFirst, minusSecond);
        }else if (this.calculator2 != null){
            return calculator2.subtraction(minusFirst, minusSecond);
        }else {
            return calculator3.subtraction(minusFirst, minusSecond);
        }
    }

    public double addition(double addFirst,double addSecond) { // метод сложения
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.addition(addFirst, addSecond);
        }else if (this.calculator2 != null){
            return calculator2.addition(addFirst, addSecond);
        }else {
            return calculator3.addition(addFirst, addSecond);
        }
    }

    public double exponentiation(double number, int rate) { // метод степени
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.exponentiation(number, rate);
        }else if (this.calculator2 != null){
            return calculator2.exponentiation(number, rate);
        }else {
            return calculator3.exponentiation(number, rate);
        }
    }

    public double modulation(double number) { // метод модуля
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.modulation(number);
        }else if (this.calculator2 != null){
            return calculator2.modulation(number);
        }else {
            return calculator3.modulation(number);
        }
    }

    public double rootOFnumber(double number, int rate) {   // метод корня
        this.counter++;
        if (this.calculator1 != null){
            return calculator1.rootOFnumber(number, rate);
        }else if (this.calculator2 != null){
            return calculator2.rootOFnumber(number, rate);
        }else {
            return calculator3.rootOFnumber(number, rate);
        }
    }

    public long getCounter() {
         return this.counter;
    }


    /*
    НАРУШЕНИЕ УСЛОВИЯ ЧТОБЫ В MAIN НЕ БЫЛО СТРАШНО
     */

    public double getDivEnd() {
        if (this.calculator1 != null){
            return calculator1.getDivEnd();
        }else if (this.calculator2 != null){
            return calculator2.getDivEnd();
        }else {
            return calculator3.getDivEnd();
        }

    }

    public double getMultipEnd() {
        if (this.calculator1 != null){
            return calculator1.getMultipEnd();
        }else if (this.calculator2 != null){
            return calculator2.getMultipEnd();
        }else {
            return calculator3.getMultipEnd();
        }

    }

    public double getSubtractEnd() {
        if (this.calculator1 != null){
            return calculator1.getSubtractEnd();
        }else if (this.calculator2 != null){
            return calculator2.getSubtractEnd();
        }else {
            return calculator3.getSubtractEnd();
        }
    }

    public double getSumEnd() {
        if (this.calculator1 != null){
            return calculator1.getSumEnd();
        }else if (this.calculator2 != null){
            return calculator2.getSumEnd();
        }else {
            return calculator3.getSumEnd();
        }
    }

    public double getExponentEnd() {
        if (this.calculator1 != null){
            return calculator1.getExponentEnd();
        }else if (this.calculator2 != null){
            return calculator2.getExponentEnd();
        }else {
            return calculator3.getExponentEnd();
        }
    }

    public double getModulEnd() {
        if (this.calculator1 != null){
            return calculator1.getModulEnd();
        }else if (this.calculator2 != null){
            return calculator2.getModulEnd();
        }else {
            return calculator3.getModulEnd();
        }
    }

    public double getRootEnd() {
        if (this.calculator1 != null){
            return calculator1.getRootEnd();
        }else if (this.calculator2 != null){
            return calculator2.getRootEnd();
        }else {
            return calculator3.getRootEnd();
        }
    }

}
