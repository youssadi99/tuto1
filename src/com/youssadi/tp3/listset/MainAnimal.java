package com.youssadi.tp3.listset;

import java.util.HashSet;
import java.util.Set;

public class MainAnimal {
    public static void main(String[] args) {
        Set<Animal> animals = new HashSet<>();
        animals.add(new Animal("chien"));
        animals.add(new Animal("chat"));
        animals.add(new Animal("tigre"));
        animals.add(new Animal("tigre"));

        for(Animal elem : animals){
            System.out.println(elem.getName());
        }

    }
}
