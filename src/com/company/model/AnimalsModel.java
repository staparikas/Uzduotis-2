package com.company.model;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalsModel {
    private static AnimalsModel instance;

    private ArrayList<Animal> arrayList;

    public static AnimalsModel getInstance() {
        if(instance == null){
            instance = new AnimalsModel();
        }
        return instance;
    }
    private AnimalsModel(){
        readData();
    }
    public void readData() {
        FileReader reader = null;
        arrayList=new ArrayList<>();
        try {
            reader = new FileReader("duomenys.txt");
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(reader);
        while (sc.hasNext()) {
            String category = sc.next();
            String family = sc.next();
            String name = sc.next();
            float weight = sc.nextFloat();
            float height = sc.nextFloat();
            String movement = sc.next();
            arrayList.add(buildAnimal(category, family, name, weight, height, movement));

        }

        try {
            reader.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

    private Animal buildAnimal(String category, String family, String name, float weight, float height, String movement) {
        switch (category) {
            case "Bee":
                return new Bee(category, family, name, weight, height, movement);
            case "Cockroach":
                return new Cockroach(category, family, name, weight, height, movement);
            case "Cow":
                return new Cow(category, family, name, weight, height, movement);
            case "Eagle":
                return new Eagle(category, family, name, weight, height, movement);
            case "Hamster":
                return new Hamster(category, family, name, weight, height, movement);
            case "Lion":
                return new Lion(category, family, name, weight, height, movement);
            case "Ostrich":
                return new Ostrich(category, family, name, weight, height, movement);
            case "Owl":
                return new Owl(category, family, name, weight, height, movement);
            case "Scorpion":
                return new Scorpion(category, family, name, weight, height, movement);
            case "Spider":
                return new Spider(category, family, name, weight, height, movement);
            case "Worm":
                return new Worm(category, family, name, weight, height, movement);
        }
        return null;
    }


    public ArrayList<Animal> getArrayList() {
        return arrayList;
    }
}
