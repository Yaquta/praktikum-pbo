//Nama      : M Yaquta Husna
//NIM       : 24060122130056
//Nama File : Orang.java

package org.orang;

public class Orang {
    private String nama;
    private String nik;

    public Orang(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void cetak() {
        System.out.println("Nama: " + nama);
        System.out.println("NIK: " + nik);
    }
}