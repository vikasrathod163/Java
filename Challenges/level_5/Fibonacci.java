package Challenges.level_5;

import java.util.Scanner;

public class Fibonacci {

    public static void fib(int n){
        if(n < 2){
            System.out.print("0");
            return;
        }
        int f1 = 0;
        int f2 = 1;
        System.out.print(f1+" "+f2);
        int i = 2;
        int f3;
        while (i < n) {
            f3 = f1+f2;
            System.out.print(" "+f3);
            f1 = f2;
            f2 = f3;
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Series Printer");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        int n = sc.nextInt();
        sc.close();
        fib(n);
    }
}
