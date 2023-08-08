package Interface_Ex;

interface MyInterface {
    public abstract void demo();
    public default void defaultMethod() {
        privateMethod();
        staticPrivateMethod();
        System.out.println("This is a default method of the interface");
    }

    public static void staticMethod() {
        staticPrivateMethod();
        System.out.println("This is a static method of the interface");
    }

    private void privateMethod(){
        System.out.println("This is a private method of the interface");
    }

    private static void staticPrivateMethod(){
        System.out.println("This is a static private method of the interface");
    }
}

public class InterfaceEx2 implements MyInterface {
    public void demo() {
        System.out.println("Implementation of the demo method");
    }

    public static void main(String[] args){
        InterfaceEx2 obj = new InterfaceEx2();
        obj.defaultMethod();
        obj.demo();
        MyInterface.staticMethod();
//        obj.privateMethod();
    }
}
