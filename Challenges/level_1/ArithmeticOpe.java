package level_1;

import java.util.Scanner;

public class ArithmeticOpe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No : ");
        int numOne = sc.nextInt();
        System.out.println();
        System.out.print("Enter 2nd No : ");
        int numTwo = sc.nextInt();

        System.out.println();

        System.out.println("Addition : "+(numOne+numTwo));
        System.out.println("Substraction : "+(numOne-numTwo));
        System.out.println("Multiplication : "+(numOne*numTwo));
        System.out.println("Division : "+(numOne/numTwo));

        sc.close();
    }
}
