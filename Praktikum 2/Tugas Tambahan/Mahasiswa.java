// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : Mahasiswa.java
// Tgl Pembuatan : 2 Maret 2024

public class Mahasiswa{
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;

    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }

    public WaliMahasiswa getWali(){
        return wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(String WaliMahasiswa){
        this.wali = wali;
    }

    public void cetak() {
        //mencetak informasi mahasiswa
        System.out.println("=================================");
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        //mencetak informasi wali mahasiswa      
        System.out.println("\nInformasi Wali Mahasiswa:");
        System.out.println("Nama Wali: " + wali.getNama());
        System.out.println("Nomor HP Wali: " + wali.getNomorHp());
        System.out.println("Alamat Wali: " + wali.getAlamat());
        System.out.println("=================================");
    }

}