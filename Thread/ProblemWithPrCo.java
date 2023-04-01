package Thread;

class Queue1{
    int x;
     void put(int n){
        x = n;
        System.out.println("I have produced a value: "+ x );
    }
     void get(){
        System.out.println("I have consumed value: "+ x);
    }
}

class Producer extends Thread
{
    Queue1 q;

    Producer(Queue1 a){
        q = a;
    }
    public void run(){
        int i = 1;
        while(true){
            q.put(i);
            i++;
        }
    }

}



class Consumer extends Thread{
    Queue1 q;
    Consumer(Queue1 b){
        q = b;
    }
    public void run(){
        while(true){
            q.get();
        }

    }
}

public class ProblemWithPrCo {
    public static void main(String[] args) {

        Queue1 obj = new Queue1();

        Producer p1 = new Producer(obj);

        Consumer c1 = new Consumer(obj);

        p1.start();
        c1.start();

        
    }
    
}
