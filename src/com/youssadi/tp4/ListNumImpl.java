package com.youssadi.tp4;
import java.util.Iterator;
import java.util.LinkedList;

public class ListNumImpl implements  ListeNumTel{
    private LinkedList<NumTel> list = new LinkedList<>();

    @Override
    public boolean ajouter(int index, NumTel num) {
        list.add(index, num);
        return true;
    }

    @Override
    public boolean ajouterDebut(NumTel num) {
        list.addFirst(num);
        return true;
    }

    @Override
    public boolean ajouterFin(NumTel num) {
        list.addLast(num);
        return true;
    }

    @Override
    public boolean contientNumero(int num) {
        return list.contains(num);
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }

    @Override
    public int nbNumeros() {
        return list.size();
    }

    @Override
    public NumTel numero(int index) {
        return list.get(index);
    }

    @Override
    public NumTel premierNumero() {
        return list.getFirst();
    }

    @Override
    public boolean retirer(int num) {
        Iterator<NumTel> iterator = iterator();
        while(iterator.hasNext()){
            NumTel elem = iterator.next();
            if(elem.getNum() == num){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String ch = "";
        for(NumTel num : list){
            ch = ch + num.getNum() + " " + num.getCode() + "\n";
        }
        return ch;
    }
}
