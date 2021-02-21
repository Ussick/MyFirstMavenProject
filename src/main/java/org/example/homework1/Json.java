package org.example.homework1;

import com.google.gson.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Json {
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private static void toFillFile(List<String> info, File file) {
        Person person = new Person();
        person.setName(info.get(0));
        person.setAge(Integer.parseInt(info.get(1)));
        String str = GSON.toJson(person);
        System.out.println(str);

        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            fos.write((str + System.lineSeparator()).getBytes());
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        List<String> info = new ArrayList<>();
        int i = 0;

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        while (!line.equals("end")) {
            info.add(line);
            line = in.nextLine();
            i++;
            if (i == 2) {
                break;
            }
        }

        String fileName = "D:/java course/Java advance/1 lesson/myJSON.json";
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        toFillFile(info, file);


    }

}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {

    }
}
