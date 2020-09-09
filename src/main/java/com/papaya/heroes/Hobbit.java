package com.papaya.heroes;

/**
 * @author Evgeny Borisov
 */
public class Hobbit extends Hero {
    public Hobbit(String name) {
        super(name);
        this.hp=3;
        this.power=0;
    }

    @Override
    String kick(Hero enemy) {
        cry();
        return "";
    }

    private void cry() {
        System.out.println("AAAAAaaaaaaaaaaaaaauuuuuuuuuuuaaaaaaaaaa");
    }
}
