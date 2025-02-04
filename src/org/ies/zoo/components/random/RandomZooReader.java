package org.ies.zoo.components.random;

import org.ies.zoo.components.Reader;
import org.ies.zoo.model.*;

import java.util.Random;

public class RandomZooReader implements Reader<Zoo> {

    private final static String[] NAMES = {
            "Zoo de Madrid", "Zoo de Barcelona", "Zoo de Valencia"
    };

    private final Random random;
    private final Reader<Corral<Herbivores>> herbivoreCorralReader;
    private final Reader<Corral<Carnivores>> carnivoreCorralReader;
    private final Reader<Corral<Animal>> animalCorralReader;

    public RandomZooReader(Random random, Reader<Corral<Herbivores>> herbivoreCorralReader, Reader<Corral<Carnivores>> carnivoreCorralReader, Reader<Corral<Animal>> animalCorralReader) {
        this.random = random;
        this.herbivoreCorralReader = herbivoreCorralReader;
        this.carnivoreCorralReader = carnivoreCorralReader;
        this.animalCorralReader = animalCorralReader;
    }

    @Override
    public Zoo read() {
        return new Zoo(
                NAMES[random.nextInt(NAMES.length)],
                herbivoreCorralReader.read(),
                carnivoreCorralReader.read(),
                animalCorralReader.read()
        );
    }
}
