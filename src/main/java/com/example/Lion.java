package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    final Feline feline;


    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    //Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane(String sex) {
        return hasMane;
    }

    public List<String> getFood(String animalKind) throws Exception {
        return feline.getFood("Хищник");
    }
}
