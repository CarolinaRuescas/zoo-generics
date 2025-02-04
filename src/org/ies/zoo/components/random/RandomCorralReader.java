package org.ies.zoo.components.random;

import org.ies.zoo.components.Reader;
import org.ies.zoo.model.Animal;
import org.ies.zoo.model.Corral;

import java.util.Random;

public class RandomCorralReader <T extends Animal> implements Reader<Corral<T>>{

    private final Random random;
    private final Reader<T> animalReader;

    public RandomCorralReader(Random random, Reader<T> animalReader) {
        this.random = random;
        this.animalReader = animalReader;
    }

    @Override
    public Corral<T> read() {

        int number = random.nextInt(100);
        T[] animals = (T[]) new Animal[random.nextInt(50)];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = animalReader.read();
        }

        return new Corral<>(
                number,
                animals
        );
    }
}
