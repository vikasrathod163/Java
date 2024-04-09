package level_3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("Entered Number is Even");
        }
        else{
            System.out.println("Entered Number is Odd");
        }
        sc.close();
    }
}
