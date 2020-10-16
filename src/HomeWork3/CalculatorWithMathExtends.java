package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

    @Override
    public double exponentiation(double number, int rate){ // метод степени
        setExponentEnd(Math.pow(number, rate));
        return Math.pow(number, rate);
    }

    public double modulation(double number){ // метод модуля
        setModulEnd(Math.abs(number));
        return Math.abs(number);
    }

    public double rootOFnumber(double number, int rate){   // метод корня
        setRootEnd(Math.pow(number, 1.0 / rate));
        return Math.pow(number, 1.0 / rate);
    }

}
