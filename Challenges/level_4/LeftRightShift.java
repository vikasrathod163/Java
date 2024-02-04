package Challenges.level_4;

import java.util.Scanner;

public class LeftRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("- Left Shift -");

        System.out.print("Enter a Number : ");
        int a = sc.nextInt();

        System.out.println("After Left Shift by 1 : "+(a<<1));


        System.out.println("- Right Shift -");

        System.out.print("Enter a Number : ");
        int b = sc.nextInt();

        System.out.println("After Right Shift by 1 : "+(b>>1));
        
        sc.close();
    }
}
