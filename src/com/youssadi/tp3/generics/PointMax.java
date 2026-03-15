package com.youssadi.tp3.generics;
class Point implements Comparable<Point> {
    private int x, y ;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void affiche() {
        System.out.println ("coordonnees : " + x + " " + y ) ;
    }
    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    @Override
    public int compareTo(Point o) {
        if(this.distance() < o.distance())
            return -1;
        else if(this.distance() > o.distance())
            return 1;
        else
            return 0;
    }
}

public class PointMax {
    public static <T extends Comparable<T>>  T max(T[] tab){
        T x = tab[0];
        for(int i = 1; i < tab.length; i++){
            if(x.compareTo(tab[i]) < 0){
                x= tab[i];
            }
        }
        return x;
    }

    public static void main(String[] args) {

        Point[] tab2 = {new Point(1, 2), new Point(3, 4), new Point(5, 6)};
        max(tab2).affiche();
        String[] tab3 = {"a", "b", "c"};
        System.out.println(max(tab3));
    }
}
