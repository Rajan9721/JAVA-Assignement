package Inheritance;

class Demo12{
    String name;
    int age;
    public void std(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void disp(){
        System.out.println("Demo class");
        System.out.println("Name "+name+ " and age "+age);
    }
}
class Student extends Demo12{

}
public class Single {
    public static void main(String[] args) {
        Student s = new Student();
        s.std("Rohan", 22);
        s.disp();
    }
    
}
