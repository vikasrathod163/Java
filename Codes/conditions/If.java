package Codes.conditions;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        if(n > 20){
            System.out.println("Number is greater than 20");
        }

        if(n < 20){
            System.out.println("less than 20");
        }

        if(n == 20){
            System.out.println("equals 20");
        }
        sc.close();
    }
}
