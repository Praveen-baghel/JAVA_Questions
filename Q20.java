class Car{
    String manufacturer;
    int price;
    Car(String a,int b){
        manufacturer=a;
        price=b;
    }
}
public class Q20 {
    public static void main(String[] args) {
        Car a = new Car("Tesla", 10000000);
        Car b = new Car("Buggati", 100000000);
        Car c = new Car("Rolls Royce", 25000000);
        if (a.price > b.price) {
            if (b.price > c.price) {
                System.out.println(a.manufacturer + "   " + a.price);
                System.out.println(b.manufacturer + "   " + b.price);
                System.out.println(c.manufacturer + "   " + c.price);
            } else {
                System.out.println(a.manufacturer + "   " + a.price);
                System.out.println(c.manufacturer + "   " + c.price);
                System.out.println(c.manufacturer + "   " + c.price);
            }
        }
        else if (b.price > a.price) {
            if (a.price > c.price) {
                System.out.println(b.manufacturer + "   " + b.price);
                System.out.println(a.manufacturer + "   " + a.price);
                System.out.println(c.manufacturer + "   " + c.price);
            } else {
                System.out.println(b.manufacturer + "   " + b.price);
                System.out.println(c.manufacturer + "   " + c.price);
                System.out.println(a.manufacturer + "   " + a.price);
            }
        }
        else{
            if(a.price>b.price){
                System.out.println(c.manufacturer+"   "+c.price);
                System.out.println(a.manufacturer+"   "+a.price);
                System.out.println(b.manufacturer+"   "+b.price);
            }
            else{
                System.out.println(c.manufacturer+"   "+c.price);
                System.out.println(b.manufacturer+"   "+b.price);
                System.out.println(a.manufacturer+"   "+a.price);
            }
        }
    }

}