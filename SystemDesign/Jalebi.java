package SystemDesign;

public class Jalebi {
    private static Jalebi jalebi;
    private Jalebi(){

    }
    public static Jalebi getJalebi(){
        if(jalebi == null){
            jalebi = new Jalebi();
        }
        return jalebi;
    }
}
class Test{
    public static void main(String[] args){
//        Jalebi jalebi1 = new Jalebi();
        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());
//        System.out.println(jalebi1);


        Jalebi jalebi2 = Jalebi.getJalebi();
        System.out.println(jalebi2.hashCode());
    }
}
