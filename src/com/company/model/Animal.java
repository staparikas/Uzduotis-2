package com.company.model;

public class Animal {
    private String category;
    private String family;
    private String name;
    private float weight;
    private float height;

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    private String movement;

    @Override
    public String toString() {
        return "Vardas:" + this.category + this.family + this.name + this.weight + this.height + this.movement;

    }

    public Animal(String category, String family, String name, float weight, float height, String movement) {
        this.category = category;
        this.family = family;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.movement = movement;

    }

    ;


}
