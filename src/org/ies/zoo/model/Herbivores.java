package org.ies.zoo.model;

import java.util.Objects;

public class Herbivores extends Animal{
    private String plantsType;

    public Herbivores(String species, int age, String name, String plantsType) {
        super(species, age, name);
        this.plantsType = plantsType;
    }

    public String getPlantsType() {
        return plantsType;
    }

    public void setPlantsType(String plantsType) {
        this.plantsType = plantsType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(plantsType, that.plantsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plantsType);
    }

    @Override
    public String toString() {
        return "Herbivores{" +
                "plantsType='" + plantsType + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
