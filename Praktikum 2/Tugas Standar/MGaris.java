// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : MGaris.java
// Tgl Pembuatan : 28 Februari 2024

public class MGaris {
    public static void main(String[]args){
        Titik t1; 
        Titik t2;
       
        t1 = new Titik();
        t2 = new Titik();

        t1.setAbsis (4);
        t1.setOrdinat(2);
        t2.setAbsis (2);
        t2.setOrdinat(4);

        Garis G = new Garis(t1, t2);
        Titik titikAwal = G.getTitikAwal();
        Titik titikAkhir = G.getTitikAkhir();
        
        

        System.out.println("Titik Awal : (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("titik Akhir : (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");

        System.out.println("Panjang Garis  : " + G.getPanjang());
        System.out.println("Panjang Garis Gradien  : " + G.getGradien());

        Garis GRefleksiY = G.getRefleksiY();
        Titik tAwalRefleksiY = GRefleksiY.getTitikAwal();
        Titik tAkhirRefleksiY = GRefleksiY.getTitikAkhir();

       
        System.out.println("Titik Awal (" + tAwalRefleksiY.getAbsis() + "," + tAwalRefleksiY.getOrdinat() + ")");
        System.out.println("Titik Akhir (" + tAkhirRefleksiY.getAbsis() + "," + tAkhirRefleksiY.getOrdinat() + ")");

        System.out.println("Garis G Tegak Lurus Dengan Garis RefleksiY : " + G.IsTegakLurus(GRefleksiY));
    }
}
    