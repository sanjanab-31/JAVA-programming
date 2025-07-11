public class PolymorphismVehicle {
    public static void main(String[] args) {
        class Vehicle {
            void start() {
                System.out.println("Vehicle class");
            }
        }
        class Car extends Vehicle {
            void start() {
                    System.out.println("Car Starts");
                }
        }
        class Bus extends Vehicle{
            void start(){
                    System.out.println("Bus starts");
                }
        }
    
        Vehicle v;
        v= new Vehicle();
        v.start();
        v=new Car();
        v.start();
        v=new Bus();
        v.start(); 
    }
        
}

