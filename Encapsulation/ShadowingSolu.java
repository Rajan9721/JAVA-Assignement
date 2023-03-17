package Encapsulation;

class Student1{
    private String name;
    private int age;

    void setData1(int age){
        this.age = age;  
        // shadowing problem solve (this.age = age)
    }
    void setData2(String name){
        this.name = name;
    }
    public void show(){
        System.out.println(name +" "+age); 
    }
}

public class ShadowingSolu {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setData1(22);
        s1.setData2("Rajan");
        s1.show();
    }
    
}
