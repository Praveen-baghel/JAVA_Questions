import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        System.out.print("Enter the string: ");
        a = sc.nextLine();
        StringBuffer b = new StringBuffer(a);
        StringBuffer c=b;
        if(c.toString().equals((b.reverse()).toString()))
            System.out.println("Palindrome.");
        else
            System.out.println("Not Palindrome.");

    }
}