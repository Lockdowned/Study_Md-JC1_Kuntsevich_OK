package HomeWork3;

public class CalculatorWithOperator {
    private double divEnd;
    private int multipEnd;
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


    double modulation(double number){ // метод модуля
        double mod;
        if (number < 0){
            mod = -number;
        }else {
            mod = number;
        }
        return this.modulEnd = mod;
    }



    double rootOFnumber(double number, int rate){   // метод корня
        return this.rootEnd = Math.pow(number, 1.0 / rate);
    }

}

