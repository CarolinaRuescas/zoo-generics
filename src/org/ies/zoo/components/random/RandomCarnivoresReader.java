package org.ies.zoo.components.random;

import org.ies.zoo.components.Reader;
import org.ies.zoo.model.Animal;
import org.ies.zoo.model.Carnivores;

import javax.print.attribute.standard.MediaSize;
import java.util.Random;

public class RandomCarnivoresReader implements Reader<Carnivores> {
    private final static String[] SPECIES = {
            "León", "Tigre", "Puma", "Cocodrilo", "Tiburón"
    };

    private final static String[] NAME = {
            "Lucas", "Mariano", "Leo", "Juan", "Federico"
    };
    private final static String[] MEATTYPE = {
            "Chuletón", "Chorizo", "Carne cruda", "Carnita", "Filete"
    };

    private final Random random;

    public RandomCarnivoresReader(Random random) {
        this.random = random;
    }

    @Override
    public Carnivores read() {
        return new Carnivores(
                SPECIES[random.nextInt(SPECIES.length)],
                random.nextInt(20),
                NAME[random.nextInt(NAME.length)],
                MEATTYPE[random.nextInt(MEATTYPE.length)]
        );
    }
}
