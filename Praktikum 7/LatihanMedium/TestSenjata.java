/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmedium;

/**
 *
 * @author yaqut
 */
/*
 * Nama : M Yaquta Husna
 * NIM  : 24060122130056
 * Nama File : TestSenjata.java
 * Deskripsi : File Main dari projek senjata latihanMedium
 */
public class TestSenjata {
    public static void main(String[] args){
        senjata ak47 = new senjata ("TAR");
        senjata m16 = new senjata ("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolm16 = new KontrolSenjata(m16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        
        System.out.println("=========================");
        
        kontrolm16.menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.menembak(2);
    }
}
