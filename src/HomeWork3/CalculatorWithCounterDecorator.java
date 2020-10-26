package HomeWork3;

public class CalculatorWithCounterDecorator extends CalculatorDecorator{

    private long counter;

    CalculatorWithCounterDecorator(ICalculator data){
        super(data);
    }

    public long getCounter() {
        return this.counter;
    }

    @Override
    public double division(double dividend, double divider) {
        counter++;
        return super.division(dividend, divider);
    }

    @Override
    public double multiply(double multiplierFirst, double multiplierSecond) {
        counter++;
        return super.multiply(multiplierFirst, multiplierSecond);
    }

    @Override
    public double subtraction(double minusFirst, double minusSecond) {
        counter++;
        return super.subtraction(minusFirst, minusSecond);
    }

    @Override
    public double addition(double addFirst, double addSecond) {
        counter++;
        return super.addition(addFirst, addSecond);
    }

    @Override
    public double exponentiation(double number, int rate) {
        counter++;
        return super.exponentiation(number, rate);
    }

    @Override
    public double modulation(double number) {
        counter++;
        return super.modulation(number);
    }

    @Override
    public double rootOFnumber(double number, int rate) {
        counter++;
        return super.rootOFnumber(number, rate);
    }
}
