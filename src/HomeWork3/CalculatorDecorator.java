package HomeWork3;

public class CalculatorDecorator implements ICalculator{

    private ICalculator constINconst;
    CalculatorDecorator(ICalculator next){
        constINconst = next;
    }

    public ICalculator getCalculator(){
        return constINconst;
    }

    @Override
    public double division(double dividend, double divider) {
        return constINconst.division(dividend, divider);
    }

    @Override
    public double multiply(double multiplierFirst, double multiplierSecond) {
        return constINconst.multiply(multiplierFirst, multiplierSecond);
    }

    @Override
    public double subtraction(double minusFirst, double minusSecond) {
        return constINconst.subtraction(minusFirst, minusSecond);
    }

    @Override
    public double addition(double addFirst, double addSecond) {
        return constINconst.addition(addFirst, addSecond);
    }

    @Override
    public double exponentiation(double number, int rate) {
        return constINconst.exponentiation(number, rate);
    }

    @Override
    public double modulation(double number) {
        return constINconst.modulation(number);
    }

    @Override
    public double rootOFnumber(double number, int rate) {
        return constINconst.rootOFnumber(number, rate);
    }
}

