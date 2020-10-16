package HomeWork3;

public class CalculatorWithMathCopy {
    private double divEnd;
    private int multipEnd;
    private double subtractEnd;
    private double sumEnd;
    private double exponentEnd;
    private double modulEnd;
    private double rootEnd;


    public double getDivEnd() {
        return divEnd;
    }

    public int getMultipEnd() {
        return multipEnd;
    }

    public double getSubtractEnd() {
        return subtractEnd;
    }

    public double getSumEnd() {
        return sumEnd;
    }

    public double getExponentEnd() {
        return exponentEnd;
    }

    public double getModulEnd() {
        return modulEnd;
    }

    public double getRootEnd() {
        return rootEnd;
    }

    double division(double dividend, double divider) { //метод деления
        divEnd = dividend / divider;
        return divEnd;
    }

    int multiply(int multiplierFirst, int multiplierSecond){   //метод умножения
        multipEnd = multiplierFirst * multiplierSecond;
        return multipEnd;
    }


    double subtraction(double minusFirst,double minusSecond){  //метод вычитания
        subtractEnd = minusFirst - minusSecond;
        return subtractEnd;
    }


    double addition(double addFirst,double addSecond){ // метод сложения
        sumEnd = addFirst + addSecond;
        return sumEnd;
    }


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
