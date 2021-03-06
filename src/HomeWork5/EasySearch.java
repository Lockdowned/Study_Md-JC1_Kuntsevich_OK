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
        /*
        Как можно получить универсальный путь по другому?
         */
        URL res = getClass().getClassLoader().getResource(text);
        File file = Paths.get(res.toURI()).toFile();
        String absolutePath = file.getAbsolutePath();


        FileReader war = new FileReader(absolutePath);
        BufferedReader buff = new BufferedReader(war);
        VerificationCounter check = new VerificationCounter();
        String line;
        int resetCount;
        int counter = 0;
        int plusCounter = 0;
        word = word.toUpperCase();
        while ((line = buff.readLine()) != null){
            line = line.toUpperCase();
            resetCount = -1;
            do {if (resetCount == -1){
                resetCount = line.indexOf(word);
            }else {
                resetCount = line.indexOf(word, resetCount + word.length());
            }
            if (check.independentWord(line, word, resetCount)){
               plusCounter++;
            }
            }while (resetCount != -1);
            counter += plusCounter;
            plusCounter = 0;
        }
        return counter;
    }
}
