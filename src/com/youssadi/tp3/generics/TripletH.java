package com.youssadi.tp3.generics;

public class TripletH <T, U, V> {
    T premier;
    U deuxime;
    V troisieme;
    public TripletH(T premier, U deuxime, V troisieme) {
        this.premier = premier;
        this.deuxime = deuxime;
        this.troisieme = troisieme;
    }
    public void affiche(){
        System.out.println(premier + " " + deuxime + " " + troisieme);
    }

    public T getPremier() {
        return premier;
    }

    public void setPremier(T premier) {
        this.premier = premier;
    }

    public U getDeuxime() {
        return deuxime;
    }

    public void setDeuxime(U deuxime) {
        this.deuxime = deuxime;
    }

    public V getTroisieme() {
        return troisieme;
    }

    public void setTroisieme(V troisieme) {
        this.troisieme = troisieme;
    }
}
