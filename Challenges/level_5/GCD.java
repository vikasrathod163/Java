package Challenges.level_5;

import java.util.Scanner;

public class GCD {

    public static int least(int a,int b){
        if(a > b){
            return b;
        }
        else{
            return a;
        }
    }

    public static int gdc(int num1,int num2){
        int gdc = 1;
        int min = least(num1,num2);
        for(int i = 2;i <=min;i++){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
        return gdc;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to GDC");
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        sc.close();
        int gcd =  gdc(a, b);
        System.out.println("Greatest Common Devider is : "+gcd);
       
    }
}
