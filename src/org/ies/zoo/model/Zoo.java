package org.ies.zoo.model;

import java.util.Objects;

public class Zoo {
    private String zooName;
    private Corral<Herbivores> herbivoresCorral;
    private Corral<Carnivores> carnivoresCorral;
    private Corral<Animal> animalCorral;

    public Zoo(String zooName, Corral<Herbivores> herbivoresCorral, Corral<Carnivores> carnivoresCorral, Corral<Animal> animalCorral) {
        this.zooName = zooName;
        this.herbivoresCorral = herbivoresCorral;
        this.carnivoresCorral = carnivoresCorral;
        this.animalCorral = animalCorral;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public Corral<Herbivores> getHerbivoresCorral() {
        return herbivoresCorral;
    }

    public void setHerbivoresCorral(Corral<Herbivores> herbivoresCorral) {
        this.herbivoresCorral = herbivoresCorral;
    }

    public Corral<Carnivores> getCarnivoresCorral() {
        return carnivoresCorral;
    }

    public void setCarnivoresCorral(Corral<Carnivores> carnivoresCorral) {
        this.carnivoresCorral = carnivoresCorral;
    }

    public Corral<Animal> getAnimalCorral() {
        return animalCorral;
    }

    public void setAnimalCorral(Corral<Animal> animalCorral) {
        this.animalCorral = animalCorral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(zooName, zoo.zooName) && Objects.equals(herbivoresCorral, zoo.herbivoresCorral) && Objects.equals(carnivoresCorral, zoo.carnivoresCorral) && Objects.equals(animalCorral, zoo.animalCorral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zooName, herbivoresCorral, carnivoresCorral, animalCorral);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooName='" + zooName + '\'' +
                ", herbivoresCorral=" + herbivoresCorral +
                ", carnivoresCorral=" + carnivoresCorral +
                ", animalCorral=" + animalCorral +
                '}';
    }
}
