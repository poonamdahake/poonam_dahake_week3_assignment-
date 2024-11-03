abstract public class Vehicle {
    private String model;
    private int year;
    public Vehicle(String model,int year){
        this.model=model;
        this.year=year;

    }
    public abstract void start();

    public void displayInfo() {
        System.out.println("Vehicle Info: " + year + " " + model);
    }

}
class Car extends Vehicle {
    public Car(String model,int year){
        super(model,year);
    }

    public void start(){
        System.out.println("Car is starting with key");

    }
}
class Bike extends Vehicle{

    public Bike(String model,int year){
        super(model,year);

    }
    public void start(){
        System.out.println("Bike is starting with kick");
    }


    public static void main(String[] args) {
        Vehicle c1  = new Car("Arya",2011);
        c1.start();
        c1.displayInfo();

        Vehicle b1  = new Bike("Honda",2015);
        b1.start();
        b1.displayInfo();
    }

}
