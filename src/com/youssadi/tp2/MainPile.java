package com.youssadi.tp2;

public class MainPile {
    public static void main(String[] args) throws PileVide, PilePleine{
        Pile p = new Pile();
        for(int i=0; i<10; i++){
            p.empiler(i);
        }
        //p.empiler(11);
        for(int i=0; i<10; i++){
            p.depiler();
        }
        p.depiler();

    }
}
