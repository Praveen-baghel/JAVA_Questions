import java.util.Scanner;

class Member{
    int age;
    String address;
    String name;
    long phone;
    float salary;
    Member(String name,int age,long phone,String address,float salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
        this.salary=salary;
    }
}
class Employee extends Member{
    String specialization;
    String department;
    Employee(String name,int age,long phone,String address,float salary,String specialization,String department) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
        this.department = department;
    }
}
class Manager extends Member{
    String specialization;
    String department;
    Manager(String name,int age,long phone,String address,float salary,String specialization,String department){
        super(name,age,phone,address,salary);
        this.specialization=specialization;
        this.department=department;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details of Employee: ");
        System.out.println();
        System.out.print("Name: ");
        String n1=sc.nextLine();
        System.out.print("Age: ");
        int a1=sc.nextInt();
        System.out.print("Phone Number: ");
        long p1=sc.nextLong();
        sc.nextLine();
        System.out.print("Address: ");
        String ad1=sc.nextLine();
        System.out.print("Salary: ");
        float s1=sc.nextFloat();
        sc.nextLine();
        System.out.print("Specialization: ");
        String sp1=sc.nextLine();
        System.out.print("Department: ");
        String d1=sc.nextLine();
        Employee obj1=new Employee(n1,a1,p1,ad1,s1,sp1,d1);

        System.out.println("Enter details of Manager: ");
        System.out.println();
        System.out.print("Name: ");
        String n2=sc.nextLine();
        System.out.print("Age: ");
        int a2=sc.nextInt();
        System.out.print("Phone Number: ");
        long p2=sc.nextLong();
        sc.nextLine();
        System.out.print("Address: ");
        String ad2=sc.nextLine();
        System.out.print("Salary: ");
        float s2=sc.nextFloat();
        sc.nextLine();
        System.out.print("Specialization: ");
        String sp2=sc.nextLine();
        System.out.print("Department: ");
        String d2=sc.nextLine();
        Manager obj2=new Manager(n2,a2,p2,ad2,s2,sp2,d2);

        System.out.println();
        System.out.println();

        System.out.println("Employee details are: ");
        System.out.println("Name: "+obj1.name);
        System.out.println("Age: "+obj1.age);
        System.out.println("Phone Number: "+obj1.phone);
        System.out.println("Address: "+obj1.address);
        System.out.println("Salary: "+obj1.salary);
        System.out.println("Specialization: "+obj1.specialization);
        System.out.println("Department: "+obj1.department);

        System.out.println();
        System.out.println();

        System.out.println("Manager details are: ");
        System.out.println("Name: "+obj2.name);
        System.out.println("Age: "+obj2.age);
        System.out.println("Phone Number: "+obj2.phone);
        System.out.println("Address: "+obj2.address);
        System.out.println("Salary: "+obj2.salary);
        System.out.println("Specialization: "+obj2.specialization);
        System.out.println("Department: "+obj2.department);
    }
}