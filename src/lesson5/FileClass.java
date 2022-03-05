package lesson5;

import java.io.*;

public class FileClass {

    public static void main(String[] args) throws IOException {
        File fileCSV = new File("src/resources/test.csv");

        System.out.println(fileCSV.getName());
        System.out.println(fileCSV.exists());
        System.out.println(fileCSV.isDirectory());


        File directoryCSV = new File("src/resources");

        System.out.println(directoryCSV.getName());
        System.out.println(directoryCSV.exists());
        System.out.println(directoryCSV.isDirectory());

        for (String str: directoryCSV.list()){
            System.out.println("file name: " + str);
        }

        for (String str: directoryCSV.list((file,name)->{
            return name.contains("test");
        })
        ){
            System.out.println("file name: " + str);
        }



        FileInputStream fi = null;
        try {
            fi = new FileInputStream(fileCSV);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fi.close();
        }

    }
}
