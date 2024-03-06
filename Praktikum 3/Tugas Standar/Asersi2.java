// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : Asersi2.java
// Tgl Pembuatan : 6 Maret 2024


//class lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2{
    public static void main (String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidaK boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}