package Constructor;



class Student{
    int a = 10;
    int Student(){
        return a;
    }
}

public class PrivateConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.Student();
    }

    
}
