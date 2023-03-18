package Inheritance;

class Animal{
    public void sleep(){
        System.out.println("Animals are sleeping");
    }
}
class Dog extends Animal{

}
class Cat extends Dog{

}
public class Multilevel {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sleep();
    }
    
}
