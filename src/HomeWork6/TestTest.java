//package HomeWork6;
//
//import java.io.*;
//import java.net.URISyntaxException;
//import java.net.URL;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestTest {
//    public static void main(String[] args) throws IOException {
//        String absolutePath = "";
//
//        try {
//            URL res = TestTest.class.getClassLoader().getResource("Война и мир_книга.txt");
//            File file = Paths.get(res.toURI()).toFile();
//            absolutePath = file.getAbsolutePath();
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
//
//        FileReader war = new FileReader(absolutePath);
//        BufferedReader buff = new BufferedReader(war);
//
//        String text = "";
//        List<String> arrText = new ArrayList<>();
//
//
//        for (int i = 0; i < 30; i++) {
//            arrText.add(buff.readLine());
//        }
//        for (String geg:arrText){
//            text = text + geg;
//        }
//        System.out.println(text);
//
//
//
//
//    }
//}
