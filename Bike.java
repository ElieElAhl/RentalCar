public class Bike  extends Vehicle{
    private boolean isElectric;
    public Bike(){
        super();
        this.isElectric=false;
    }
    public Bike(String vehicleId,String brand,double rentalPricePerDay,boolean isRented,boolean isElectric){
        super(vehicleId,brand,rentalPricePerDay,isRented);
        setisElectric(isElectric);
    }
    public void setisElectric(boolean isElectric){
        this.isElectric=isElectric;
    }
    public boolean isElectric(){
        return isElectric;
    }
    public void displayVehicleDetails(){
        System.out.println("Bike details: "+getbrand()+" "+(isElectric ? "Electric":"Non-electric")+","+getrentalPricePerDay()+"$ per day");
    }
    
    
}
