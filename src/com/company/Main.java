package com.company;

import com.company.model.AnimalsModel;

public class Main {

    private static AnimalsModel animal;

    public static void main(String[] args) {
        AnimalsWiew obj = new AnimalsWiew();
        obj.setAnimal(animal);
        obj.dirbam();


    }
}
