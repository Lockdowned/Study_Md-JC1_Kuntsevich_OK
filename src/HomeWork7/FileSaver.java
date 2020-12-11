package HomeWork7;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileSaver {

    public FileSaver(){
    }

    public void toWrite(String text){
        System.out.println("Write the absolute path to the file, if it is not the" +
                " correct file will be saved next to the program.");

        Scanner scanner = new Scanner(System.in);
        String textWay = scanner.next();
        System.out.println(textWay);


        FileWriter fileWriter;
        try {
            if (wayExist(textWay)){
                fileWriter = new FileWriter(textWay);
                System.out.println("The text is saved to the specified path");
            }else {
                Path classLocation = Paths.get(FileSaver.class.getResource("").toURI());
                String localWay = classLocation.toString();
                File nearbyFile = new File(localWay, "LocalCourse.txt");
                nearbyFile.createNewFile();
                fileWriter = new FileWriter(localWay + "\\LocalCourse.txt");
                System.out.println("The text is saved nearby to the program");
            }
            fileWriter.write(text);
            fileWriter.flush();

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

    }

    private boolean wayExist(String textWay){
        Path path = Paths.get(textWay);
        if (Files.exists(path)){
            int checkInt = textWay.indexOf(".");
            if (checkInt == -1) return false;
            String check = textWay.substring(checkInt + 1);
            if (check.equals("txt")){
                return true;
            }
        }
        return false;
    }

}
