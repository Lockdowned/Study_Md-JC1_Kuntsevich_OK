package HomeWork6.Thread;

import HomeWork6.RegExSearch;

import java.util.concurrent.Callable;

public class CallableMethod implements Callable<Long> {

    String text;
    String word;
    RegExSearch searchMethod;

    CallableMethod(String text, String word){
        this.text = text;
        this.word = word;
        this.searchMethod = new RegExSearch();
    }

    @Override
    public Long call() throws Exception {
        return searchMethod.search(text, word);
    }
}
