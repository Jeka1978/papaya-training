package com.papaya.our_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
//        IRobot iRobot = context.getInstance(IRobot.class);
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
    }
}
