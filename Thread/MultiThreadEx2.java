package Thread;

public class MultiThreadEx2 implements Runnable{
    public void run()
    {
        System.out.println("My thread is in running state.");
    }
    public static void main(String args[])
    {
        MultiThreadEx2 obj=new MultiThreadEx2();
        Thread Obj =new Thread(obj);
        Obj.start();
    }
}
