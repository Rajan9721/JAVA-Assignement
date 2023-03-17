package Encapsulation;

class Student{
    private String name;
    private int age;

    void setData1(int age){
        age = age;  
        // shadowing problem for the solve this problem we use a keyword name - this(this.age = age)
    }
    void setData2(String name){
        name = name;
    }
    public void show(){
        System.out.println(name +" "+age); // printing default value because of shadowing
    }
}

public class ShadowingEx {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData1(22);
        s.setData2("Rajan");
        s.show();
    }
    
}
