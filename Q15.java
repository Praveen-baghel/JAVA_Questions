class Outer{
    public void display(){
        System.out.println("Outer class.");
    }
    class Inner{
        public void display(){
            System.out.println("Inner class.");
        }
    }
}
public class Q15 {
    public static void main(String[] args) {
        Outer a=new Outer();
        a.display();
        Outer.Inner b=a.new Inner();
        b.display();
    }
}