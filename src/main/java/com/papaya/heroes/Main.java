package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        HeroFactory factory = new AllIncludedHeroFactory("com.papaya.heroes");

        GameManager gameManager = new GameManager();
        gameManager.fight(factory.createNewHero(),factory.createNewHero());
    }
}
