package level_4;

import java.util.Scanner;

public class EvenOddUsingShifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        
        if((n&1) == 0){
            System.out.println("Given Number is Even.");
        }
        else{
            System.out.println("Given Number is Odd.");
        }

        sc.close();
    }
}
