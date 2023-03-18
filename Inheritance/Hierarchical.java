package Inheritance;

class MotorCycle{
    public void parts(){
        System.out.println("Parts are available");
    }

}
class Hero extends MotorCycle{

}
class Honda extends MotorCycle{

}
class Yamaha extends MotorCycle{

}

public class Hierarchical {
    public static void main(String[] args) {
        Hero he = new Hero();
        he.parts();

        Honda ho = new Honda();
        ho.parts();

        Yamaha y = new Yamaha();
        y.parts();
    }
    
}
