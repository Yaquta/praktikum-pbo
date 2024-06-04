/*
* Nama : M Yaquta Husna
* NIM  : 24060122130056
*/


public abstract class Animal {
    public abstract void eat();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
