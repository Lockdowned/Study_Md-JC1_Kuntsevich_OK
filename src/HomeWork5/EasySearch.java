package HomeWork5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) throws IOException, URISyntaxException {
        URL res = getClass().getClassLoader().getResource(text);
        File file = Paths.get(res.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();
        FileReader war = new FileReader(absolutePath);
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
