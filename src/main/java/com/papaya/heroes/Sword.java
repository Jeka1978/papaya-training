package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */
public class Sword implements Weapon {
    @Override
    public String kick(Hero attacker, Hero defender) {
        int damage = RandomUtil.getRandomBetween(0, attacker.power);
        defender.decreaseHp(damage);
        return attacker + " decreased hp of  " + defender + " by " + damage;

    }
}
