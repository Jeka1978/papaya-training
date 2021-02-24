package com.papaya.multithreading;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class ScalaPrinter implements Runnable {


    @Setter
    private boolean moreWorkToDo=true;

    public  void killProcess() throws InterruptedException {
        moreWorkToDo = false;
        throw new InterruptedException();
    }


    @SneakyThrows
    @Override
    public void run() {
        while (moreWorkToDo) {

            System.out.println("scala");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                moreWorkToDo=false;
            }

        }
    }
}
