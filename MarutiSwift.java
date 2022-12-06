// Program to demonstrate multi-level inheritance
public class MarutiSwift extends Maruti {
    public MarutiSwift() {
        System.out.println("Maruti Model: MarutiSwift ");
    }
    public void speed() {
        System.out.println("Max: 80Kmph");
    }
    public static void main(String args[]) {
        MarutiSwift obj = new MarutiSwift();
        obj.vehicleType();
        obj.brand();
        obj.speed();
    }
}
class Car {
    public Car() {
        System.out.println("Class Car");
    }
    public void vehicleType() {
        System.out.println("Vehicle Type: Car");
    }
}
class Maruti extends Car {
    public Maruti() {
        System.out.println("Class Maruti");
    }
    public void brand() {
        System.out.println("Brand: Maruti");
    }
    public void speed() {
        System.out.println("Max: 90Kmph");
    }
}
