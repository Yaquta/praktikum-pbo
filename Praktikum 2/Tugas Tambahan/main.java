// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : main.java
// Tgl Pembuatan : 2 Maret 2024

public class main {
    public static void main(String[] args) {
    
       //membuat objek wali mahasiswa
        WaliMahasiswa wali1 = new WaliMahasiswa("Budiono Siregar", "089234567890", "Jl. Pemuda");
        WaliMahasiswa wali2 = new WaliMahasiswa("Joko Pranowo", "08567857653", "Jl. Pejuang");
        

        //membuat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Iwan Merdu", "24060122130078", "Teknik Informatika", wali1);
        Mahasiswa mahasiswa2 = new Mahasiswa("Sally Cinnamon", "24060122140088", "Teknik Informatika", wali2);
        Mahasiswa mahasiswa3 = new Mahasiswa("Lemmy Skinnyhead", "240601221200001", "Teknik Informatika", wali1);
       
        
        // Memanggil method cetak dari objek Mahasiswa
        mahasiswa1.cetak();
        mahasiswa2.cetak();
        mahasiswa3.cetak();

    }
}


        

















    















