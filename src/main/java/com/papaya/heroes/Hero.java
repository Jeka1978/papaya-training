package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */
public interface Hero {
    boolean isAlive();

    String kick(Hero enemy);

    String getName();
}
