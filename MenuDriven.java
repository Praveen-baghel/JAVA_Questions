import java.util.Scanner;


class Methods{
    public void factorial(int n){
        int i=1;
        long f=1;
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println("Factorial is: "+f+"\n");
    }

    public void prime(int n){
        int i;
        int count=0;
        if(n==1)
            System.out.println("Neither Prime nor Composite.\n");
        else if(n==2)
            System.out.println("Prime.\n");
        else{
            for(i=1;i<=n;i++)
                if(n%i==0){
                    count++;
                }
            if(count==2)
                System.out.println("Prime.\n");
            else
                System.out.println("Not Prime.\n");
        }
    }
    public void fibonacci(int n){
        int a=0,b=1,c=0,i=0;
        for(i=0;i<n;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
    }
}


public class MenuDriven {
    public static void main(String[] args) {
        Methods obj=new Methods();
        String a="Y";
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("\n########MENU########");
            System.out.println("1-Find Factorial");
            System.out.println("2-Fibonacci Series");
            System.out.println("3-Check Prime or Not Prime");
            System.out.println("Enter your choice(1-3)");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.print("Enter the number: ");
                int n=sc.nextInt();
                obj.factorial(n);
            }
            else if(ch==3)
            {
                System.out.print("Enter the number: ");
                int n=sc.nextInt();
                obj.prime(n);
            }
            else if(ch==2)
            {
                System.out.print("Enter the limit: ");
                int n=sc.nextInt();
                obj.fibonacci(n);
            }
            else
                System.out.println("Invalid Choice.");
            sc.nextLine();
            System.out.println("Do you want to continue('Y/N')");
            a=sc.nextLine();
        }while (a.equals("Y")||a.equals("y"));
    }
}
