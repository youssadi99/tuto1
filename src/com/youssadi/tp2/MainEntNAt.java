package com.youssadi.tp2;

public class MainEntNAt {
    public static void main(String[] args) throws  ErrModif , ErrConst {

        EntNat e = new EntNat(3);
        e.decremente();
        System.out.println(e.getN());
        EntNat.decremente(e);
        System.out.println(e.getN());
        e.decremente();
        System.out.println(e.getN());
        e.decremente();
        System.out.println(e.getN());
        e.setN(4);

    }
}
