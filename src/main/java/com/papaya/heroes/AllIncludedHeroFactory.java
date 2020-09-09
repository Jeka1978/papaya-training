package com.papaya.heroes;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

import static com.papaya.heroes.RandomUtil.randomItem;

/**
 * @author Evgeny Borisov
 */

public class AllIncludedHeroFactory implements HeroFactory {

    @Getter
    private final String packageToScanForTheHeroClasses;

    private Faker faker = new Faker();

    private List<Class<? extends Hero>> heroClasses;

    public AllIncludedHeroFactory(String packageToScanForTheHeroClasses) {
        this.packageToScanForTheHeroClasses = packageToScanForTheHeroClasses;
        Reflections scanner = new Reflections(packageToScanForTheHeroClasses);
        heroClasses = new ArrayList<>(scanner.getSubTypesOf(Hero.class));
    }


    @Override
    @SneakyThrows
    public Hero createNewHero() {

        Class<? extends Hero> heroClass = randomItem(heroClasses);
        Constructor<? extends Hero> constructor = heroClass.getDeclaredConstructor(String.class);
        return constructor.newInstance(faker.gameOfThrones().character());
    }
}


















