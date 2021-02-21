package org.example.homework3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileApp {
    private static int count;
    private static List<File> fileList = new ArrayList<>();

    private static void getCatalogAndFileInfo(String fileName) {
        count++;
        File file = new File(fileName);
        if (count < 2) {
            fileList.add(file);
        }

        if (file.isDirectory()) {
            for (File items : file.listFiles()) {

                if (items.isDirectory()) {
                    fileList.add(items);
                    fileName = items.getPath() + "";
                    getCatalogAndFileInfo(fileName);
                } else {
                    fileList.add(items);
                }

            }
        }
    }

    public static void main(String[] args) {

        String fileName = "D:/dir1";
        System.out.println("Оrdinary output with Random");
        File file = new File(fileName);
        for (File f : file.listFiles((File f) -> new Random().nextInt(1) == 0)) {
            if (f.isDirectory()) {
                System.out.println(f.getName());
            }
        }
        System.out.println("******************");
        List<File> files = new ArrayList<>();
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                files.add(f);
            }
        }
        System.out.println("Output with forEach for List");
        files.forEach((f -> System.out.println(f.getName())));

        getCatalogAndFileInfo(fileName);

        System.out.println(fileList.size());
        System.out.println("*************");
        fileList.forEach(f -> {
            if (f.getName().matches(".*" + "[.txt]")) {
                System.out.println(f.getName());
            }
        });

        System.out.println("*************");
        fileList.forEach(f -> {
            if (f.getName().length() > 5) {
                System.out.println(f.getName());
            }
        });
        System.out.println("!!!!!!!!!!!!!!!!!");

        File[] filesArr = file.listFiles((File dir, String name) -> name.length() > 5);
        for (File f : filesArr) {
            System.out.println(f.getName());
        }
    }
}

