package Polymorphism;

class AeroPlane{
    public void takeOff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends AeroPlane{
    public void takeOff(){
        System.out.println("Cargoplane require long runway");
    }
    public void fly(){
        System.out.println("Cargo plane flies at lower height");
    }
}
class PassengerPlane extends AeroPlane{
    public void takeOff(){
        System.out.println("Passenger plane require medium size runway");
    }
    public void fly(){
        System.out.println("Passenger plane flies at medium height");
    }
}
class FighterPlane extends AeroPlane{
    public void takeOff(){
        System.out.println("Fighter plane require small size runway");
    }
    public void fly(){
        System.out.println("Fighter plane flies at high height");
    }
}
class Airport{
    public void poly(AeroPlane reff){
        reff.takeOff();
        reff.fly(); 

        System.out.println("-------------------------------------------");
    }
}

public class MethodOverriding {
   public static void main(String[] args) {
    CargoPlane cp = new CargoPlane();
    PassengerPlane pp = new PassengerPlane();
    FighterPlane fp = new FighterPlane();

//    AeroPlane reff;
//    reff = cp;
//    reff.takeOff();

    Airport a = new Airport();
    a.poly(cp);
    a.poly(pp);
    a.poly(fp);

   }
    
    
}
