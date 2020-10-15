package HomeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    @Override
    double exponentiation(double number, int rate){ // метод степени
        return this.exponentEnd = Math.pow(number, rate);
    }


    double modulation(double number){ // метод модуля
        return this.modulEnd = Math.abs(number);
    }



    double rootOFnumber(double number, int rate){   // метод корня
        return this.rootEnd = Math.pow(number, 1.0 / rate);
    }


}
