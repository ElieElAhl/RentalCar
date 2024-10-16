public class Boat extends Vehicle {
    private double maxSpeed;
    public Boat(){
        super();
        this.maxSpeed=0;
    }
    public Boat(String vehicleId,String brand,double rentalPricePerDay,boolean isRented,double maxSpeed){
        super(vehicleId,brand,rentalPricePerDay,isRented);
        setmaxSpeed(maxSpeed);
    }
    public void setmaxSpeed(double maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public double getmaxSpeed(){
        return maxSpeed;
    }
    public void displayVehicleDetails(){
        System.out.println("Boat Details: "+getbrand()+", Max Speed "+getmaxSpeed()+" konts, "+ getrentalPricePerDay()+"$ per day");
    }
    
    
}
