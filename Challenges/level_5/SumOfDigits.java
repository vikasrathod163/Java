package Challenges.level_5;

import java.util.Scanner;

public class SumOfDigits {

    public static int sum(int digit){
        int s = 0;
        int a;

        while(digit > 0){
            a = digit%10;
            s = s+a;
            digit = digit/10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();

        System.out.println(sum(n));

        sc.close();
    }
}
