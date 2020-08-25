package com.papaya.file_system;

import java.io.*;

/**
 * @author Evgeny Borisov
 */
public class MainToRead {

    public static void main(String[] args) throws Exception {





        File file = new File("c:\\tmp\\data.obj");
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName() + " doesn't exists");
        }

        FileInputStream fileInputStream = new FileInputStream(file);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);



        Object person = objectInputStream.readObject();

        System.out.println(person);

        objectInputStream.close();

    }
}
