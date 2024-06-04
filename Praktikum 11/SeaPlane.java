/*
* Nama : M Yaquta Husna
* NIM  : 24060122130056
*/


public class SeaPlane extends Airplane {
    private double maxLoad;
    
    public SeaPlane(double maxLoad) {
        this.maxLoad = maxLoad;
    }
    
    @Override
    public double calcFuelEfficiency() {
        return 0;
    }
    
    @Override
    public double calcTripDistance() {
        return 0;
    }
}
