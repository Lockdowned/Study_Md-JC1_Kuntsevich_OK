package HomeWork3;

public class CalculatorWithOperator {

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
        if (number > 0){
            mod = number;
        }else if (number < 0){
            mod = -number;
        }else mod = number;
        return this.modulEnd = mod;
    }



    double rootOFnumber(double number, int rate){   // метод корня ---можно написать собственное возведение в степень но это долго
        return this.rootEnd = Math.pow(number, 1.0 / rate);
    }

}

