package HomeWork5;
/*
ЕЩЁ НЕ РЕШЕНА ЗАДАЧА ПО ПОИСКУ САМОСТОЯТЕЛЬНЫХ СЛОВ
 */

import java.io.IOException;

public class Test {
    public static void main(String[] args){
        try {
            ISearchEngine test = new EasySearch();
            System.out.println("война - " + test.search("Война и мир_книга.txt", "война") + " раз.");
            System.out.println("и(как союз) - " + test.search("Война и мир_книга.txt", "и") + " раз.");
            System.out.println("мир - " + test.search("Война и мир_книга.txt", "мир") + " раз.");



            System.out.println(test.search("Война и мир_книга.txt", "и"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
