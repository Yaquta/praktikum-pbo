/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author yaqut
 */
/*
 * Nama : M Yaquta Husna
 * NIM  : 24060122130056
 * Nama File : TestSenjata.java
 * Deskripsi : File Main dari Projek senjata latihanVeryEasy
 */
public class TestSenjata {
    public static void main(String[] args){
        senjata ak47 = new senjata("TAR");
        senjata m16 = new senjata("DOR");
        
        System.out.println("Jumlah Peluru AK47" + ak47.getPeluru());
        System.out.println("AK$& mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47" + ak47.getPeluru());
        
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
    
}