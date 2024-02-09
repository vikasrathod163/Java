package Challenges.level_5;

import java.util.Scanner;

public class Armstrong {

    public static boolean arm(int n){
        int cpy = n;
        int num = 0;
        int len = len(n);

        while(n > 0){
            int t = n%10;
            num = num+pow(t,len);
            n = n/10;
        }

        boolean flag;
        
        if(num == cpy){
            flag = true;
        }
        else{
            flag = false;
        }

        return flag;
    }

    public static int pow(int a,int b){
        if(b == 0){
            return 1;
        }
        int p = 1;
        for(int i = 0;i < b;i++){
            p = p*a;
        }
        return p;
    }

    public static int len(int n){
        int cnt = 0;
        while (n > 0) {
            n = n/10;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Armstrong number");
        System.out.print("Enter Any Number : ");
        int num = sc.nextInt();
        sc.close();

        boolean f = arm(num);
        if(f){
            System.out.println("Entered Number is an Armstrong");
        }
        else{
            System.out.println("Entered Number is Not an Armstrong");
        }
    }
}
