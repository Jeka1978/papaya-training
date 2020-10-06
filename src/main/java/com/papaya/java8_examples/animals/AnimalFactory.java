package com.papaya.java8_examples.animals;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class AnimalFactory {

    private Random random = new Random();

    private List<Supplier<Animal>> animalCreators = List.of(
            Dog::new,
            Cat::new,
            Horse::new
    );


    public Animal createRandomAnimal() {
        int i = random.nextInt(animalCreators.size());
        return animalCreators.get(i).get();

    }
}
