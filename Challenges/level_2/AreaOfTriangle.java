package Challenges.level_2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of Triangle : ");
        float h = sc.nextFloat();
        System.out.print("Enter Breadth of Triangle : ");
        float b = sc.nextFloat();

        float area = 0.5f*b*h;

        System.out.println("Area of Triangle : "+area);
        sc.close();
    }
}
