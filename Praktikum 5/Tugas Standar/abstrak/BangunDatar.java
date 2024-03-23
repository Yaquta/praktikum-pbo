/**
 * BangunDatar.java
 * Penulis : M Yaquta Husna
 * NIM     : 240601221030056
 
 * 
 */

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}