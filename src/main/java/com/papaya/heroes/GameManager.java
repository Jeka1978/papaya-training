package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */

//todo finish all of it
public class GameManager {
    public void fight(Hero hero1, Hero hero2) {
        System.out.println(hero1+" will fight with "+hero2);
        String message;
        while (hero1.isAlive() && hero2.isAlive()) {
            message = hero1.kick(hero2);
            System.out.println(message);
            message = hero2.kick(hero1);
            System.out.println(message);
        }
        if (hero1.isAlive()) {
            System.out.println("the winner is " + hero1);
        } else {
            System.out.println("the winner is " + hero2);
        }

    }

}
