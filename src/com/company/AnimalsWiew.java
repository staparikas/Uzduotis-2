package com.company;

import com.company.model.Animal;
import com.company.model.AnimalsModel;

import java.util.Scanner;

public class AnimalsWiew {
    private AnimalsModel animal = null;

    private void showMenu() {
        System.out.println("0- Baigti darba");
        System.out.println("1- Pasirinkit gyvuna");

    }

    public void setAnimal(AnimalsModel animal) {
        this.animal = animal;
    }

    public void dirbam() {
        Scanner sc = new Scanner(System.in);
        boolean arTesti = true;
        do {
            showMenu();
            int pasirinkimas = sc.nextInt();
            switch (pasirinkimas) {
                case 0:
                    arTesti = false;
                case 1:
                    System.out.println("Iveskite gyvuno numeri nuo 0 iki " + AnimalsModel.getInstance().getArrayList().size());
                    int i = sc.nextInt();
                    System.out.println(AnimalsModel.getInstance().getArrayList().get(i).toString());

                    break;
                case 2: System.out.println("Iveskite gyvuno numeri nuo 0 iki " + AnimalsModel.getInstance().getArrayList().size());
                     i = sc.nextInt();
                     Animal gyvunas = AnimalsModel.getInstance().getArrayList().get(i);
                    System.out.println("Iveskite nauja gyvuno judejima");
                    String judejimas = sc.next();
                    gyvunas.setMovement(judejimas);
                    break;

            }
        } while (arTesti);
    }

}
