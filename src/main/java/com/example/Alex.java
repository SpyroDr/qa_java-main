package com.example;

import java.util.List;

public class Alex extends Lion {

    public Alex(String sex, Feline feline) throws Exception {
        super(sex, feline);
    }


    public List<String> getFood() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public boolean doesHaveMane() {
        return true;
    }

}
