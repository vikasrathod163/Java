package level_4;

import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("- Bitwise XOR -");

        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();

        System.out.println("Bitwise XOR : "+(a^b));

        sc.close();
    }
}
