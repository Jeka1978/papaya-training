package com.papaya.heroes;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public abstract class Hero {
    protected int hp;
    protected int power;
    private final String name;

    public Hero(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void decreasePower(int delta) {
        power -= delta;
    }

    public void decreaseHp(int delta) {
        hp -= delta;
    }



    abstract String kick(Hero enemy);



    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }
}
