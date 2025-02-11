package org.ies.zoo.model;

import java.util.Arrays;
import java.util.Objects;

public class Corral < T extends Animal>{
    private int corralNumber;
    private T[] animals;

    public Corral(int corralNumber, T[] animals) {
        this.corralNumber = corralNumber;
        this.animals = animals;
    }
    public void animalInfo(){
        for (T animal : animals){
            System.out.println(animal);
        }
    }

    public int getCorralNumber() {
        return corralNumber;
    }

    public void setCorralNumber(int corralNumber) {
        this.corralNumber = corralNumber;
    }

    public T[] getAnimals() {
        return animals;
    }

    public void setAnimals(T[] animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Corral<?> corral = (Corral<?>) o;
        return corralNumber == corral.corralNumber && Objects.deepEquals(animals, corral.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(corralNumber, Arrays.hashCode(animals));
    }

    @Override
    public String toString() {
        return "Corral{" +
                "corralNumber=" + corralNumber +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
