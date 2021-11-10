import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter original fees amount greater than 50000: ");
        int a=sc.nextInt();
        System.out.println("Enter amount to be deposit: ");
        int b=sc.nextInt();
        float fixedamount=10000f+(15.0f*(float)a/100.0f);
        System.out.print("Final fees is Rs:");
        if(b>=a/2){
            float c= (float)a - ((5.0f * a) / 100.0f);
            System.out.println(c+fixedamount);
        }
        else
            System.out.println(b+fixedamount);

    }
}