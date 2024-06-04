/*
* Nama : M Yaquta Husna
* NIM  : 24060122130056
*/


public class Superman extends Kryptonian implements IFlyer {
    private String name;
    
    public Superman(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void takeOff() {
       
    }
    
    @Override
    public void land() {
        
    }
    
    @Override
    public void fly() {
       
    }
    
    @Override
    public void eat() {
        System.out.print("Nasi Goreng");
    }
    
    public void leapBuilding() {
        
    }
    
    public void stopBullet() {
       
    }
}
