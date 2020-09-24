package com.papaya.final_or_effectivly_final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Evgeny Borisov
 */
public class ColorFrame extends JFrame {
    public ColorFrame() throws HeadlessException {
        int counter = 0;
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton button = new JButton("click me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button was clicked "+counter);
            }
        });
        getContentPane().add(button, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrame();
    }
}
