package HomeWork5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
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

        int counter = 0;
        String line;

        word = word.toUpperCase();
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        while ((line = buff.readLine()) != null){
            line = line.toUpperCase();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                counter++;
            }
        }
        return counter;
    }
}
