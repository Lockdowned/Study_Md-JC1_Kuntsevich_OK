package HomeWork6;
/*
Находит немного больше чем необходимо, но главное суть.
 */

public class VerificationCounter {
    public boolean independentWord(String line,String word,int resetCount){
        if (resetCount == -1) return false;
        return checkChar(line, word ,resetCount);
    }

    private boolean checkChar(String line,String word,int resetCount){
        boolean before = false;
        boolean after = false;
        int leftChar = 0;
        int rightChar = 0;
        if ((resetCount - 1) < 0){
            before = true;
        }else leftChar = (int)line.charAt(resetCount - 1);
        if ((resetCount + word.length()) >= line.length()){
            after = true;
        }else rightChar = (int)line.charAt(resetCount + word.length());
        if (before || (leftChar >= 32 && leftChar <= 47) || (leftChar >= 58 && leftChar <= 64) ||
                (leftChar >= 91 && leftChar <= 96) || (leftChar >= 123 && leftChar <= 126)) before = true;
        if (before){
            return (after || (rightChar >= 32 && rightChar <= 47) || (rightChar >= 58 && rightChar <= 64) ||
                    (rightChar >= 91 && rightChar <= 96) || (rightChar >= 123 && rightChar <= 126));
        }
        return false;
    }
}
