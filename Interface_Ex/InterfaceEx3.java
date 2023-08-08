package Interface_Ex;

interface sampleInterface{
    public void demo();
    default void display() {
        System.out.println("This is a default method");
    }
}
public class InterfaceEx3 implements sampleInterface{
    public void demo() {
        System.out.println("This is the implementation of the demo method");
    }
    public static void main(String args[]) {
        InterfaceEx3 obj = new InterfaceEx3();
        obj.demo();
        obj.display();
    }
}
