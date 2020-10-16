package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    double exponentiation(double number, int rate){ // метод степени
        setExponentEnd(Math.pow(number, rate));
        return 0;
    }

    double modulation(double number){ // метод модуля
        setModulEnd(Math.abs(number));
        return 0;
    }

    double rootOFnumber(double number, int rate){   // метод корня
        setRootEnd(Math.pow(number, 1.0 / rate));
        return 0;
    }


}
