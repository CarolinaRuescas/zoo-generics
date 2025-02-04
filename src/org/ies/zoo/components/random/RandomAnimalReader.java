package org.ies.zoo.components.random;

import org.ies.zoo.components.Reader;
import org.ies.zoo.model.Animal;
import org.ies.zoo.model.Carnivores;
import org.ies.zoo.model.Herbivores;

import java.util.Random;

public class RandomAnimalReader implements Reader<Animal>{

    private final Reader<Herbivores> herbivoresReader;
    private final Reader<Carnivores> carnivoresReader;
    private final Random random;

    public RandomAnimalReader(Reader<Herbivores> herbivoresReader, Reader<Carnivores> carnivoresReader, Random random) {
        this.herbivoresReader = herbivoresReader;
        this.carnivoresReader = carnivoresReader;
        this.random = random;
    }

    @Override
    public Animal read() {
        int type = random.nextInt(2);
        if (type == 0) {
            return herbivoresReader.read();
        } else {
            return carnivoresReader.read();
        }
    }
}
