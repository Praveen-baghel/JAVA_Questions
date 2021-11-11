import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b;
        System.out.println("Enter the String: ");
        a=sc.nextLine();
        int n;
        System.out.println("Enter the valve of repetition: ");
        n=sc.nextInt();
        if(a.length()<2)
           for (int i=0;i<n;i++)
               System.out.print(a);
        else
        {
            b=a.substring(0,2);
            for(int i=0;i<n;i++)
                System.out.print(b);
        }
    }
}
