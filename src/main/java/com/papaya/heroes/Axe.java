package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */
public class Axe implements Weapon {
    @Override
    public String kick(Hero attacker, Hero defender) {
        if (attacker.getPower() > 20) {
            defender.setHp(0);
            return "killed by axe";
        }
        return "I'm trying to use my Axe, but it is too heavy";
    }
}
