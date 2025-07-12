
package demo;
/*final keyword is a non-access modifier used for variables, methods, and classes
 * Once assigned, cannot be changed.
 * 
 */

interface Engine {
    int MAX_RPM = 7000; // by default it is public static final

    void start();  // public abstract (can't be used final...because it should be implemented)

    default void stop() {  // can't be used because the purpose of default method is to override in interface
        System.out.println("Engine stopped(default method)");
    }

    static void engineInfo() {  // as  all static methods are implicitly final ...so no need to write explicitly final 
        System.out.println("Engine type:Diesel");
    }
}


abstract class Vehicle {
    String brand; 
    final String vehicleType = "4 Wheeler"; 
    static int vehicleCount = 0; 

   
    Vehicle(String brand) {   // constructor
        this.brand = brand;
        vehicleCount++; // Increments with each object creation
    }

   
    final void showVehicleType() {    // final method  can't be overridden
        System.out.println("Type:" + vehicleType);
    }

   
    abstract void drive();  // must be implemented in another class ...so we don't use final

   
    static void showVehicleCount() {
        System.out.println("Total Vehicles:" + vehicleCount);
    }

  
    void showBrand() {
        System.out.println("Brand:" + brand);
    }
}


class Car extends Vehicle implements Engine {

    final String modelName; // Final variable must be initialized 

    // constructor with final parameter
    Car(String brand, final String modelName) {
        super(brand);
        this.modelName = modelName;
        // modelName = "Swift";   //  Not allowed for final parameter
    }

    // override abstract method from Vehicle
    @Override
    void drive() {
        System.out.println(modelName + " is driving...");
    }

    // Override interface method
    @Override
    public void start() {
        System.out.println(modelName + " engine started.");
    }

    // Override default method from interface
    @Override
    public void stop() {
        System.out.println(modelName + " engine stopped.");
    }

    
    static void showInfo() {
        System.out.println("Car static info method.");
    }


    void speed(int kmph) {
        System.out.println(modelName + " is moving at " + kmph + " km/h.");
    }
}

// final class  can't be inherited
final class FinalVehicle {
    void info() {
        System.out.println("This is a final class. Cannot extend this.");
    }
}

// Main class
public class FinalKW {
    public static void main(String[] args) {

        System.out.println("Interface Static Method");
        Engine.engineInfo();

         System.out.println("\nObject Creation");
        Car car1 = new Car("Tata", "nano");
        car1.showBrand();           // vehicle method
        car1.showVehicleType();     // final method from Vehicle
        car1.start();               // overridden method
        car1.drive();               // abstract method implemented
        car1.stop();                // overridden default method
        car1.speed(80);           

        System.out.println("\nFinal Variable");
        System.out.println("Max RPM: " + Engine.MAX_RPM);

        System.out.println("\nStatic Methods");
        Car.showInfo();            
        Vehicle.showVehicleCount(); 

        System.out.println("\nFinal Class");
        FinalVehicle fv = new FinalVehicle();
        fv.info();
    }
}




