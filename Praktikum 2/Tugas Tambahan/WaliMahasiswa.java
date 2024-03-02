// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : WaliMahasiswa.java
// Tgl Pembuatan : 2 Maret 2024


public class WaliMahasiswa{
    private String nama;
    private String nomorHp;
    private String alamat;



    public WaliMahasiswa(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getNomorHp(){
        return nomorHp;
    }

    public String getAlamat(){
        return alamat;
    }


}