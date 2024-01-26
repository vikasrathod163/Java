package Java.Codes.Basics;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        float b;
        String c;

        System.out.print("Enter an Integer number : ");
        a = sc.nextInt();
        System.out.print("\nEnter Floating point number : ");
        b = sc.nextFloat();
        System.out.print("\nEnter Your Name : ");
        c = sc.next();

        System.out.println("Int : "+a+"\nFloat : "+b+"\nString : "+c);

    }
}
