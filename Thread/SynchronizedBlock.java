package Thread;



class Car1 implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" Has entered the parking lot");
            Thread.sleep(500);
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName()+" Got into the car to drive");
                Thread.sleep(500);
    
                System.out.println(Thread.currentThread().getName()+" Stared to drive the car.");
                Thread.sleep(500);
    
                System.out.println(Thread.currentThread().getName()+" Came back and parcked the car.");
            }
           

        }catch(Exception e){
            System.out.println("Some problem");
        }
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        Car1 c1 = new Car1();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c1);
        Thread t4 = new Thread(c1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        
    }

    
}
