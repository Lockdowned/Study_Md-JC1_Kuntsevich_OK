package HomeWork5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) throws IOException {
        FileReader war = new FileReader(text);
        BufferedReader buff = new BufferedReader(war);
        String line;
        int resetCount;
        int counter = 0;
        int plusCounter = 0;
        word = word.toUpperCase();
        while ((line = buff.readLine()) != null){
            line = line.toUpperCase();
            resetCount = line.indexOf(word);
            if (resetCount != -1){
                while (resetCount != -1){
                    plusCounter++;
                    resetCount = line.indexOf(word, resetCount + 1);
                }
            }
            counter += plusCounter;
            plusCounter = 0;

        }
        return counter;
    }



}
