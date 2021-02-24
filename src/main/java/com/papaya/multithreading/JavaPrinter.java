package com.papaya.multithreading;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class JavaPrinter implements Runnable {
    @Setter
    private boolean moreWorkToDo=true;


    public  void killProcess() throws InterruptedException {
        moreWorkToDo = false;
        throw new InterruptedException();
    }


    @Override
    public void run() {
        while (moreWorkToDo) {

            System.out.println("java");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                moreWorkToDo=false;
            }
        }
    }
}
