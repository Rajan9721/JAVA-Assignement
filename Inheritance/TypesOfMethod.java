package Inheritance;

class Aeroplane{
    public void takeOf(){
        System.out.println("Aeroplane is takingOf");
    }
    public void fly() // method overriden
    {
        System.out.println("Aeroplane is flyong");
    }
}
class CargoPlane extends Aeroplane{
    public void fly() // this is overriding method
    {
        System.out.println("Aeroplane flies down height");
    }
    public void carryGoods() // Specialized method
    {
        System.out.println("Aeroplne caries goods");
    }
} 

class PasengerPlane extends Aeroplane{
    public void fly(){
        System.out.println("Aeroplane flies mediam height");
    }
    public void carryPassenger()
    {
        System.out.println("Aeroplane caries passenger");
    }
}
public class TypesOfMethod {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOf();
        cp.carryGoods();
        cp.fly();

        PasengerPlane pn = new PasengerPlane();
        pn.takeOf();
        pn.carryPassenger();
        pn.fly();
    }
}
