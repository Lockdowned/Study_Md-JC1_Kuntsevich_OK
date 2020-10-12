package HomeWork3;

public class CalculatorWithMathCopy {
    double divEnd;
    int multipEnd;
    double subtractEnd;
    double sumEnd;


    double exponentEnd;
    double modulEnd;
    double rootEnd;






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



    double rootOFnumber(double number, int rate){   // метод корня ---можно написать собственное возведение в степень но это долго
        return this.rootEnd = Math.pow(number, 1.0 / rate);
    }
}
