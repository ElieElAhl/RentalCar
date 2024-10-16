public class Main {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();
        Car car1= new Car("C001", "Toyota", 50.0, false, "Diesel");
        Car car2= new Car("C002","BMW",40,false,"Gasoline");
        Bike bike= new Bike("BK001","Yamaha",20,false,false);
        Boat boat= new Boat("BT001","Sea Ray",100,false,40);

        rentalService.addVehicle(car1);
        rentalService.addVehicle(car2);
        rentalService.addVehicle(bike);
        rentalService.addVehicle(boat);

        for(Vehicle e: rentalService.getvehicle()){
            e.displayVehicleDetails();
        }
        rentalService.rent("C001", 8);
        rentalService.rent("BK001", 8);
        rentalService.rent("C001", 1);
        rentalService.returnn("C001");
        rentalService.rent("C002", 4);

        rentalService.rent("C003", 4);






        

        
       
    }
    
}
