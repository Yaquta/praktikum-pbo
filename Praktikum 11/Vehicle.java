/*
* Nama : M Yaquta Husna
* NIM  : 24060122130056
*/


public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
