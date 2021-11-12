class Person{

}
class Student{

}
class Teacher extends Person{
    int salary;
    String subject;
    Teacher(int salary,String subject){
        this.salary=salary;
        this.subject=subject;
    }
}
class CollegeStudent extends Student{
    int year;
    String major;
    CollegeStudent(int year,String major){
        this.year=year;
        this.major=major;
    }
}
public class Q10 {
    public static void main(String[] args) {
        Teacher obj1=new Teacher(50000,"Object Oriented Programming.");
        CollegeStudent obj2=new CollegeStudent(2,"Communication.");
        System.out.println("Salary:"+obj1.salary+"  Subject:"+obj1.subject);
        System.out.println("Year:"+obj2.year+"  Major Subject:"+obj2.major);
    }
}