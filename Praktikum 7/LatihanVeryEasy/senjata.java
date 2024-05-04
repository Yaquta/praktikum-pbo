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
 * Nama File : senjata.java
 * Deskripsi : File class dari Senjata
 */
public class senjata {
    private String bunyi;
    private int peluru;
    
    public senjata (String bunyi){
        this.bunyi = bunyi;   
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
       System.out.println(getBunyi());
       this.peluru = this.peluru - 1;
       System.out.println("Sisa peluru: " + getPeluru());
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    } 
    
}
