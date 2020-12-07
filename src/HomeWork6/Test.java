package HomeWork6;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;


public class Test {
    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();

        String absolutePath = "";

        try {
            URL res = Test.class.getClassLoader().getResource("Война и мир_книга.txt");
            File file = Paths.get(res.toURI()).toFile();
            absolutePath = file.getAbsolutePath();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


        String word1 = "война";
        String word2 = "и";
        String word3 = "мир";

        FileReader war = new FileReader(absolutePath);
        BufferedReader buff = new BufferedReader(war);

        StringBuilder textBuilder = new StringBuilder();

        String reset;

        while((reset = buff.readLine()) != null){
            if (!reset.contains(" ")){
                textBuilder.append(" ");
            }
            textBuilder.append(reset);
        }

        String text = textBuilder.toString();

        try {
            ISearchEngine testIndexOf = new EasySearch();
            ISearchEngine testMatcher = new RegExSearch();
            System.out.println("Поиск используя indexOf:");
            System.out.println(word1 + " - " + testIndexOf.search(text, word1) + " раз.");
            System.out.println(word2 + "(как союз) - " + testIndexOf.search(text, word2) + " раз.");
            System.out.println(word3 + " - " + testIndexOf.search(text, word3) + " раз.");

            System.out.println("\nПоиск используя Matcher:");
            System.out.println(word1 + " - " + testMatcher.search(text, word1) + " раз.");
            System.out.println(word2 + "(как союз) - " + testMatcher.search(text, word2) + " раз.");
            System.out.println(word3 + " - " + testMatcher.search(text, word3) + " раз.");


        }catch (NullPointerException e){
        System.out.println("Файл не найден");

        }catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }

        System.out.println("Время выполнения: " + (System.currentTimeMillis() - startTime));
    }
}
