package org.ies.zoo.components.random;

import org.ies.zoo.components.Reader;
import org.ies.zoo.model.Animal;
import org.ies.zoo.model.Corral;
import org.ies.zoo.model.Herbivores;

import java.util.Random;

public class RandomHerbivoresReader implements Reader<Herbivores>{
    private final static String[] SPECIES = {
            "Elefantes", "Rinoceronte", "Caballo", "Cebra", "Koala"
    };

    private final static String [] NAME = {
            "Lola", "Margarita", "Pepe", "Manolo", "Eustaquia"
    };
    private final static String[] PLANTSTYPE = {
            "Romero", "Cúrcuma", "Albahaca", "Hojas", "Trigo"
    };

    private final Random random;

    public RandomHerbivoresReader(Random random) {
        this.random = random;
    }

    @Override
    public Herbivores read() {
        return new Herbivores(
                SPECIES[random.nextInt(SPECIES.length)],
                random.nextInt(20),
                NAME[random.nextInt(NAME.length)],
                PLANTSTYPE[random.nextInt(PLANTSTYPE.length)]
        );
    }
}
