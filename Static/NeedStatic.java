package Static;


class Student{

    String name;
    int roll;

    static String clgName;

    static int counter = 0;

    Student(String name){
        this.name = name;
        this.roll = setRoll();
    }

    static void setClgName(String name){
        clgName = name;
    }

    static int setRoll(){
        counter++;
        return counter;
    }

    void getStudentInfo(){
        System.out.println("Roll no.: "+this.roll);
        System.out.println("Name : "+this.name);
        System.out.println("College : "+ clgName);
        System.out.println("*******************************************");
    }



}

public class NeedStatic {
    public static void main(String[] args) {
        Student.setClgName("PW Skills");

        Student st1 = new Student("Rajan");
        Student st2 = new Student("Ajay");

        st1.getStudentInfo();
        st2.getStudentInfo();
        
        
    }
    
}
