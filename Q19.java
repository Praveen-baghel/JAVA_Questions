import java.util.Random;

abstract class Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{
    @Override
    public String notice() {
        return "First Compartment.";
    }
}
class Ladies extends Compartment{
    @Override
    public String notice() {
        return  "Ladies Compartment.";
    }
}
class General extends Compartment{
    @Override
    public String notice() {
        return "General Compartment.";
    }
}
class Luggage extends Compartment{
    @Override
    public String notice() {
        return "Luggage Compartment.";
    }
}
public class Q19 {
    public static void main(String[] args) {
        Compartment arr[]=new Compartment[10];
        Random r =new Random();
        for(int i=0;i<10;i++){
            int a=1+r.nextInt(4);
            System.out.println(a);
            if(a==1)
                arr[i]=new FirstClass();
            else if(a==2)
                arr[i]=new Ladies();
            else if(a==3)
                arr[i]=new General();
            else if(a==4)
                arr[i]=new Luggage();
        }
        for(int i=0;i<10;i++)
            System.out.println(arr[i].notice());
    }
}
