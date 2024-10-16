public abstract class Vehicle implements Rentable{
    private String vehicleId;
    private String brand;
    private double rentalPricePerDay;
    private boolean isRented;
    public Vehicle(){
        this("","",0,false);
    }
    public Vehicle(String vehicleId,String brand,double rentalPricePerDay,boolean isRented){
        setvehicleId(vehicleId);
        setbrand(brand);
        setrentalPricePerDay(rentalPricePerDay);
        setisRented(isRented);
    }
    public void setvehicleId(String vehicleId){
        this.vehicleId=vehicleId;
    }
    public void setbrand(String brand){
        this.brand=brand;
    }
    public void setrentalPricePerDay(double rentalPricePerDay){
        this.rentalPricePerDay=rentalPricePerDay;
    }
    public void setisRented(boolean isRented){
        this.isRented=isRented;
    }
    public String getvehicleId(){
        return vehicleId;
    }
    public String getbrand(){
        return brand;
    }
    public double getrentalPricePerDay(){
        return rentalPricePerDay;
    }
    public boolean isRented(){
        return isRented;
    }
    public void rentVehicle(int numberOfDays){//may be we should make an array? or inilaize something
        if(!isRented){//isRented==false
            isRented=true;
            //System.out.println("The vehicle "+getvehicleId()+" is now rented for "+getrentalPricePerDay()+"$.");
        }else{
            System.out.println("You cannot rent the vehicle "+getvehicleId());
        }
    }
    public void returnVehicle(){
        if(isRented){//isRented==true
            isRented=false;
            //I should return it 
            System.out.println("The vehicle "+getvehicleId()+" is now avaliable");
        }else{
            System.out.println("The vehicle "+getvehicleId()+" is avilable already ");
        }
    }
    public double calculateRenalCost(int numberOfDays){
        return getrentalPricePerDay()*numberOfDays;
    }
    abstract void displayVehicleDetails();
}