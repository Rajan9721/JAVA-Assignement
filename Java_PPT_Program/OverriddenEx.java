package Java_PPT_Program;


import java.beans.VetoableChangeListenerProxy;

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }

}
class Bike extends Vehicle {
    @Override
    void run(){
        System.out.println("Bike is running");
    }
}
public class OverriddenEx {
    public static void main(String[] args) {
        Vehicle b = new Bike();
        b.run();
    }
}
