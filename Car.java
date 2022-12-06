// Program to demonstrate multi-level inheritance
public class Car {
    String carColor;
    Car() // Default Constructor 
    {
    System.out.println("Default Constructor of Car class called");
    }
Car(String carColor) // Parameterized Constructor 
{
    this.carColor = carColor;
}
Car(Car ob) {
    carColor = ob.carColor;
}
public void disp() {
    System.out.println("Color of the Car is : " + carColor);
}
public static void main(String args[]) {
    //Calling the parameterized constructor
    Car c1 = new Car();
    //Calling the parameterized constructor
    Car c2 = new Car("Blue");
    c2.disp();
    //Calling the copy Constructor 
    Car c3 = new Car(c2);
    c2.disp();
}
}
