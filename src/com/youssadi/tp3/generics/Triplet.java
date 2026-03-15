package com.youssadi.tp3.generics;

public class Triplet<T> {
    T premier;
    T deuxieme;
    T troisieme;
    public Triplet(T premier, T deuxieme, T troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public T getPremier() {
        return premier;
    }

    public void setPremier(T premier) {
        this.premier = premier;
    }

    public T getDeuxieme() {
        return deuxieme;
    }

    public void setDeuxieme(T deuxieme) {
        this.deuxieme = deuxieme;
    }

    public T getTroisieme() {
        return troisieme;
    }

    public void setTroisieme(T troisieme) {
        this.troisieme = troisieme;
    }
    public void affiche(){
        System.out.println(premier + " " + deuxieme + " " + troisieme);
    }
}
