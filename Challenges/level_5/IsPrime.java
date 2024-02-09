package Challenges.level_5;

import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int n){
        boolean result = true;
        if(n <= 1){
            result = false;

        }
        

        for(int i = 2;i < n;i++){
            if(n%i == 0){
                result = false;
                return result;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Prime number tester");
        System.out.print("Enter any Number : ");
        int num = sc.nextInt();
        sc.close();
        boolean res = isPrime(num);

        if(res){
            System.out.println("Entered Number is Prime....");
        }
        else{
            System.out.println("Entered Number is Not Prime....");
        }
    }
}
