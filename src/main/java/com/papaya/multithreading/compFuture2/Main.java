package com.papaya.multithreading.compFuture2;

import javax.swing.*;
import java.util.concurrent.CompletableFuture;

/**
 * Created by Evegeny on 08/02/2017.
 */
public class Main {
    public static void main(String[] args) {
        SerialService serialService = new SerialService();
        ScoreService scoreService = new ScoreService();
        while (true) {
            String name = JOptionPane.showInputDialog("Please input serial name");
            CompletableFuture<Serial> serialCompletableFuture = serialService.getSerial(name);
            double score = Double.parseDouble(JOptionPane.showInputDialog("what is your score?"));
            CompletableFuture<Serial> updatedSerialCompletableFuture =
                    scoreService.updateScore(serialCompletableFuture, score);
            serialService.updateSerial(updatedSerialCompletableFuture);
        }
    }
}
