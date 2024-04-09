package level_4;

import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("- Bitwise OR -");

        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();

        System.out.println("Bitwise OR : "+(a|b));
        sc.close();
    }
}
