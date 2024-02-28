// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : Garis.java
// Tgl Pembuatan : 28 Februari 2024


public class Garis{
    private Titik titikAwal;
    private Titik titikAkhir;


    public Garis( Titik awal, Titik akhir){
        titikAwal = awal;
        titikAkhir = akhir;
    }

    public void setTitikAwal(Titik awal){
        titikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir){
        titikAkhir = akhir;
    }

    public Titik getTitikAwal(){
        return titikAwal;
    }

    public Titik getTitikAkhir(){
        return titikAkhir;
    }

    public double getPanjang(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getAbsis();
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public double getGradien(){
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getAbsis();
        return ordinat / absis;
    }

    public Garis getRefleksiY(){
        Titik titikAwalRefleksi = titikAwal.getRefleksiY();
        Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    public Boolean IsTegakLurus(Garis G){
        return getGradien() * G.getGradien() == -1;
    }


}