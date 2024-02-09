package Challenges.level_5;

import java.util.Scanner;

public class Patterns_1 {

    public static void p1(int n){
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p2(int n){
        for(int i = n;i > 0;i--){
            for(int j = 0;j < i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p3(int n){
        int cnt = 1;
        for(int p = 0;p < n;p++){
            
            for(int i = 0;i < n-cnt;i++){
                System.out.print("  ");
            }
            for(int j = 1;j <= cnt;j++){
                System.out.print(" *");
            }
            System.out.println();
            cnt++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Patterns");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("\t\tPattern 1");
        p1(n);
        System.out.println("\t\tPattern 2");
        p2(n);
        System.out.println("\t\tPattern 3");
        p3(n);
    }
}
