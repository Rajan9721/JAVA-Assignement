package Interface_Ex;

interface Car{
    void drive();
}
// Normal implementation

//class XUV implements Car{
//    public void show(){
//        System.out.println("Driving...");
//    }
//}

public class AnonymousInnerClass {
   public static void main(String[] args) {
//       Anonymous Inner Class
    Car obj = new Car(){
        public void drive(){
            System.out.println("Driving...");
        }
    };
    obj.drive();
   }
}
