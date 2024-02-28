// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : Titik.java
// Tgl Pembuatan : 28 Februari 2024


public class Titik{
     double absis;
     double ordinat;
    static double counterTitik;

    

    public Titik(){
        absis =  0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik (double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    } 

    public double getOrdinat(){
        return ordinat;
    }

    public double getAbsis(){
        return absis;
    }

    public void setAbsis(double a){
         absis = a;
    }

    public void setOrdinat(double o){
         ordinat = o;
    }

    public double getJarakPusat(){
        return (double) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));

    }

    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
	return new Titik(absis, -ordinat);
}

    public Titik getRefleksiY(){
        return new Titik(-absis, ordinat);
        
}


}