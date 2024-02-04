package Challenges.level_2;

import java.util.Scanner;

public class ProductOfFloatingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st No : ");
        float numOne = sc.nextFloat();
        System.out.println();
        System.out.print("Enter 2nd No : ");
        float numTwo = sc.nextFloat();

        float product = numOne*numTwo;
        System.out.println("Product : "+product);


        sc.close();
    }
}
