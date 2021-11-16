import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        boolean a=false,f=false,h=false,l=false;
        while(sum<=2000){
            System.out.println("######MENU######");
            System.out.println("1-AC");
            System.out.println("2-Fan");
            System.out.println("3-Home Theatre");
            System.out.println("4-Light");
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();
            if (ch==1)
                a=!a;
            else if(ch==2)
                f=!f;
            else if(ch==3)
                h=!h;
            else if (ch==4)
                l=!l;
            else
                System.out.println("Invalid choice.");
            if(a)
                sum+=1200;
            else if(f)
                sum+=400;
            else if(h)
                sum+=600;
            else if (l)
                sum+=100;
            if(sum>2000)
                System.out.println("Overload.");
            sc.nextLine();
        }
    }
}