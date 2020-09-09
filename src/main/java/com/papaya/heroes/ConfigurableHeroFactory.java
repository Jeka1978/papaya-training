package com.papaya.heroes;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class ConfigurableHeroFactory implements HeroFactory {

    private Faker faker = new Faker();

    private List<Supplier<Hero>> heroCreators = List.of(
            ()->new King(faker.gameOfThrones().character()),
            ()->new Knight(faker.gameOfThrones().character()),
            ()->new Elf(faker.gameOfThrones().character()),
            ()->new Hobbit(faker.funnyName().name())

    );


    @Override
    public Hero createNewHero() {
      return RandomUtil.randomItem(heroCreators).get();

    }
}
