package Challenges.level_2;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of side A : ");
        float A = sc.nextFloat();
        System.out.print("Enter value of side B : ");
        float B = sc.nextFloat();
        System.out.print("Enter value of side C : ");
        float C = sc.nextFloat();
        System.out.print("Enter value of side D : ");
        float D = sc.nextFloat();


        float Perimeter = A+B+C+D;
        System.out.println("Perimeter 0f Rectangle : "+Perimeter);




        sc.close();
    }
}
