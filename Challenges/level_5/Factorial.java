package Challenges.level_5;

import java.util.Scanner;

public class Factorial {

    public static long fact(int n){
        int fact = 1;
        for(int i = 1;i <= n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Factorial Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();

        System.out.println(fact(n));

        sc.close();
    }
}
