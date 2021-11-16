class Student1{
    int p;
    String name;
    Student1(String name,int p){
        this.name=name;
        this.p=p;
    }

}
public class Q23 {
    public static void main(String[] args) {
        Student1 obj1=new Student1("A",99);
        Student1 obj2=new Student1("B",89);
        Student1 obj3=new Student1("C",50);
        if(obj1.p>obj2.p&&obj2.p>obj3.p)
            System.out.println(obj1.name+"   "+obj1.p);
        else if(obj2.p>obj1.p&&obj2.p>obj3.p)
            System.out.println(obj2.name+"   "+obj2.p);
        else
            System.out.println(obj3.name+"   "+obj3.p);

    }
}