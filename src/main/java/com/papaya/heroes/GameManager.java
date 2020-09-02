package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */

//todo finish all of it
public class GameManager {
    public void fight(Hero hero1, Hero hero2) {
        String message;
        while (hero1.isAlive() && hero2.isAlive()) {
            message = hero1.kick(hero2);
            print(hero1, message);
            message = hero2.kick(hero1);
            print(hero2,message);
        }
        if (hero1.isAlive()) {
            System.out.println("the winner is "+hero1);
        }else {
            System.out.println("the winner is "+hero2);
        }

    }

    private void print(Hero hero1, String message) {
        System.out.println("hero of type "+hero1.getClass().getSimpleName()+ " named: "+hero1.getName()+" "+message);
    }
}
