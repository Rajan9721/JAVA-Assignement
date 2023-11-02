package Thread;

class MultiThread extends Thread
{
    public void run()
    {
        System.out.println("My thread is in running state.");
    }
    public static void main(String args[])
    {
        MultiThread obj=new MultiThread();
        obj.start();
    }
}
