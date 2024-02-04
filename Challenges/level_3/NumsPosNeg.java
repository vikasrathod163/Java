package Challenges.level_3;

import java.util.Scanner;

public class NumsPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();

        if(n > 0){
            System.out.println("Entered Number is +ve");
        }
        else if(n < 0){
            System.out.println("Entered Number is -ve");
        }
        else{
            System.out.println("Entered Number is Zero");
        }
        sc.close();
    }
}
