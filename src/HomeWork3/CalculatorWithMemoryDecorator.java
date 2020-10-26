package HomeWork3;

public class CalculatorWithMemoryDecorator extends CalculatorDecorator{

    private double saveNumber;
    private double lastNumberChanged;

    CalculatorWithMemoryDecorator(ICalculator data){
        super(data);
    }

    public double getSaveNumber() {
        double cash = this.saveNumber;
        this.saveNumber = 0.0;
        return cash;
    }

    public double saveLastNumber(){
        this.saveNumber = this.lastNumberChanged;
        return this.saveNumber;
    }

    @Override
    public double division(double dividend, double divider) {
        double result = super.division(dividend, divider);
        lastNumberChanged = result;
        return result;
    }

    @Override
    public double multiply(double multiplierFirst, double multiplierSecond) {
        double result = super.multiply(multiplierFirst, multiplierSecond);
        lastNumberChanged = result;
        return result;
    }

    @Override
    public double subtraction(double minusFirst, double minusSecond) {
        double result = super.subtraction(minusFirst, minusSecond);
        lastNumberChanged = result;
        return result;
    }

    @Override
    public double addition(double addFirst, double addSecond) {
        double result = super.addition(addFirst, addSecond);
        lastNumberChanged = result;
        return result;
    }

    @Override
    public double exponentiation(double number, int rate) {
        double result = super.exponentiation(number, rate);
        lastNumberChanged = result;
        return result;
    }

    @Override
    public double modulation(double number) {
        double result = super.modulation(number);
        lastNumberChanged = result;
        return result;
    }

    @Override
    public double rootOFnumber(double number, int rate) {
        double result = super.rootOFnumber(number, rate);
        lastNumberChanged = result;
        return result;
    }
}
