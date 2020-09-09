package com.papaya.heroes;

import lombok.Setter;

/**
 * @author Evgeny Borisov
 */
public class Knight extends Hero {

    @Setter
    private Weapon weapon = new Sword();

    public Knight(String name) {
        super(name);
        this.power = RandomUtil.getRandomBetween(2, 12);
        this.hp = RandomUtil.getRandomBetween(2, 12);
    }

    @Override
    String kick(Hero enemy) {
        return weapon.kick(this,enemy);
    }
}
