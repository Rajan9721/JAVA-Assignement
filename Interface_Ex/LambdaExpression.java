package Interface_Ex;

interface Car1{
    public void drive();
}

public class LambdaExpression {
    public static void main(String[] args) {
        Car1 c = new Car1() {
            public void drive(){
                
            }
        };
    }
}
