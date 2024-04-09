package level_3;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();

        System.out.print("Enter any Number : ");
        int c = sc.nextInt();

        System.out.println();
        System.out.println("A - "+a+" B - "+b+" C - "+c);

        if(a > b && a > c){
            System.out.println("A - is Greater");
        }
        else if(b > c){
            System.out.println("B - is Greater");
        }else{
            System.out.println("C - is Greater");
        }

        sc.close();
    }
}
