// Nama : M Yaquta Husna
// NIM : 24060122130056
// Nama File : ExceptionOnArray.java
// Tgl Pembuatan : 6 Maret 2024


public class ExceptionOnArray{
    public static void main(String[] args){
        //instalasu ibject array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}