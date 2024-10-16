import java.util.ArrayList;

public class RentalService {
    private ArrayList<Vehicle>vehicles;
    public RentalService(){
        vehicles=new ArrayList<>();
    }
   
    public void addVehicle(Vehicle v){
        vehicles.add(v);
    }
    public ArrayList<Vehicle> getvehicle(){
        return vehicles;
    }
    public void rent(String id,int numberOfDays){
        boolean found=false;
        for(Vehicle e: vehicles){
            if(e.getvehicleId().equals(id)){
                found=true;
                if(!e.isRented()){
                    e.rentVehicle(numberOfDays);
                    System.out.println("The vehicle "+e.getvehicleId()+" is now rented for "+e.calculateRenalCost(numberOfDays)+" $");
                }else{
                    System.out.println("You cannot rent the vehicle "+e.getvehicleId());
                }
            }
        }
        if(!found){
            System.out.println("Vehicle "+id+" not found");
        }
    }
    public void returnn(String id){
        for(Vehicle e: vehicles){
            if(e.getvehicleId().equals(id)&& e.isRented()){
                e.returnVehicle();;
            }

        }
    }
}
