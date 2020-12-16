package BlindPrint;

import java.io.*;
import java.util.*;

public class FileCheck {

    FileCheck(){
        filePathWithName = new HashMap<>();


        boolean noNeed = new File("resource\\HelperFolder").mkdirs();
        File simpleWay = new File("resource");
        wayLocalFile = simpleWay.getAbsolutePath();
        simpleWay = new File("resource\\HelperFolder");
        wayToAvoidSave = simpleWay.getAbsolutePath();

        File nearbyFile = new File(wayToAvoidSave, "Avoid.txt");
        try {
            nearbyFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        wayToAvoidFile = nearbyFile.getAbsolutePath();



    }

    private Map<String, String> filePathWithName;


    private String wayLocalFile;
    private String wayToAvoidSave;
    private String wayToAvoidFile;

    public void setWayLocalFile(String wayLocalFile) {
        this.wayLocalFile = wayLocalFile;
    }

    /**
    метод проверяет папку на наличии новых файлов, если новые есть предлагает сохранить
     * @return true если мы заполнили Map файлами для передачи
     */
    public boolean preCheck(){
        FileReader toBuf = null;
        try {
            toBuf = new FileReader(wayToAvoidFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(toBuf);
        String a;
        StringBuilder avoidText = new StringBuilder();
        while (true){
            try {
                if ((a = reader.readLine()) == null) break;
                avoidText.append(a).append("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File f1 = new File(wayLocalFile);
        File[] f2 = f1.listFiles();
        StringBuilder avoidTextToWrite = new StringBuilder();
        boolean result;
        for (File file :f2) {
            if (file.isFile()){
                if (!avoidText.toString().contains(file.getName())) {
                    result = file.getName().matches("(.*).txt");
                    if (result) {
                        addToPrepareSave(file);
                        avoidTextToWrite.append(file.getName()).append("\n");
                    }
                }
            }
        }
        avoidTextToWrite.append(avoidText);
        if (avoidText.compareTo(avoidTextToWrite) != 0){
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(wayToAvoidFile);
                fileWriter.write(avoidTextToWrite.toString());
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return filePathWithName.size() != 0;
    }

    private void addToPrepareSave(File filePath){
        System.out.println("Want to save texts from a file " + filePath.getName() + "? Write: Yes or No");
        Scanner in = new Scanner(System.in);
        String firstQuestion = in.next();
        if (firstQuestion.equalsIgnoreCase("yes")){
            System.out.println("Write a name for the texts in the file: " + filePath.getName() +
                    "(if you write NO, there will be a standard name).");
            String nameTag = in.next();
            if (!nameTag.equalsIgnoreCase("no")){
                filePathWithName.put(nameTag, filePath.toString());
            }else {
                filePathWithName.put(filePath.getName(), filePath.toString());
            }

        }
//        Set<String> set = new HashSet<>();
//        set = filePathWithName.keySet();
//        for (String key:set) {
//            System.out.println("Name: " + set);
//            System.out.println(filePathWithName.get(key));
//        }

    }

    public Map<String, String> getFilePathWithName() {
        return filePathWithName;
    }



}
