package HomeWork5;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;


public class Finder {
    public static void main(String[] args) {
        try {
            URL res = Finder.class.getClassLoader().getResource("Война и мир_книга.txt");
            File file = Paths.get(res.toURI()).toFile();
            String absolutePath = file.getAbsolutePath();
            FileReader war = new FileReader(absolutePath);
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

            Map<String, Integer> sortedMap = new HashMap<>();
            int count = 0;
            int maxCount = 0;
            for (String a:unique) {
                for (String b:all) {
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
            count = 0;

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

        }catch (URISyntaxException | FileNotFoundException e) {
            System.out.println("Файл не найден");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
