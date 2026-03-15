package com.youssadi.tp3.listset;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Animal a = (Animal)obj;
        return this.name.equals(a.name);
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }
}
