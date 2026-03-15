package com.youssadi.tp4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MAnnuaire implements Annuaire{
    Map<Personne, ListeNumTel> map = new HashMap<>();
    @Override
    public void afficher() {
        for(Personne p: map.keySet()){

            ListeNumTel list_num = map.get(p);
            System.out.println("Nom " + p.getNom() + " Prenom "+ p.getPrenom() + " Civilite "+ p.getCivilite() + "\n");
            Iterator<NumTel> iterator = list_num.iterator();
            while(iterator.hasNext()){
                NumTel num = iterator.next();
                System.out.println(num.getNum() + " " + num.getCode() + "\n");
            }

        }
    }

    @Override
    public boolean ajouterEntree(Personne p, ListeNumTel noms) {
        map.put(p, noms) ;
        return true;

    }

    @Override
    public void ajouterNumeroDebut(Personne p, NumTel n) {
        map.get(p).ajouterDebut(n);
    }

    @Override
    public void ajouterNumeroFin(Personne p, NumTel n) {
        map.get(p).ajouterFin(n);
    }

    @Override
    public ListeNumTel numeros(Personne p) {
        return map.get(p);
    }

    @Override
    public Iterator personnes() {
        return map.keySet().iterator();
    }

    @Override
    public NumTel premierNumero(Personne p) {
        return map.get(p).premierNumero();
    }

    @Override
    public void supprimer(Personne p) {
        map.remove(p);
    }

    @Override
    public void supprimer(Personne p, int n) {
        map.get(p).retirer(n);
    }
}
