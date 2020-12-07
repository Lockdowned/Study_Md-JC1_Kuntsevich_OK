package HomeWork6;


public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word){

        VerificationCounter check = new VerificationCounter();
        int counterIndexOf = -1;
        int counter = 0;
        word = word.toUpperCase();
        text = text.toUpperCase();
        do{
            if (counterIndexOf == -1){
                counterIndexOf = text.indexOf(word);
            }else {
                counterIndexOf = text.indexOf(word, counterIndexOf + word.length());
            }
            if (check.independentWord(text, word, counterIndexOf)){
                counter++;
            }
        }while(counterIndexOf != -1);
        return counter;
    }
}
