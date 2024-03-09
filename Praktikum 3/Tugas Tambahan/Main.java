// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : Main.java
// Tgl Pembuatan : 8 Maret 2024


public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota = new Anggota("Nama Anggota");
        Buku buku1 = new Buku("Learning Phyton");
        Buku buku2 = new Buku("Belajar Matematika");
        Buku buku3 = new Buku("Belajar Menghitung");
        Buku buku4 = new Buku("Bahasa Sastra");

        try {
            // TODO 4: Buat implementasi try-catch untuk
            // handling exception pada saat melakukan peminjaman buku
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            // Coba meminjam buku keempat, ini akan melempar MaksimumBukuTerpinjamException
            anggota.pinjamBuku(buku4);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Gagal meminjam buku: " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Gagal meminjam buku: " + e.getMessage());
        }
    }
}
