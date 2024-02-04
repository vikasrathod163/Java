package Challenges.level_3;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Year : ");
        int n = sc.nextInt();

        if(n%4 == 0 && n%100 != 0 || n%400 == 0){
            System.out.println("Year is Leap");
        }
        else{
            System.out.println("Year is Not Leap");
        }

        sc.close();
    }
}
