/**
 * MLingkaran.java
 * Penulis : M Yaquta Husna
 * NIM     : 240601221030056
 
 * 
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan1;
        double jejari;
        Lingkaran luas;

        scan1 = new Scanner(System.in);
        System.out.print("masukkan jejari lingkaran 1: ");

        jejari = scan1.nextDouble();
        luas = new Lingkaran(jejari);

        System.out.println("Luas lingkaran 1 adalah " +luas.hitungLuas());

        scan1.close();

    }
}