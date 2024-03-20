//Nama      : M Yaquta Husna
//NIM       : 24060122130056
//Nama File : Main.java

package org.main;

import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali = new WaliMahasiswa("Marcus Rashford", "195809011986032254", "089543214578", "Carrington city");
        Mahasiswa mahasiswa = new Mahasiswa("Icong Suracong", "194809021986032254", "08543217896", "Informatika", wali);

        mahasiswa.cetak();
    }
}