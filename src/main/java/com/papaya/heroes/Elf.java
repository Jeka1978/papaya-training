package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */
public class Elf extends Hero {

    public Elf(String name) {
        super(name);
        this.hp = 10;
        this.power = 10;
    }

    @Override
    public String kick(Hero enemy) {
        if (this.power > enemy.getPower()) {
            enemy.setHp(0);
            return this + " killed an " + enemy;
        }else {
            enemy.decreasePower(1);
            return this + " made an enemy more weak";
        }
    }
}
