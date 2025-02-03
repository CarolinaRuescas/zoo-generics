package org.ies.zoo.model;

import java.util.Objects;

public abstract class Animal {
    protected String species;
    protected int age;
    protected String name;

    public Animal(String species, int age, String name) {
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(species, animal.species) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, age, name);
    }

}
