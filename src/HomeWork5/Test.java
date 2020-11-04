package HomeWork5;
/*
ЕЩЁ НЕ РЕШЕНА ЗАДАЧА ПО ПОИСКУ САМОСТОЯТЕЛЬНЫХ СЛОВ
 */

import java.io.IOException;
import java.net.URISyntaxException;

public class Test {
    public static void main(String[] args){
        try {
            ISearchEngine test = new EasySearch();
            System.out.println("война - " + test.search("Война и мир_книга.txt", "война") + " раз.");
            System.out.println("и(как союз) - " + test.search("Война и мир_книга.txt", "и") + " раз.");
            System.out.println("мир - " + test.search("Война и мир_книга.txt", "мир") + " раз.");

        }catch (NullPointerException e){
        System.out.println("Файл не найден");

        }catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }

    }
}
