package HomeWork5;

import java.io.IOException;
import java.net.URISyntaxException;

public class Test {
    public static void main(String[] args){
        String nameTxt = "Война и мир_книга.txt";
        String word1 = "война";
        String word2 = "и";
        String word3 = "мир";
        try {
            ISearchEngine testIndexOf = new EasySearch();
            ISearchEngine testMatcher = new RegExSearch();
            System.out.println("Поиск используя indexOf:");
            System.out.println(word1 + " - " + testIndexOf.search(nameTxt, word1) + " раз.");
            System.out.println(word2 + "(как союз) - " + testIndexOf.search(nameTxt, word2) + " раз.");
            System.out.println(word3 + " - " + testIndexOf.search(nameTxt, word3) + " раз.");

            System.out.println("\nПоиск используя Matcher:");
            System.out.println(word1 + " - " + testMatcher.search(nameTxt, word1) + " раз.");
            System.out.println(word2 + "(как союз) - " + testMatcher.search(nameTxt, word2) + " раз.");
            System.out.println(word3 + " - " + testMatcher.search(nameTxt, word3) + " раз.");


        }catch (NullPointerException e){
        System.out.println("Файл не найден");

        }catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }

    }
}
