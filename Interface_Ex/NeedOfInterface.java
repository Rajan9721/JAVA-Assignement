package Interface_Ex;

//class Computer{
//    public void compileCode(){
//
//    }
//}

interface Computer{
    void compileCode();
}

class Laptop implements Computer{
    public void compileCode(){
        System.out.println("You got 5 errors..");
    }
}

class Desktop implements Computer{
    public void compileCode(){
        System.out.println("You got 5 errors! faster..");
    }
}
class Developer{
//    Laptop lap = new Laptop();
    void buildApp(Computer obj){
        System.out.println("Building application..");
//        Laptop lap = new Laptop();
        obj.compileCode();
    }
}

public class NeedOfInterface {
    public static void main(String[] args) {
//        Laptop lap = new Laptop();
//        Desktop desk = new Desktop();
        Computer cap = new Laptop();
        Developer obj = new Developer();
        obj.buildApp(cap);

    }

}
