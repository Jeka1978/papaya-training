package com.papaya.multithreading;

import java.util.concurrent.ExecutionException;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        JavaPrinter javaPrinter = new JavaPrinter();
        Thread myThread = new Thread(javaPrinter,"javaThread");
        ScalaPrinter scalaPrinter = new ScalaPrinter();
        Thread myThread2 = new Thread(scalaPrinter,"scalaThread");




        myThread.start();
        myThread2.start();

        Thread.sleep(1000);

        scalaPrinter.setMoreWorkToDo(false);
        javaPrinter.setMoreWorkToDo(false);


        Thread thread = new Thread(() -> {
            while (true) {

                System.out.println("deamon thread is running");
            }
        });

        thread.setDaemon(true);
        thread.start();


    }
}
