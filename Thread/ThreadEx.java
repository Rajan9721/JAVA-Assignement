package Thread;

class Exapmle1 extends Thread{
    public void run(){
        System.out.println("Thread is running...");
    }
}
public class ThreadEx {
    public static void main(String[] args) {
        Exapmle1 ex = new Exapmle1();
        ex.start();
    }
}
