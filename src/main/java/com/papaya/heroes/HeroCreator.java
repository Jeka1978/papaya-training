package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */
@FunctionalInterface
public interface HeroCreator {
    Hero create();
}
