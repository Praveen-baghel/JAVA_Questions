package automobile;
abstract class Vehicle{
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String ownerName();
}
class Hero extends Vehicle{
    @Override
    public String getModelName() {
        return "Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "22002321";
    }

    @Override
    public String ownerName() {
        return "Aliens";
    }
     public int getSpeed(){
        return 90;
     }
     public void cdplayer(){
         System.out.println("CD player running.");
     }
}

public class Q9 {
    public static void main(String[] args) {
        Hero obj=new Hero();
        System.out.println(obj.getModelName());
        System.out.println(obj.getRegistrationNumber());
        System.out.println(obj.ownerName());
        System.out.println(obj.getSpeed());
        obj.cdplayer();
    }
}
