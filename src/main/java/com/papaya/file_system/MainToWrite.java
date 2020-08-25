package com.papaya.file_system;

import com.papaya.Person;

import java.io.*;

/**
 * @author Evgeny Borisov
 */
public class MainToWrite {

    public static void main(String[] args) throws IOException {
        File file = new File("c:\\tmp\\data.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Human maria = Human.builder().age(21).name("Maria").build();


        objectOutputStream.writeObject(maria);

        objectOutputStream.close();

    }
}
