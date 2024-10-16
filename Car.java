public class Car extends Vehicle {
    private String fuelType;
    public Car(){
        super();
        this.fuelType="";
    }
    public Car(String vehicleId,String brand,double rentalPricePerDay,boolean isRented,String fuelTpe){
        super(vehicleId,brand,rentalPricePerDay,isRented);
        setfuelType(fuelTpe);
    }
    public void setfuelType(String fuelType){
        this.fuelType=fuelType;
    }
    public String getfuelType(){
        return fuelType;
    }
    public void displayVehicleDetails(){
        System.out.println("Car details: "+getbrand()+", fuel type: "+getfuelType()+", "+getrentalPricePerDay()+"$ per day");
    }
   public double calculateRenalCost(int numberOfDays){
    double recentprice=getrentalPricePerDay()*numberOfDays;
    if(numberOfDays>7 && isRented()){
        recentprice*=0.7;
    }
    return recentprice;
    
   }
}
