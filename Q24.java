class Student2{
    String name,address;
    int age;
    Student2(){
        name="unknown";
        address="not available";
        age=0;
    }
    public void setInfo(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("name: "+this.name+"  age: "+this.age);
    }
    public void setInfo(int age,String name,String address ){
        this.name=name;
        this.address=address;
        this.age=age;
        System.out.println("name: "+this.name+"   age: "+this.age+"   address:"+this.address);
    }
}
public class Q24 {
    public static void main(String[] args) {
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        Student2 s3=new Student2();
        Student2 s4=new Student2();
        Student2 s5=new Student2();
        s1.setInfo("s1",12);
        s2.setInfo(12,"s2","A");
        s3.setInfo(13,"s3","B");
        System.out.println("name: "+s4.name+"   age: "+s4.age+"   address: "+s4.address);
        s5.setInfo("s5",12);
    }
}