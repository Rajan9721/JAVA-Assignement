package Thread;
class Car implements Runnable{
    synchronized public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" Has entered the parking lot.");
            Thread.sleep(1000);
           
            System.out.println(Thread.currentThread().getName()+" Got into car to drive.");
            Thread.sleep(1000);
           
            System.out.println(Thread.currentThread().getName()+" Started to drive car.");
            Thread.sleep(1000);
           
            System.out.println(Thread.currentThread().getName()+" Came back and parked the car.");

        }
        catch(Exception e){
            System.out.println("Something is wrong");
        }
        
    }

    // public void run(){  // without synchronized keyword.
    //     try{
    //         System.out.println(Thread.currentThread().getName()+" Has entered the parking lot.");
    //         Thread.sleep(1000);
           
    //         System.out.println(Thread.currentThread().getName()+" Got into car to drive.");
    //         Thread.sleep(1000);
           
    //         System.out.println(Thread.currentThread().getName()+" Started to drive car.");
    //         Thread.sleep(1000);
           
    //         System.out.println(Thread.currentThread().getName()+" Came back and parked the car.");

    //     }
    //     catch(Exception e){
    //         System.out.println("Something is wrong");
    //     }
        
    // }
}
public class Synchronized {
   public static void main(String[] args) throws Exception {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        
        t1.start();
        // t1.join();
        t2.start();
        // t2.join();
        t3.start();

       System.out.println(Thread.currentThread().getName()+" Has been End");

        
   }
    
}
