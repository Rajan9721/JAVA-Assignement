package Encapsulation;

class Person{

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
public class EncapsulationEx {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Rajan");
        p.setAge(20);

        System.out.println("Name : "+p.getName());
        System.out.println("Age : "+p.getAge());
    }
}
