package Java_PPT_Program;


class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void eat(){System.out.println("Eating bread...");}
}
class Cat extends Animal{
    void eat(){System.out.println("Eating milk...");}
}

public class RunTimePoly{
    public static void main(String[] args){
        Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
    }
}

