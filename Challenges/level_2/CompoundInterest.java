package level_2;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int amount = sc.nextInt();
        System.out.print("Enter the Interest Rate : ");
        float rate = sc.nextFloat();
        System.out.print("Enter total duration for interest in year : ");
        int year = sc.nextInt();

        double interest = amount*(1+rate/100)*year;

        System.out.println("Total Interest : "+interest);
        System.out.println("Total amount to be returned : "+(amount+interest));
        sc.close();
    }
}
