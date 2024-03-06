// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : AngkaSial.java
// Tgl Pembuatan : 6 Maret 2024

public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("Hati Hati memasukan angka");
        }
    }
}



// Baris 12 dalam AngkaSial.java tidak akan dieksekusi karena langsung throw exception
// Baris 21 dalam AngkaSial.java akan dieksekusi karena menangkap exception AngkaSialException