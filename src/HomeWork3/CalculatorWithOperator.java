package HomeWork3;

public class CalculatorWithOperator implements ICalculator {
    private double divEnd;
    private double multipEnd;
    private double subtractEnd;
    private double sumEnd;
    private double exponentEnd;
    private double modulEnd;
    private double rootEnd;

    public void setExponentEnd(double exponentEnd) {
        this.exponentEnd = exponentEnd;
    }

    public void setModulEnd(double modulEnd) {
        this.modulEnd = modulEnd;
    }

    public void setRootEnd(double rootEnd) {
        this.rootEnd = rootEnd;
    }

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
        double exp = number;
        if (rate == 0) exp = 1;
        else if (rate == 1) exp = number;
        else{
            for (int i = 2; i <= rate ; i++) {
                exp *= number;
            }
        }
        return this.exponentEnd = exp;
    }


    public double modulation(double number){ // метод модуля
        double mod;
        if (number < 0){
            mod = -number;
        }else {
            mod = number;
        }
        return this.modulEnd = mod;
    }


    public double rootOFnumber(double number, int rate){   // метод корня
        return this.rootEnd = Math.pow(number, 1.0 / rate);
    }

}

