package com.youssadi.tp2;

public class EntNat {
    private int n;
    public EntNat(int n) throws  ErrConst {
        if(n<0) throw new ErrConst();
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) throws  ErrModif {
        if(n<0) throw new ErrModif();
        this.n = n;
    }
    public void decremente() throws  ErrModif {
        int m = n-1;
        setN(m);
    }
    public static void decremente(EntNat e) throws ErrModif {
        e.decremente();
    }
}
