package com.papaya.heroes;

import lombok.Setter;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class King extends Hero {

    @Setter
    private Weapon currentWeapon = new Sword();

    private List<Weapon> weapons = List.of(new Sword(), new Axe());


    @Scheduled(fixedDelay = 1000 * 600)
    public void changeWeapon() {
        currentWeapon = RandomUtil.randomItem(weapons);
    }


    public King(String name) {
        super(name);
        this.hp = RandomUtil.getRandomBetween(5, 15);
        this.power = RandomUtil.getRandomBetween(5, 15);
    }

    @Override
    String kick(Hero enemy) {
        return currentWeapon.kick(this, enemy);

    }
}
