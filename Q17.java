class Box{
    int l,b;
    Box(int l,int b){
        this.l=l;
        this.b=b;
    }
    public int area(){
        return 2*(l+b);
    }
    public int volume(){
        return l*b;
    }
}
class Box3d extends Box{
    int h;
    Box3d(int l,int b,int h){
        super(l,b);
        this.h=h;
    }
    public int area(){
        return 2*(l*b+b*h+h*l);
    }
    public int volume(){
        return l*b*h;
    }
}
public class Q17{
    public static void main(String[] args) {
        Box3d a=new Box3d(10,12,32);
        Box b=new Box(25,56);
        System.out.println("Area and Volume of Box: "+b.area()+"  "+b.volume());
        System.out.println("Area and Volume of Box3d: "+a.area()+"  "+a.volume());
    }
}