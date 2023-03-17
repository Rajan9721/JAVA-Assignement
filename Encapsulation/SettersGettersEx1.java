package Encapsulation;

class Demo1{
    private int age;
    private String name;
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void show(){
        System.out.println(getName()+" "+getAge());
    }
}

public class SettersGettersEx1 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.setName("Rajan");
        d.setAge(22);
        d.show();
        d.setAge(23);
        d.setName("Navin");
        d.show();
        d.setAge(24);
        d.setName("Akash");
        d.show();
        d.setAge(33);
        d.setName("Navin Sir");
        d.show();

        d.setName("Rajan");
        d.setAge(22);
        String n = d.getName();
        int a = d.getAge();

        System.out.println(n+" "+a);
    }
    
}
