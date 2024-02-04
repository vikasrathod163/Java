package Codes.conditions;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        if(n > 0){
            System.out.println("Number is +ve");
        }
        else{
            System.out.println("Number is -ve or zero");
        }
        sc.close();
    }
}
