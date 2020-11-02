package HomeWork5;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finder {
    public static void main(String[] args) {
        try {

            FileReader war = new FileReader(  "class" + File.separator + "HomeWork" + File.separator +
                    "src" + File.separator + "HomeWork5" + File.separator + "Война и мир_книга.txt");
            BufferedReader buff = new BufferedReader(war);


            Set<String> unique = new TreeSet<>();
            List<String> all = new ArrayList<>();
            String[] words;
            String line;
            Pattern pattern = Pattern.compile("[\\wА-Яа-я]+");
            Matcher match;
            while ((line = buff.readLine()) != null){
                words = line.split("[\\x0D-\\x40\\x5B-\\x60\\x7B-\\x7E]+");
                for (String word:words) {
                    match = pattern.matcher(word);
                    if (match.matches()){
                        all.add(word);
                        unique.add(word);
                    }
                }
            }

            String[] uniqueWords = new String[unique.size()];
            String[] allWords = new String[all.size()];
            int i = 0;

            for (String a:unique) {
                uniqueWords[i] = a;
                i++;
            }
            i = 0;
            for (String a:all) {
                allWords[i] = a;
                i++;
            }

            Map<Integer, String> sortedMap = new HashMap<>();
            int count = 0;
            for (String a:uniqueWords) {
                for (String b:allWords) {
                    if (a.equals(b)){
                        count++;
                    }
                }
                if (count != 0){
                    sortedMap.put(count, a);
                }
                count = 0;
            }


            System.out.println(sortedMap.size());

            count = 0;
            System.out.println("Top 10 repeat words: \n");
            for (int j = 100_000_000; j > 0; j--) {
                if (sortedMap.get(j) != null){
                    System.out.print(sortedMap.get(j) + " - " + j + " раз");
                    count++;
                    if (count == 10)break;
                    System.out.print(", ");
                }

            }
            System.out.print(".");




        }catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("lel");
        }
    }

}
