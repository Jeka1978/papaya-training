package com.papaya.our_spring;

/**
 * @author Evgeny Borisov
 */
public class ConsoleSpeaker implements Speaker {


    @PrimaryConstructor
    public ConsoleSpeaker() {
    }

    public ConsoleSpeaker(int x) {
    }



    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
