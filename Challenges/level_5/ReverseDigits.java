package level_5;

import java.util.Scanner;

public class ReverseDigits {

    public static long reverse(long digit){

        long rev = 0;
        int counter = 10;
        
        while (digit > 0) {
            int temp = (int)digit%10;
            digit = digit/10;
            rev = rev + temp;
            if(digit != 0){
                rev = rev*counter;
            }
        }
        return rev;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Digit Reverser");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        long n = sc.nextLong();
        long reversed = reverse(n);
        System.out.println("Reversed Number is : "+reversed);
        sc.close();
    }
}
