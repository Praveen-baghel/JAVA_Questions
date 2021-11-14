class Point{
    private int x,y;
    public Point(){
        x=10;
        y=15;
    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
}
public class Q16 {
    public static void main(String[] args) {
        Point a=new Point();
        Point b=new Point(10,12);
        Point c=new Point();
        c.setX(1);
        c.setY(2);
        Point d=new Point();
        d.setXY(2,5);
    }
}