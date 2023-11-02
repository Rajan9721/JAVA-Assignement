package QueueEx;

public class QueueOp {
    int front, rear, n;
    int arr[];

    QueueOp(int n){
        this.n = n;
        front = 0;
        rear = 0;
        arr = new int[n];
    }
    public void enQueue(int newData){
        if(rear == n){
            System.out.println("Queue is overflow.");
            return;
        }
        else{
            arr[rear] = newData;
            rear++;
        }

    }
    public void display(){
        if(front == 0 && rear == 0){
            System.out.println("Queue is underflow");
            return;
        }
        else{
            for(int i = front; i<rear; i++){
                System.out.print(arr[i]+", ");
            }
        }
    }

    public static void main(String[] args){

        QueueOp queue = new QueueOp(6);
        queue.display();

//  Inserting the element in the queue
        queue.enQueue(5);
//        queue.enQueue(10);
//        queue.enQueue(7);
//        queue.enQueue(4);
//        queue.enQueue(8);
//        queue.enQueue(6);

//  Display the queue
        queue.display();
    }
}
