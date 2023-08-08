package Interface_Ex;

public interface InterfaceEx1 {
    public void demo();
    public static void display() {
        System.out.println("This is a static method");
    }
}
class InterfaceExample{
    public void demo() {
        System.out.println("This is the implementation of the demo method");
    }
    public static void main(String args[]) {
        InterfaceExample obj = new InterfaceExample();
        obj.demo();
        InterfaceEx1.display();
    }
}