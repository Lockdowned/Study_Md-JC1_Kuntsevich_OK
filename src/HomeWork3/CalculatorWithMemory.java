package HomeWork3;

public class CalculatorWithMemory {
    private double divEnd;
    private double multipEnd;
    private double subtractEnd;
    private double sumEnd;
    private double exponentEnd;
    private double modulEnd;
    private double rootEnd;


    public double getDivEnd() {
        return divEnd;
    }

    public double getMultipEnd() {
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

    public double division(double dividend, double divider) { //метод деления
        divEnd = dividend / divider;
        return divEnd;
    }

    public double multiply(double multiplierFirst, double multiplierSecond){   //метод умножения
        multipEnd = multiplierFirst * multiplierSecond;
        return multipEnd;
    }


    public double subtraction(double minusFirst,double minusSecond){  //метод вычитания
        subtractEnd = minusFirst - minusSecond;
        return subtractEnd;
    }


    public double addition(double addFirst,double addSecond){ // метод сложения
        sumEnd = addFirst + addSecond;
        return sumEnd;
    }


    public double exponentiation(double number, int rate){ // метод степени
        return this.exponentEnd = Math.pow(number, rate);
    }


    public double modulation(double number){ // метод модуля
        return this.modulEnd = Math.abs(number);
    }



    public double rootOFnumber(double number, int rate){   // метод корня
        return this.rootEnd = Math.pow(number, 1.0 / rate);
    }

}
