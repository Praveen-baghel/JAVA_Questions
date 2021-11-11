import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a,b;
        int n;
        System.out.println("Enter the String: ");
        a=sc.nextLine();
        System.out.println("Enter the repetition: ");
        n=sc.nextInt();
        System.out.println(a.length());
        b=a.substring(a.length()-n);
                for(int i=0;i<n;i++)
                    System.out.print(b);
    }
}
