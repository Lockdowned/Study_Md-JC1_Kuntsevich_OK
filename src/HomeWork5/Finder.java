package HomeWork5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Finder {
    public static void main(String[] args) {
        try {
            FileReader war = new FileReader("Война и мир_книга.txt");
            BufferedReader buff = new BufferedReader(war);


            Set<String> unique = new HashSet<>();
            List<String> all = new ArrayList<>();
            String[] words;
            String line;
            while ((line = buff.readLine()) != null){
                words = line.split("([\\x0D-\\x26\\x28-\\x2C\\x2E-\\x40\\x5B-\\x60\\x7B-\\x7E]+|'[']+|-[-]+)");
                for (String word:words) {
                    if (!word.equals("")){
                        all.add(word);
                        unique.add(word);
                    }
                }
            }

            String[] uniqueWords = new String[unique.size()];
            String[] allWords = new String[all.size()];
            int i = 0;

            for (String a:unique) {
                uniqueWords[i++] = a;
            }
            i = 0;
            for (String a:all) {
                allWords[i++] = a;
            }

            Map<String, Integer> sortedMap = new HashMap<>();
            int count = 0;
            int maxCount = 0;
            for (String a:uniqueWords) {
                for (String b:allWords) {
                    if (a.equals(b)){
                        count++;
                    }
                }
                if (count != 0){
                    sortedMap.put(a, count);
                    if (count > maxCount){
                        maxCount = count;
                    }
                }
                count = 0;
            }

            Set<Map.Entry<String, Integer>> entryMap = sortedMap.entrySet();

            System.out.println("Top 10 repeat words: ");
            for (int j = maxCount; j >= 0; j--) {
                if (sortedMap.containsValue(j)){
                    Object match = j;
                    for (Map.Entry<String, Integer> repeat: entryMap) {
                        if (match.equals(repeat.getValue())){
                            System.out.print(repeat.getKey() + " - " + j + " раз");
                            count++;
                            if (count == 10)break;
                            System.out.print(", ");
                        }
                    }
                }
                if (count == 10){
                    System.out.print(".");
                    break;
                }
            }



        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
