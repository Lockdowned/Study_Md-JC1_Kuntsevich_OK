package HomeWork3;

import java.util.Objects;

public class CalculatorWithCounter {
    CalculatorWithOperator CalculatorWithOperator;
    CalculatorWithMathCopy CalculatorWithMathCopy;
    CalculatorWithMathExtends CalculatorWithMathExtends;

    CalculatorWithCounter(String with){
        if (with == "Operator"){
            this.CalculatorWithOperator = new CalculatorWithOperator();
        }else if (with == "MathCopy"){
            this.CalculatorWithMathCopy = new CalculatorWithMathCopy();
        }else if (with == "MathExtends"){
            this.CalculatorWithMathExtends = new CalculatorWithMathExtends();
        }else {
            System.out.println("plz print: Operator or MathCopy or MathExtends");
        }
    }



//    long count;
//
//
//
//    public long getCountOperation(){
//        return count;
//    }

}


