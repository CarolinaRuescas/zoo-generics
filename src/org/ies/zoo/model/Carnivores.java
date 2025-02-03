package org.ies.zoo.model;

import java.util.Objects;

public class Carnivores extends Animal {
    private String meatType;

    public Carnivores(String species, int age, String name, String meatType) {
        super(species, age, name);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carnivores that = (Carnivores) o;
        return Objects.equals(meatType, that.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatType);
    }

    @Override
    public String toString() {
        return "Carnivores{" +
                "meatType='" + meatType + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
