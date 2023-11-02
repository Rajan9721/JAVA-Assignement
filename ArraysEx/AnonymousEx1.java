package ArraysEx;


class Demo{
    int total = 0;
    public void sum(int[] a){
       for (int s : a){
        total += s;
       }
       System.out.println("Sum is: "+total);
    }
}

public class AnonymousEx1 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.sum(new int[]{10, 15, 20, 30, 40}); // Anonymous array
    }
}
