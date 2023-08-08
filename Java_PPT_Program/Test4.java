package Java_PPT_Program;

abstract class AbstractExample {

    // Abstract method
    abstract void display1();
    abstract void display2();

    // Concrete method
    void show1()
    {
        System.out.println("Concrete method1 of abstract class");
    }
    void show2(){
        System.out.println("Concrete method2 of abstract class");
    }
}

// Subclass of abstract class
class SubClass extends AbstractExample {

    // Implementing the abstract method
    void display1()
    {
        System.out.println("First Abstract method implemented");
    }
    void display2(){
        System.out.println("Second Abstract method implemented");
    }

}

/**
 * Main class
 */
public class Test4 {

    public static void main(String args[]) {
        // Creating an object of the subclass
        SubClass obj = new SubClass();

        // Calling the abstract method
        obj.display1();
        obj.display2();

        // Calling the concrete method
        obj.show1();
        obj.show2();
    }
}
