// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : Asersi1.java
// Tgl Pembuatan : 6 Maret 2024


public class Asersi1{
    public static void main(String[] args){
        int x= -10;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x>0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
     
    }
}