package Constructor;

public class DefaultConstructor {

    String name;
    int age;

    DefaultConstructor(){
        name = "Rajan Rajbhar";
        age = 22;
    }
    public static void main(String[] args) {

        DefaultConstructor d = new DefaultConstructor(); // constructor is call when object is created
        System.out.println("Name : "+d.name);
        System.out.println("Age : "+d.age);

    }
}
