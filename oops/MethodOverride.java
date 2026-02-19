class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle{
    @Override
    void run(){
        System.out.println("Car is running");
    }
}

public class MethodOverride {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.run();
    }
    
}
