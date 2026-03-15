package com.youssadi.tp2;

public class Pile {
    private final static int taille = 10;
    private Object[] elements;
    private int pos;
    public Pile() {
        elements = new Object[taille];
        pos = -1;
    }
    public int empiler(Object e) throws PilePleine {
        try {
            pos++;
            elements[pos]=e;
        }catch(IndexOutOfBoundsException ex){
            throw new PilePleine();
        }
        return pos;
    }
    public Object depiler() throws PileVide {
        Object e;
        try{
            e = elements[pos];
            pos--;
        }catch(IndexOutOfBoundsException ex){
            throw new PileVide();
        }
        return e;
    }
}
