package HomeWork6.Thread;

import HomeWork6.RegExSearch;
import HomeWork6.Test;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultithreadingMain {
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
        List<String> arrString = new ArrayList<>();

        String resetString;

        while((resetString = buff.readLine()) != null){
            arrString.add(resetString);
        }

        int sizeArrString = arrString.size();
        int sizeHelper = sizeArrString / 4;

/*
куски текста
 */
        String text1;
        String text2;
        String text3;
        String text4;

        for (int i = 0; i < sizeHelper; i++) {
            if ((resetString = arrString.get(i)).contains(" ")){
                textBuilder.append(" ");
            }
            textBuilder.append(arrString.get(i));
        }
        text1 = textBuilder.toString();
        textBuilder.delete(0, textBuilder.length());


        for (int i = sizeHelper; i < sizeHelper * 2; i++) {
            if ((resetString = arrString.get(i)).contains(" ")){
                textBuilder.append(" ");
            }
            textBuilder.append(arrString.get(i));
        }
        text2 = textBuilder.toString();
        textBuilder.delete(0, textBuilder.length());

        for (int i = sizeHelper * 2; i < sizeHelper * 3; i++) {
            if ((resetString = arrString.get(i)).contains(" ")){
                textBuilder.append(" ");
            }
            textBuilder.append(arrString.get(i));
        }
        text3 = textBuilder.toString();
        textBuilder.delete(0, textBuilder.length());

        for (int i = sizeHelper * 3; i < sizeArrString; i++) {
            if ((resetString = arrString.get(i)).contains(" ")){
                textBuilder.append(" ");
            }
            textBuilder.append(arrString.get(i));
        }
        text4 = textBuilder.toString();
        textBuilder.delete(0, textBuilder.length());

        /*
        Обычным классом
         */

        System.out.println("Callable через класс:");

        ExecutorService es = Executors.newFixedThreadPool(4);


        Callable<Long> callable;
        
        List<Future<Long>> list = new ArrayList<>();
        String text = null;

        for (int i = 1; i <= 4; i++) {
            switch (i){
                case 1: text = text1;
                break;
                case 2: text = text2;
                break;
                case 3: text = text3;
                break;
                case 4: text = text4;
                break;
            }
            callable = new CallableMethod(text, word1);
            Future<Long> future = es.submit(callable);
            list.add(future);
        }


        long endCount = 0;
        for (Future<Long> fff:list) {
            try {
                endCount += fff.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        list.clear();

        System.out.println(word1 + " - " + endCount + " раз.");

        for (int i = 1; i <= 4; i++) {
            switch (i){
                case 1: text = text1;
                    break;
                case 2: text = text2;
                    break;
                case 3: text = text3;
                    break;
                case 4: text = text4;
                    break;
            }
            callable = new CallableMethod(text, word2);
            Future<Long> future = es.submit(callable);
            list.add(future);
        }


        endCount = 0;
        for (Future<Long> fff:list) {
            try {
                endCount += fff.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        list.clear();

        System.out.println(word2 + " - " + endCount + " раз.");

        for (int i = 1; i <= 4; i++) {
            switch (i){
                case 1: text = text1;
                    break;
                case 2: text = text2;
                    break;
                case 3: text = text3;
                    break;
                case 4: text = text4;
                    break;
            }
            callable = new CallableMethod(text, word3);
            Future<Long> future = es.submit(callable);
            list.add(future);
        }


        endCount = 0;
        for (Future<Long> fff:list) {
            try {
                endCount += fff.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        list.clear();

        System.out.println(word3 + " - " + endCount + " раз.");

        /*
        Лямдой
         */
        System.out.println("Callable через лямбду:");

        Callable<Long> lambdaCallable;
        

        for (int i = 1; i <= 4; i++) {
            switch (i){
                case 1: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text1, word1);
                };
                    break;
                case 2: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text2, word1);
                };
                    break;
                case 3: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text3, word1);
                };
                    break;
                case 4: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text4, word1);
                };
                    break;
                default:
                    throw new IllegalStateException("Not initialized lambda");
            }

            Future<Long> future = es.submit(lambdaCallable);
            list.add(future);
        }


        /*
        Вопрос: Как понимаю так берет text4 изза того что они в "Future Queue"
         */
//        LambdaTrick lambdaTrick = new LambdaTrick();
//        lambdaCallable = () -> {
//            RegExSearch ser = new RegExSearch();
//            return ser.search(lambdaTrick.getInternalString(), word1);
//        };
//        lambdaTrick.setInternalString(text1);
//        Future<Long> futures = es.submit(lambdaCallable);
//        list.add(futures);
//        lambdaTrick.setInternalString(text2);
//        futures = es.submit(lambdaCallable);
//        list.add(futures);
//        lambdaTrick.setInternalString(text3);
//        futures = es.submit(lambdaCallable);
//        list.add(futures);
//        lambdaTrick.setInternalString(text4);
//        futures = es.submit(lambdaCallable);
//        list.add(futures);


        endCount = 0;
        for (Future<Long> fff:list) {
            try {
                endCount += fff.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        list.clear();

        System.out.println(word1 + " - " + endCount + " раз.");

        for (int i = 1; i <= 4; i++) {
            switch (i){
                case 1: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text1, word2);
                };
                    break;
                case 2: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text2, word2);
                };
                    break;
                case 3: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text3, word2);
                };
                    break;
                case 4: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text4, word2);
                };
                    break;
                default:
                    throw new IllegalStateException("Not initialized lambda");
            }

            Future<Long> future = es.submit(lambdaCallable);
            list.add(future);
        }

        endCount = 0;
        for (Future<Long> fff:list) {
            try {
                endCount += fff.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        list.clear();

        System.out.println(word2 + " - " + endCount + " раз.");

        for (int i = 1; i <= 4; i++) {
            switch (i){
                case 1: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text1, word3);
                };
                    break;
                case 2: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text2, word3);
                };
                    break;
                case 3: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text3, word3);
                };
                    break;
                case 4: lambdaCallable = () -> {
                    RegExSearch ser = new RegExSearch();
                    return ser.search(text4, word3);
                };
                    break;
                default:
                    throw new IllegalStateException("Not initialized lambda");
            }

            Future<Long> future = es.submit(lambdaCallable);
            list.add(future);
        }

        endCount = 0;
        for (Future<Long> fff:list) {
            try {
                endCount += fff.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        list.clear();

        System.out.println(word3 + " - " + endCount + " раз.");

        es.shutdown();

        System.out.println("Время выполнения: " + (System.currentTimeMillis() - startTime));
    }
}
