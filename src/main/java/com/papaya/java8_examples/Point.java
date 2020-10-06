package com.papaya.java8_examples;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Point {

    private int x,y;

    public void printX() {
        System.out.println(x+ " "+y);
    }

    public static void printX(Point point) {
        System.out.println(point.y);
    }


    public static void main(String[] args) {
        List<Point> points = List.of(new Point(), new Point());

    }
}
